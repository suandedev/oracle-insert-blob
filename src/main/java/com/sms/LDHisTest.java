package com.sms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class LDHisTest {

    StringBuilder xmlBuilder = new StringBuilder();

    @Test
    public void SingleInsertTest(){
        xmlBuilder.append("<row id='LD1410793831;1' xml:space='preserve'>");
        xmlBuilder.append("<c1>3001402</c1>");
        xmlBuilder.append("<c2>IDR</c2>");
        xmlBuilder.append("<c3>1</c3>");
        xmlBuilder.append("<c4>2593590047.00</c4>");
        xmlBuilder.append("<c5>ID</c5>");
        xmlBuilder.append("<c6>20140330</c6>");
        xmlBuilder.append("<c7>20180130</c7>");
        xmlBuilder.append("<c8>8203.01</c8>");
        xmlBuilder.append("<c11>21053</c11>");
        xmlBuilder.append("<c12>IDR1499900040497</c12>");
        xmlBuilder.append("<c13>1</c13>");
        xmlBuilder.append("<c14>S</c14>");
        xmlBuilder.append("<c15>1</c15>");
        xmlBuilder.append("<c16>7.88</c16>");
        xmlBuilder.append("<c23>NO</c23>");
        xmlBuilder.append("<c24>17031241.00</c24>");
        xmlBuilder.append("<c33>1</c33>");
        xmlBuilder.append("<c44>MANUAL</c44>");
        xmlBuilder.append("<c52>TR</c52>");
        xmlBuilder.append("<c64>NORMAL</c64>");
        xmlBuilder.append("<c65>1</c65>");
        xmlBuilder.append("<c67>1000000000022531</c67>");
        xmlBuilder.append("<c72>1000000000022531</c72>");
        xmlBuilder.append("<c78>1000000000022531</c78>");
        xmlBuilder.append("<c79>1</c79>");
        xmlBuilder.append("<c81>NO</c81>");
        xmlBuilder.append("<c84>20140330</c84>");
        xmlBuilder.append("<c86>ID</c86>");
        xmlBuilder.append("<c87>ID</c87>");
        xmlBuilder.append("<c89>AUTOMATIC</c89>");
        xmlBuilder.append("<c90>CUR</c90>");
        xmlBuilder.append("<c101>2593590047.00</c101>");
        xmlBuilder.append("<c104>2593590047</c104>");
        xmlBuilder.append("<c106>0</c106>");
        xmlBuilder.append("<c110>100</c110>");
        xmlBuilder.append("<c111>NO</c111>");
        xmlBuilder.append("<c112>100</c112>");
        xmlBuilder.append("<c113>2593590047.00</c113>");
        xmlBuilder.append("<c115>NO</c115>");
        xmlBuilder.append("<c123>1000000000022531</c123>");
        xmlBuilder.append("<c134>20140330</c134>");
        xmlBuilder.append("<c145>NO</c145>");
        xmlBuilder.append("<c146>NO</c146>");
        xmlBuilder.append("<c147>AMORT</c147>");
        xmlBuilder.append("<c153>1010</c153>");
        xmlBuilder.append("<c153 m='2'>2010</c153>");
        xmlBuilder.append("<c154>D20140418479975965200</c154>");
        xmlBuilder.append("<c154 m='2'>D20140418479975965201</c154>");
        xmlBuilder.append("<c159>NO</c159>");
        xmlBuilder.append("<c160>Y</c160>");
        xmlBuilder.append("<c167 m='13'>60</c167>");
        xmlBuilder.append("<c167 m='103'>0.00</c167>");
        xmlBuilder.append("<c167 m='107'>0.00</c167>");
        xmlBuilder.append("<c167 m='120'>IJREG</c167>");
        xmlBuilder.append("<c167 m='132'>1</c167>");
        xmlBuilder.append("<c167 m='145'>19831</c167>");
        xmlBuilder.append("<c167 m='156'>0.00</c167>");
        xmlBuilder.append("<c167 m='157'>0.00</c167>");
        xmlBuilder.append("<c167 m='159'>0.00</c167>");
        xmlBuilder.append("<c167 m='167'>0.00</c167>");
        xmlBuilder.append("<c167 m='172'>1</c167>");
        xmlBuilder.append("<c167 m='189'>3240000000.00</c167>");
        xmlBuilder.append("<c167 m='219'>DEPX</c167>");
        xmlBuilder.append("<c167 m='220'>12</c167>");
        xmlBuilder.append("<c167 m='225'>+</c167>");
        xmlBuilder.append("<c167 m='234'>1-Bank Permata</c167>");
        xmlBuilder.append("<c167 m='240'>20140430</c167>");
        xmlBuilder.append("<c167 m='242'>Yes</c167>");
        xmlBuilder.append("<c167 m='244'>0.00</c167>");
        xmlBuilder.append("<c167 m='246'>Single</c167>");
        xmlBuilder.append("<c167 m='247'>36</c167>");
        xmlBuilder.append("<c167 m='248'>7.88</c167>");
        xmlBuilder.append("<c167 m='251'>20160130</c167>");
        xmlBuilder.append("<c167 m='252'>Fixed</c167>");
        xmlBuilder.append("<c167 m='253'>3</c167>");
        xmlBuilder.append("<c167 m='254'>12.00</c167>");
        xmlBuilder.append("<c167 m='255'>Angsur</c167>");
        xmlBuilder.append("<c167 m='257'>10</c167>");
        xmlBuilder.append("<c167 m='258'>20160130</c167>");
        xmlBuilder.append("<c167 m='261'>20130130</c167>");
        xmlBuilder.append("<c167 m='262'>0.00</c167>");
        xmlBuilder.append("<c167 m='263'>4106961811</c167>");
        xmlBuilder.append("<c167 m='283'>IJ00019Y</c167>");
        xmlBuilder.append("<c167 m='310'>SA</c167>");
        xmlBuilder.append("<c167 m='314'>50</c167>");
        xmlBuilder.append("<c167 m='315'>176</c167>");
        xmlBuilder.append("<c167 m='321'></c167>");
        xmlBuilder.append("<c197>NO</c197>");
        xmlBuilder.append("<c200>YES</c200>");
        xmlBuilder.append("<c204>1</c204>");
        xmlBuilder.append("<c205>MID</c205>");
        xmlBuilder.append("<c207>NO</c207>");
        xmlBuilder.append("<c208>NO</c208>");
        xmlBuilder.append("<c217>01</c217>");
        xmlBuilder.append("<c218>NO</c218>");
        xmlBuilder.append("<c226>99</c226>");
        xmlBuilder.append("<c237>C</c237>");
        xmlBuilder.append("<c243>169104799759647.00</c243>");
        xmlBuilder.append("<c243 m='2'>1</c243>");
        xmlBuilder.append("<c244>LD.VALUE.DATE.NOT.A.WORKING.DAY}VALUE DATE IS NOT A WORKING DAY</c244>");
        xmlBuilder.append("<c244 m='2'>LD.VDATE.DISP.GT15DAYS}VALUE DATE DISPLACEMENT IS MORE THAN 15 DAYS</c244>");
        xmlBuilder.append("<c244 m='3'>LD.AGREEMENT.DATE.NOT.A.WORKING.DAY}AGREEMENT DATE IS NOT A WORKING DAY</c244>");
        xmlBuilder.append("<c244 m='4'>CUST.OF.SETT.ACCT.AND.DEAL.NOT.SAME}CUST OF SETT A/C &amp; AND CUSTOMER ON DEAL NOT THE SAME{1000000000022531</c244>");
        xmlBuilder.append("<c244 m='5'>CUST.OF.SETT.ACCT.AND.DEAL.NOT.SAME}CUST OF SETT A/C &amp; AND CUSTOMER ON DEAL NOT THE SAME{1000000000022531</c244>");
        xmlBuilder.append("<c245>MAT</c245>");
        xmlBuilder.append("<c246>1</c246>");
        xmlBuilder.append("<c247>57_DMUSER__OFS_DM.OFS.SRC.VAL</c247>");
        xmlBuilder.append("<c248>1404181634</c248>");
        xmlBuilder.append("<c249>35_DMUSER_OFS_DM.OFS.SRC.VAL</c249>");
        xmlBuilder.append("<c250>ID0010497</c250>");
        xmlBuilder.append("<c251>1</c251>");
        xmlBuilder.append("</row>");

        String xml = xmlBuilder.toString();

        for (int i = 1; i <= 200; i++) {
            String recId = "LD1410793842;"+i;
            assertDoesNotThrow(() -> {
                LDHis.insertRecord(recId, xml);
            }, "insert LD$HIS should not throw an exception");
        }
    }
}
