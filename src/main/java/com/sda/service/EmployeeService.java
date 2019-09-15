package com.sda.service;

import com.sda.dao.EmployeeDao;
import com.sda.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    private EmployeeDao employeeDao = new EmployeeDao();

    public Employee findById(Long id){
        return employeeDao.getEntityById(Employee.class, id);
    }

    public List<Employee> getAll(){
        List<Employee> list  = new ArrayList<>();
        Employee employee = new Employee();
        employee.setFirstName("Alexandru");
        list.add(employee);
        return list;
    }
}
