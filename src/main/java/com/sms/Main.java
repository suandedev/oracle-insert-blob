package com.sms;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:oracle:thin:@//localhost:1521/XE"; // Change host, port, service
        String username = "SYSTEM"; // Use appropriate user
        String password = "root"; // Use correct password
        String recid = "30"; // Your custom RECID
        String filePath = "C:\\Users\\62853\\Downloads\\ORABLOB\\src\\main\\resources\\sample.xml"; // Full path to XML file

        try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
             FileInputStream fis = new FileInputStream(new File(filePath))) {

            String sql = "INSERT INTO F_IDIT_DW000 (RECID, XMLRECORD) VALUES (?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, recid);
            pstmt.setBinaryStream(2, fis, fis.available()); // Stream file as BLOB

            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("BLOB inserted successfully!");
            }

            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
