<%--
  Created by IntelliJ IDEA.
  User: HELLO
  Date: 5/25/2022
  Time: 6:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product List</title>
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
</head>
<body>
<h1 style="margin-top: 30px; font-family: 'Baskerville Old Face'; text-align: center; font-size: 50px">Product List</h1>
<div class="row">
    <button type="button" class="btn btn-info col-ml-6" style="width: 80px;margin-left: 150px; height: 40px"><a href="/products?action=create" style="text-decoration: none; color: white">Create</a></button>
    <div style="margin-left: 1000px; margin-top: 30px" class="col-ml-6">
        <form class="form-inline my-2 my-lg-0">
            <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit" >Search</button>
        </form>
    </div>
</div>
<p style="color: green; margin-left: 200px">${message}</p>
<p>
    <c:if test='${requestScope["message-create"] != null}'>
        <span style="color: green">${requestScope["message-create"]}</span>
    </c:if>
</p>
<table class="table table-hover table-dark" style="width: 1300px; margin-left: 120px; margin-top: 50px">
    <tr>
        <th scope="col">ID</th>
        <th scope="col">Product Name</th>
        <th scope="col">Price</th>
        <th scope="col">Description</th>
        <th scope="col">Manufacturer</th>
        <th scope="col">Edit</th>
        <th scope="col">Delete</th>
    </tr>
    <c:forEach items="${products}" var="product">
        <tr>
            <td>${product.getId()}</td>
            <td><a href="/products?action=view&id=${product.getId()}">${product.getNameProduct()}</a></td>
            <td>${product.getPrice()}</td>
            <td>${product.getDescription()}</td>
            <td>${product.getManufacturer()}</td>
            <td><button type="button" class="btn btn-info" style="width: 80px;"><a href="/products?action=edit&id=${product.getId()}" style="text-decoration: none; color: white">Edit</a></button></td>
            <td><button type="button" class="btn btn-info" style="width: 80px;"><a href="/products?action=delete&id=${product.getId()}" style="text-decoration: none; color: white">Delete</a></button></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
