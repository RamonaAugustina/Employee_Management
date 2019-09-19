package com.sda;

import com.sda.dao.EmployeeDao;
import com.sda.dao.UserDao;
import com.sda.model.Employee;
import com.sda.model.User;

public class Main {

    public static void main(String[] args) {

        UserDao userDao = new UserDao();
        EmployeeDao employeeDao = new EmployeeDao();

        User adminUser = userDao.findByUsernameAndPassword("admin", "admin");
        if (adminUser == null) {
            userDao.createEntity( new User("admin", "admin"));
        }

        Employee employee = employeeDao.findByFirstNameAndLastName("Ramona", "Popovici");
        if (employee == null) {
            employeeDao.createEntity(new Employee("Ramona", "Popovici", 20, "HR"));
        }

    }
}


