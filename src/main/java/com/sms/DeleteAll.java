package com.sms;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteAll {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:oracle:thin:@//localhost:1521/XE";
        String username = "SYSTEM";
        String password = "root";

        int batchSize = 1000;
        int totalDeleted = 0;

        try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password)) {
            conn.setAutoCommit(false);  // Optional: enables rollback if needed

            String sql = "DELETE FROM F_IDIT_DW000 WHERE ROWNUM <= ?";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                while (true) {
                    pstmt.setInt(1, batchSize);
                    int deleted = pstmt.executeUpdate();
                    conn.commit(); // Commit each batch
                    totalDeleted += deleted;

                    System.out.println("Deleted " + deleted + " rows...");

                    if (deleted < batchSize) {
                        // No more rows to delete
                        break;
                    }
                }
                System.out.println("Finished deleting. Total rows deleted: " + totalDeleted);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
