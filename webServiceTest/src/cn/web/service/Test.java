package cn.web.service;

import javax.xml.ws.Endpoint;

public class Test {

    public static void main(String[] args) {
        JobServiceImpl jobService = new JobServiceImpl();
        String address = "http://127.0.0.1:8888/ws/jobservice";
        Endpoint.publish(address, jobService);
        System.out.println(address + "?WSDL");

    }

}
