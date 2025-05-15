package com.sms;
import java.io.InputStream;
import java.sql.*;

public class ReadBlobFromOracle {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:oracle:thin:@//localhost:1521/XE"; // Adjust as needed
        String username = "SYSTEM";
        String password = "root";
        String recid = "TEST_REC_0012"; // The RECID you want to read

        try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password)) {
            String sql = "SELECT XMLRECORD FROM F_IDIT_DW000 WHERE RECID = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, recid);

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                Blob xmlBlob = rs.getBlob("XMLRECORD");

                try (InputStream inputStream = xmlBlob.getBinaryStream()) {
                    byte[] buffer = new byte[(int) xmlBlob.length()];
                    inputStream.read(buffer);

                    // Convert byte[] to String (assuming UTF-8 encoded XML)
                    String xmlContent = new String(buffer, "UTF-8");
                    System.out.println("XML Content:");
                    System.out.println(xmlContent);
                }
            } else {
                System.out.println("No record found for RECID: " + recid);
            }

            rs.close();
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
