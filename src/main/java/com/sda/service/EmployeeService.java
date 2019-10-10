package com.sda.service;

import com.sda.dao.EmployeeDao;
import com.sda.model.Employee;

import java.util.List;

public class EmployeeService {

    private EmployeeDao employeeDao = new EmployeeDao();

    public Employee findById(Long id) {
        return employeeDao.getEntityById(Employee.class, id);
    }

    public void updateEmployee(Employee employee){
        employeeDao.updateEntity(employee);
    }

    public List<Employee> getAll() {
        return employeeDao.getAll();
    }


    public void delete(Long id) {
        employeeDao.delete(Employee.class, id);
    }

    public void createEmployee(Employee employee){
        employeeDao.createEntity(employee);
    }

    public  void updateEmployee(String name, Long id){
        Employee oldEmployee =findById(id);
        oldEmployee.setFirstName(name);
        updateEmployee(oldEmployee);
    }

    public Employee createEmployee(String firstName, String lastName, int age, String departament) {
        Employee emp = new Employee();
        emp.setFirstName(firstName);
        emp.setLastName(lastName);
        emp.setAge(age);
        emp.setDepartment(departament);

        return emp;
    }
}





