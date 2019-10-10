package com.sda.service;

import com.sda.dao.DepartmentDao;
import com.sda.model.Department;


import java.util.List;

public class DepartmentService {

    private DepartmentDao departmentDao = new DepartmentDao();

    public Department findById(Long id) {
        return departmentDao.getEntityById(Department.class, id);
    }

    public void saveDepartment(Department department){
        departmentDao.updateEntity(department);
    }

    public List<Department> getAll() {
        return departmentDao.getAll();
    }

    public void delete(Long id) {
        departmentDao.delete(Department.class, id);
}

    public Department saveDepartment(String dep_name) {
       Department dep = new Department();
        dep.setDepartment(dep_name);
        departmentDao.createEntity(dep);
        return dep;
    }
}
