<%--
  Created by IntelliJ IDEA.
  User: NicolaeA
  Date: 16.02.2019
  Time: 02:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:useBean id="employeeService" class="com.sda.service.EmployeeService"></jsp:useBean>
<jsp:useBean id="userService" class="com.sda.service.UserService"></jsp:useBean>

<html>
<head>
    <title>Employees</title>
</head>
<jsp:include page="header.jsp"/>
<link href="/css/employeestyle.css" rel="stylesheet" type="text/css">
<body>
<h1>Employees page!</h1>
<%--<c:forEach items="${employeeService.findById(1)}" var="employee">--%>
<%--<span><c:out value="${employee.getfirstName()}"/></span>--%>
<%--</c:forEach>--%>
<%--<c:forEach items="${userService.findById(1)}" var="user">--%>
<%--<span><c:out value="${employee.getUsername()}"/></span>--%>
<%--</c:forEach>--%>
<table>
    <caption><h2>List of employees</h2></caption>
    <tr>
        <th>Employee id</th>
        <th>First name</th>
        <th>Last name</th>
        <th>Age</th>
        <th>Department</th>
        <th>Actions</th>

    </tr>

    </thead>
    <tfoot>
    <tr>
        <td colspan="5">
            <div class="links"><a href="#">&laquo;</a> <a class="active" href="#">1</a> <a href="#">2</a> <a
                    href="#">3</a> <a href="#">4</a> <a href="#">5</a><a href="#">&raquo;</a></div>
        </td>
    </tr>


    </tfoot>

    <c:forEach items="${employeeService.getAll()}" var="emp" varStatus="loop">
        <tr>
            <td><c:out value="${loop.count}"/>
            <td><c:out value="${emp.getFirstName()}"/>
            <td><c:out value="${emp.getLastName()}"/>
            <td><c:out value="${emp.getAge()}"/>
            <td><c:out value="${emp.getDepartment()}"/>
            <td>
                <form action="employees" method="post">
                    <br>
                    <button>Edit</button>
                    <button>Delete</button>
                    </a>
                </form>
            </td>

        </tr>
    </c:forEach>
</table>

<form action="employees" method="post">
    <table style="with: 50%">
        <tr>
            <td>First Name</td>
            <td><input type="text" name="first_name"/></td>
        </tr>
        <tr>
            <td>Last Name</td>
            <td><input type="text" name="last_name"/></td>
        </tr>
        <tr>
            <td>Age</td>
            <td><input type="text" name="age"/></td>
        </tr>
        <tr>
            <td>Department</td>
            <td><input type="text" name="department"/></td>
        </tr>
    </table>
    <input type="submit" value="Submit"/></form>

</body>
</html>
