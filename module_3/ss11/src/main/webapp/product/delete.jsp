<%--
  Created by IntelliJ IDEA.
  User: HELLO
  Date: 5/25/2022
  Time: 9:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete product</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
</head>
<body>
<h1 style="margin-top: 30px; font-family: 'Baskerville Old Face'; text-align: center; font-size: 50px">Delete Product</h1>
<form method="post">
    <div class="alert alert-success" role="alert" style="margin-top: 50px; margin-left: 100px;margin-right: 100px; background-color: #343a40; color: white; ">
        <div style="display: flex"><label style="min-width: 150px">ID:</label> <p>${product.getId()}</p></div>
        <div style="display: flex"><label style="min-width: 150px">Product Name:</label> <p>${product.getNameProduct()}</p></div>
        <div style="display: flex"><label style="min-width: 150px">Price:</label> <p>${product.getPrice()}</p></div>
        <div style="display: flex"><label style="min-width: 150px">Description:</label> <p>${product.getDescription()}</p></div>
        <div style="display: flex"><label style="min-width: 150px">Manufacturer:</label> <p>${product.getManufacturer()}</p></div>
    </div>
    <td><input type="submit" value="Delete" style="background-color: #17a2b8; color: white; font-size: 1.2rem; border-radius: 10%; margin-left: 1300px"></td>
</form>
<p>
    <button type="button" class="btn btn-outline-secondary" style="width: 500px; margin-left: 500px"><a href="/products" style="text-decoration: none; color: black">Back</a></button>
</p>
</body>
</html>