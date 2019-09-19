<%--
  Created by IntelliJ IDEA.
  User: NicolaeA
  Date: 16.02.2019
  Time: 02:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:useBean id="employeeService" class="com.sda.service.EmployeeService"></jsp:useBean>
<jsp:useBean id="userService" class="com.sda.service.UserService"></jsp:useBean>

<html>
<head>
    <title>Employees</title>
</head>
<jsp:include page="header.jsp"/>
<body>
<h1>Employees page!</h1>
<%--<c:forEach items="${employeeService.findById(1)}" var="employee">--%>
    <%--<span><c:out value="${employee.getfirstName()}"/></span>--%>
<%--</c:forEach>--%>
<%--<c:forEach items="${userService.findById(1)}" var="user">--%>
    <%--<span><c:out value="${employee.getUsername()}"/></span>--%>
<%--</c:forEach>--%>
    <table >
        <caption><h2>List of employees</h2></caption>
        <tr>
            <th>Employee_id</th>
            <th>First_Name</th>
            <th>Last_Name</th>
            <th>Age</th>
            <th>Department</th>
        </tr>
        <c:forEach items="${employeeService.getAll()}" var="emp" varStatus="loop">
            <tr>
                <td><c:out value="${loop.count}" />
                <td><c:out value="${emp.getFirstName()}" />
                <td><c:out value="${emp.getLastName()}" />
                <td><c:out value="${emp.getAge()}" />
                <td><c:out value="${emp.getDepartment()}" />

            </tr>

        </c:forEach>
    </table>
</body>
</html>
