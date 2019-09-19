package com.sda.dao;

import com.sda.model.Employee;
import com.sda.model.User;
import com.sda.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao extends GenericDao<Employee>{

    public void addEmployee(int id, String firstName, String lastName, int age, String department){
        List<Employee> employeeList = new ArrayList<>();
    }

    public Employee findByFirstNameAndLastName(String firstName, String lastname){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        //use the class name User instead of the table name
        Query query = session.createQuery("FROM Employee WHERE firstName = :fn AND lastName = :ln ");
        query.setParameter("fn", firstName);
        query.setParameter("ln", lastname);
        List<Employee> list = query.getResultList();

        transaction.commit();
        session.close();
        if(list.size() > 0){
            return list.get(0);
        }
        return null;
    }

}
