package com.sda.dao;

import com.sda.model.Department;
import com.sda.model.Employee;
import com.sda.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class DepartmentDao extends GenericDao<Department> {

    public List<Department> getAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        List<Department> departmentList = session.createQuery("SELECT a FROM Department a", Department.class).getResultList();

        transaction.commit();
        //session.close();
        return departmentList;
    }
}
