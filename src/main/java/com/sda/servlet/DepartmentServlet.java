package com.sda.servlet;

import com.sda.dao.DepartmentDao;
import com.sda.model.Department;
import com.sda.service.DepartmentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/departments")
public class DepartmentServlet extends HttpServlet {
    private DepartmentService departmentService = new DepartmentService();

    @Override
    protected void doGet(HttpServletRequest reqest, HttpServletResponse response)
            throws ServletException, IOException {
        String department_id = reqest.getParameter("department_id");
        Department department = departmentService.findById(Long.valueOf(department_id));
        response.getWriter().println("Hello World!");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String dep_name = req.getParameter("dep_name");

        Department dep = departmentService.saveDepartment(dep_name);
        //TO DO: Create employee in database

        resp.sendRedirect("departments.jsp");
    }
}


