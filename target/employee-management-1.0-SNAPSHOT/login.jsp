<%--
  Created by IntelliJ IDEA.
  User: NicolaeA
  Date: 16.02.2019
  Time: 17:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java"
         contentType="text/html; charset=windows-1256"
         pageEncoding="windows-1256"
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
    <title>Login Page</title>
    <link href="/css/loginstyle.css" rel="stylesheet" type="text/css">
</head>

<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"integrity="sha256-pasqAKBDmFT4eHoN2ndd6lN370kFiGUFyTiUHWhU7k8=" crossorigin="anonymous"></script>
<script src="js/login.js"> </script>
</head>
<body>
<div class="loginArea">
    <h2 id="b"> Log-in </h2>
    <form action="login" method="post">
        <input id="username" type="text" class="normalInput" placeholder="Username" name="un"/>
        <p class="error"> Username too small! </p>
        <input id ="password" type="password" class="normalInput" placeholder="Password" name="pw"/>
        <button> login </button>
        <ul class="loginFooter">
            <li> <a href="register.html"> Register </a> </li>
            <li> <a href="#"> Forgot password </a> </li>
        </ul>
    </form>
</div>

</body>

</html>