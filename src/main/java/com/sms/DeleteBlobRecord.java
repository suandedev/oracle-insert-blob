package com.sms;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteBlobRecord {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:oracle:thin:@//localhost:1521/XE"; // Adjust for your DB
        String username = "SYSTEM";
        String password = "root";
        String recidToDelete = "REC_1"; // Replace with the RECID to delete

        try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password)) {
            String sql = "DELETE FROM F_IDIT_DW000 WHERE RECID = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, recidToDelete);
                int rowsDeleted = pstmt.executeUpdate();
                if (rowsDeleted > 0) {
                    System.out.println("Record with RECID '" + recidToDelete + "' deleted successfully.");
                } else {
                    System.out.println("No record found with RECID '" + recidToDelete + "'.");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
