<%--
  Created by IntelliJ IDEA.
  User: HELLO
  Date: 5/25/2022
  Time: 8:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit customer</title>
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
</head>
<body>
<h1 style="margin-top: 30px; font-family: 'Baskerville Old Face'; text-align: center; font-size: 50px">Edit Product</h1>
<form method="post" style="margin-left: 200px; margin-top: 80px;width: 1000px">
    <div class="form-group row">
        <label class="col-sm-2 col-form-label">ID</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" name="id" id="id" value="${product.getId()}">
        </div>
    </div>
    <div class="form-group row">
        <label class="col-sm-2 col-form-label">Product Name</label>
        <div class="col-sm-10">
            <input type="text" class="form-control"name="name" id="name" value="${product.getNameProduct()}">
        </div>
    </div>
    <div class="form-group row">
        <label class="col-sm-2 col-form-label">Price</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" name="price" id="price" value="${product.getPrice()}">
        </div>
    </div>
    <div class="form-group row">
        <label class="col-sm-2 col-form-label">Description</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" name="description" id="description" value="${product.getDescription()}">
        </div>
    </div>
    <div class="form-group row">
        <label class="col-sm-2 col-form-label">Manufacturer</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" name="manufacturer" id="manufacturer" value="${product.getManufacturer()}">
        </div>
    </div>
    <div class="form-group row" style="margin-left: 850px">
        <div class="col-sm-10">
<%--            <button type="submit" class="btn btn-primary">Edit</button>--%>
    <input type="submit" value="Edit" style="background-color: #17a2b8; color: white; font-size: 1.2rem; border-radius: 10%">
        </div>
    </div>
</form>
<p>
    <button type="button" class="btn btn-outline-secondary" style="width: 500px; margin-left: 500px"><a href="/products" style="text-decoration: none; color: black">Back</a></button>
</p>
</body>
</html>
