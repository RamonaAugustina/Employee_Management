<%--
  Created by IntelliJ IDEA.
  User: Lucian
  Date: 10/2/2019
  Time: 8:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:useBean id="departmentService" class="com.sda.service.DepartmentService"></jsp:useBean>
<jsp:useBean id="userService" class="com.sda.service.UserService"></jsp:useBean>
<html>
<head>
    <title>Departments</title>
</head>
<jsp:include page="header.jsp"/>
<link href="/css/departmentsstyle.css" rel="stylesheet" type="text/css">
<body>
<table >
    <caption><h1>List of departments</h1></caption>
    <tr>
        <th>Name</th>
        <th>Actions</th>
    </tr>

    </thead>
    <tfoot>
    <tr>
        <td colspan="5">
            <div class="links"><a href="#">&laquo;</a> <a class="active" href="#">1</a> <a href="#">2</a> <a href="#">3</a> <a href="#">4</a> <a href="#">5</a><a href="#">&raquo;</a></div>
        </td>
    </tr>
    </tfoot>

    <c:forEach items="${departmentService.getAll()}" var="dep" varStatus="loop">
        <tr>
            <td><c:out value="${loop.count}" />
            <td><c:out value="${dep.getDepartment()}" />
        </tr>
    </c:forEach>
</table>

<form action="departments" method="post">
    <table style="with: 50%">
        <tr>
            <td>Name</td>
            <td><input type="text" name="dep_name" /></td>
        </tr>
        <tr>

    </table>
    <input type="submit" value="Submit" /></form>
</body>
</html>

