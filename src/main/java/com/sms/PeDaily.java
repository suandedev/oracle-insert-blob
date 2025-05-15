package com.sms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PeDaily {

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

//        String recid = "171692666879255.050002.050010";
//        String xml = "<row id=\"171692666879255.050010\" xml:space=\"preserve\">"
//                + "<c1>LD1410793579</c1><c2>ID0010579</c2><c3>4913291</c3><c4>CRP</c4>"
//                + "<c5>LD.1.TR.IDR.21053.IJREG.0001..9000........ID0010579.LIVEDB</c5>"
//                + "<c6>20220403</c6><c6 m=\"6\">4913291</c6><c8>3000894</c8><c9>1</c9>"
//                + "<c10>21053</c10><c11>20150103</c11><c12>IDR</c12><c16>TR</c16>"
//                + "<c17>LD1410793579</c17><c20>1</c20><c22>882020</c22><c23>LD1410793579</c23>"
//                + "<c24>LD</c24><c25>20150103</c25><c30>41_T24PBDCO</c30><c31>1501022200</c31>"
//                + "<c32>41_T24PBDCO</c32><c41>21053</c41><c43>01</c43><c45>MANUAL</c45>"
//                + "<c46>20150103</c46><c47>PR</c47><c48>-4913291</c48><c49>-621590275</c49>"
//                + "<c50>9.5</c50><c82>-4913291</c82><c83>IDR</c83><c84>1.000000000</c84>"
//                + "<c91>REDEFAULT</c91><c98></c98></row>";

        String sql = "INSERT INTO SYSTEM.F_IDIH_LD_PE_DAILY#HIS (RECID, XMLRECORD) VALUES (?, XMLType(?))";

        // Prepare insert
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, recid);
        pstmt.setString(2, xml);

        // Execute
        int rows = pstmt.executeUpdate();
        System.out.println("Rows inserted: " + rows);
    }
}
