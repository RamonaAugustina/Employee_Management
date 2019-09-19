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
        Employee emp1 = createEmployee("Calin","Alexandru",30,"HR");
        list.add(emp1);
        Employee emp2 = createEmployee("Popescu","George",20,"IT");
        list.add(emp2);


        return list;
    }

    public Employee createEmployee(String firstName, String lastName, int age, String departament){
        Employee emp = new Employee();
        emp.setFirstName(firstName);
        emp.setLastName(lastName);
        emp.setAge(age);
        emp.setDepartment(departament);

        return emp;
    }
}
