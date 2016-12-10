package cn.web.service.spring.cxf;

import java.util.List;

import javax.jws.WebService;

import cn.web.service.model.Employee;

@WebService
public interface IEmployeeManager {

    void add(Employee employee);

    List<Employee> query();

}