package com.web.service.mobile;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class MobileCodeService {

    public void get(String mobileCode, String userID) throws Exception {
        URL url = new URL("http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx/getMobileCodeInfo?mobileCode=" + mobileCode + "&userID=" + userID);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setConnectTimeout(5000);
        conn.setRequestMethod("GET");
        if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
            InputStream is = conn.getInputStream();
            ByteArrayOutputStream boas = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int len = 0;
            while ((len = is.read(buffer)) != -1) {
                boas.write(buffer, 0, len);
            }
            System.out.println("GET请求获取数据:" + boas.toString());
            boas.close();
            is.close();
        }
    }

   public static void main(String[] args) throws Exception {
        MobileCodeService ws = new MobileCodeService();
        ws.get("13162576590", "");
    }

}
