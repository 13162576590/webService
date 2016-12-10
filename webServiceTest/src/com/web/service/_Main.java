package com.web.service;

import java.util.List;

public class _Main {

    public static void main(String[] args) {
        MobileCodeWS ws = new MobileCodeWS();
        MobileCodeWSSoap mobileCodeWSSoap = ws.getMobileCodeWSSoap();
        String result = mobileCodeWSSoap.getMobileCodeInfo("13162576590", "");
        System.out.println(result);

        ArrayOfString databaseInfo = mobileCodeWSSoap.getDatabaseInfo();
        List<String> results = databaseInfo.getString();

        for (String string : results) {
            System.out.println(string);
        }
    }

}
