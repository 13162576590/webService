package cn.web.service.spring.cxf;

import java.util.ArrayList;
import java.util.List;

import cn.web.service.model.Employee;

public class EmployeeManagerImpl implements IEmployeeManager {

    private List<Employee> employees = new ArrayList<Employee>();

    /* (non-Javadoc)
     * @see cn.web.service.spring.cxf.IEmployeeManager#add(cn.web.service.model.Employee)
     */
    @Override
    public void add(Employee employee) {
        employees.add(employee);
    }

    /* (non-Javadoc)
     * @see cn.web.service.spring.cxf.IEmployeeManager#query()
     */
    @Override
    public List<Employee> query() {
        return this.employees;
    }

}
