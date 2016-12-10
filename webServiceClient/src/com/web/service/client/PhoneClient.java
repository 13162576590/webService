package com.web.service.client;

import com.web.service.phone.Phone;
import com.web.service.phone.PhoneService;
import com.web.service.phone.PhoneServiceService;

public class PhoneClient {

    public static void main(String[] args) {
        PhoneServiceService ws = new PhoneServiceService();
        PhoneService phoneServicePort = ws.getPhoneServicePort();
        Phone phoneInfo = phoneServicePort.getPhoneInfo("ios");
        System.out.println(phoneInfo.getName());
        System.out.println(phoneInfo.getOwner());
        System.out.println(phoneInfo.getTotal());

    }

}
