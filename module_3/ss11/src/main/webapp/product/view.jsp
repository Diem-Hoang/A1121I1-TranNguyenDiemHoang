<%--
  Created by IntelliJ IDEA.
  User: HELLO
  Date: 5/27/2022
  Time: 5:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
    <title>View customer</title>
</head>
<body>
<h1 style="margin-top: 30px; font-family: 'Baskerville Old Face'; text-align: center; font-size: 50px">Product Details</h1>
<div class="alert alert-success" role="alert" style="margin-top: 50px; margin-left: 100px;margin-right: 100px; background-color: #343a40; color: white; ">
    <div style="display: flex"><label style="min-width: 150px">ID:</label> <p>${product.getId()}</p></div>
    <div style="display: flex"><label style="min-width: 150px">Product Name:</label> <p>${product.getNameProduct()}</p></div>
    <div style="display: flex"><label style="min-width: 150px">Price:</label> <p>${product.getPrice()}</p></div>
    <div style="display: flex"><label style="min-width: 150px">Description:</label> <p>${product.getDescription()}</p></div>
    <div style="display: flex"><label style="min-width: 150px">Manufacturer:</label> <p>${product.getManufacturer()}</p></div>
</div>
<p>
    <button type="button" class="btn btn-outline-secondary" style="width: 500px; margin-left: 500px; margin-top: 50px"><a href="/products" style="text-decoration: none; color: black">Back</a></button>
</p>
</body>
</html>
