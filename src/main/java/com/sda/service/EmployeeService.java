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
        Employee emp3= createEmployee("Manolache", "Sergiu", 24, "Logistic");
        list.add(emp3);
        Employee emp4=createEmployee("Loghin", "Ionela", 26, "HR");
        list.add(emp4);
        Employee emp5=createEmployee("Budeanu", "Laura", 27, "IT");
        list.add(emp5);
        Employee emp6=createEmployee("Jeleanu", "Bianca", 20, "HR");
        list.add(emp6);

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
