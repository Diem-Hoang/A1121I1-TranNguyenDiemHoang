<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: HELLO
  Date: 6/27/2022
  Time: 7:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/form" method="post">
    <h1>Sandwich Condiments</h1>
    <input type="checkbox" name="sandwich" value="Lettuce">Lettuce
    <input type="checkbox" name="sandwich" value="Tomato">Tomato
    <input type="checkbox" name="sandwich" value="Mustard">Mustard
    <input type="checkbox" name="sandwich" value="Sprouts">Sprouts
    <button type="submit">Save</button>
    <p>${sandwich}</p>
</form>
</body>
</html>
