package com.sms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class LDHis {
    public static void insertRecord(String recid, String xml) throws Exception {
        String jdbcUrl = "jdbc:oracle:thin:@//localhost:1521/XE";  // Replace with your Oracle DB info
        String username = "system";
        String password = "root";

        Connection conn = null;
        PreparedStatement pstmt = null;
        // Load JDBC driver
        Class.forName("oracle.jdbc.driver.OracleDriver");

        // Connect
        conn = DriverManager.getConnection(jdbcUrl, username, password);
        String sql = "INSERT INTO SYSTEM.FBNK_LD_L001 (RECID, XMLRECORD) VALUES (?, XMLType(?))";

        // Prepare insert
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, recid);
        pstmt.setString(2, xml);

        // Execute
        int rows = pstmt.executeUpdate();
        System.out.println("Rows inserted: " + rows);
    }
}
