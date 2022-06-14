<%--
  Created by IntelliJ IDEA.
  User: HELLO
  Date: 6/14/2022
  Time: 2:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Login Page</title>
    <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
    <link rel="stylesheet" href="/template/css/login_style.css">
</head>
<body>
<div class="login">
    <i class="fa fa-empire"></i>
    <h1 style="margin-top: 30px; font-family: 'Baskerville Old Face'; text-align: center; font-size: 50px">Login</h1>
<%--    mesenger--%>
    <c:if test="${msg != null}" >
        <p class="text-danger" style="color: red; font-size: large"> ${msg}</p>
    </c:if>
<%--    mesenger--%>
    <form   action="/login?action=login"  method="post" style="text-align: center">
        <div class="input" style="margin-bottom: 30px">
            <input type="text" name="username" value="${username}" placeholder="Username"/>
        </div>
        <div class="input " style="margin-bottom: 30px">
            <input type="password" name="password"  value="${password}" placeholder="Password"/>
        </div>
        <div class="buttonInput">
            <button>Login</button>
        </div>
    </form>
</div>
</body>
</html>
