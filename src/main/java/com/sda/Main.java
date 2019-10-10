package com.sda;

import com.sda.dao.DepartmentDao;
import com.sda.dao.EmployeeDao;
import com.sda.dao.UserDao;
import com.sda.model.Department;
import com.sda.model.Employee;
import com.sda.model.User;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Main {

    public static void main(String[] args) {
            User user = new User("admin", "admin");
            UserDao userDao = new UserDao();
            userDao.createEntity(user);
            Employee employee = new Employee();
            employee.setLastName("Popescu");
            EmployeeDao employeeDao = new EmployeeDao();
         // Employee employee = employeeDao.getEntityById(Employee.class, 1L);
            System.out.println(employee.getLastName());
            employeeDao.createEntity(employee);

        Department department= new Department();
        department.setDepartment("HR");
        DepartmentDao departmentDao= new DepartmentDao();
        System.out.println(department.getDepartment());
        departmentDao.createEntity(department);
        }
    }

