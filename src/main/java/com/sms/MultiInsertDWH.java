package com.sms;
import java.io.*;
import java.sql.*;

public class MultiInsertDWH {
    private static final int BATCH_SIZE = 500;
    private static final int TOTAL_RECORDS = 10000;
    private static final String FILE_PATH = "C:\\Users\\62853\\Downloads\\ORABLOB\\src\\main\\resources\\sample.xml";

    public static void main(String[] args) {
        String jdbcUrl = "jdbc:oracle:thin:@//localhost:1521/XE";
        String username = "SYSTEM";
        String password = "root";

        try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password)) {
            conn.setAutoCommit(false); // Disable auto-commit

            String sql = "INSERT INTO F_IDIT_DW000 (RECID, XMLRECORD) VALUES (?, ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

                for (int i = 1; i <= TOTAL_RECORDS; i++) {
                    String recid = "RECSss_" + i;

                    // Read the same file each time (for demo purposes)
                    File xmlFile = new File(FILE_PATH);
                    FileInputStream fis = new FileInputStream(xmlFile);

                    pstmt.setString(1, recid);
                    pstmt.setBinaryStream(2, fis, (int) xmlFile.length());
                    pstmt.addBatch();

                    fis.close();

                    if (i % BATCH_SIZE == 0) {
                        pstmt.executeBatch();
                        conn.commit();
                        System.out.println("Inserted batch up to: " + i);
                    }
                }

                // Insert remaining
                pstmt.executeBatch();
                conn.commit();
                System.out.println("All records inserted.");

            } catch (Exception e) {
                conn.rollback();
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
