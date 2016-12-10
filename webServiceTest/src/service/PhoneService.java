package service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import com.web.service.phone.model.Phone;

@WebService(serviceName = "PhoneManger", targetNamespace = "http://service.com")
public class PhoneService {

    @WebMethod(operationName = "getMobileInfo")
    public @WebResult(name="phone") Phone getPhoneInfo(@WebParam(name = "osName") String osName) {
        Phone phone = new Phone();
        if (osName.equals("android")) {
            phone.setName("android");
            phone.setOwner("google");
            phone.setTotal(20);
        } else if (osName.equals("ios")) {
            phone.setName("ios");
            phone.setOwner("apple");
            phone.setTotal(15);
        } else {
            phone.setName("windows phone");
            phone.setOwner("microsoft");
            phone.setTotal(5);
        }

        return phone;
    }

    public void sayHello(String city) {
        System.out.println("你好:" + city);
    }

    @WebMethod(exclude = true) //不发布
    public void sayHello1(String hello) {
        System.out.println("你好:" + hello);
    }


    public static void main(String[] args) {
        String address1 = "http://127.0.0.1:8888/ws/phoneService";

        Endpoint.publish(address1, new PhoneService());
        System.out.println("wsdl地址:" + address1 + "?WSDL");
    }
}
