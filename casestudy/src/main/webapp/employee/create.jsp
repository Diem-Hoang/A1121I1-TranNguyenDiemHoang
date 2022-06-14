<%--
  Created by IntelliJ IDEA.
  User: HELLO
  Date: 6/2/2022
  Time: 6:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Employee</title>
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
</head>
<body>
<h1 style="margin-top: 30px; font-family: 'Baskerville Old Face'; text-align: center; font-size: 50px">Create Employee</h1>
<form method="post" action="/employees?action=create">
    <div class="mb-4">
        <label for="validationDefault01">Employee Name</label>
        <input name="name" type="text" class="form-control" id="validationDefault01" value="" required placeholder="Enter your name...">
    </div>
    <div class="form-row">
<%--        <div class="col-md-6 mb-4">--%>
<%--            <label for="validationDefault01">Gender</label>--%>
<%--            <select class="custom-select" id="validationDefault03" name="gender" required>--%>
<%--                <option selected value="1">Man</option>--%>
<%--                <option value="0">Woman</option>--%>
<%--            </select>--%>
<%--        </div>--%>
        <div class="col-md-6 mb-4">
            <label for="validationDefault01">Birthday</label>
            <input name="birthday" type="date" class="form-control" required>
        </div>
    <div class="col-md-6 mb-4">
        <label for="validationDefault01">Salary</label>
        <input name="salary" type="text" class="form-control" id="validationDefault00" value="" required placeholder="Enter your salary...">
    </div>
    </div>
    <div class="form-row">
        <div class="col-md-4 mb-4">
            <label for="validationDefault01">ID Card</label>
            <input name="id-card" type="text" class="form-control" id="validationDefault04" value="" required placeholder="Enter your ID card...">
        </div>
        <div class="col-md-4 mb-4">
            <label for="validationDefault01">Phone Number</label>
            <input name="phone" type="text" class="form-control" id="validationDefault06" value="" required placeholder="Enter your phone number...">
        </div>
        <div class="col-md-4 mb-4">
            <label for="validationDefault01">Email address</label>
            <input name="email" type="text" class="form-control" id="validationDefault07" value="" required placeholder="Enter your email...">
        </div>
    </div>
    <div class="form-row">
        <div class="col-md-6 mb-4">
            <label for="validationDefault01">Address</label>
            <input name="address" type="text" class="form-control" id="validationDefault08" value="" required placeholder="Enter your address...">
        </div>

    </div>
    <div class="form-row">
        <div class="col-md-6 mb-4">
            <label for="validationDefault01">Position</label>
            <input name="idPosition" type="text" class="form-control" id="validationDefault09" value="" required placeholder="Enter your address...">
        </div>
        <div class="col-md-6 mb-4">
            <label for="validationDefault01">Education Degree</label>
            <input name="idEducationDegree" type="text" class="form-control" id="validationDefault10" value="" required placeholder="Enter your address...">
        </div>
        <div class="col-md-6 mb-4">
            <label for="validationDefault01">Division</label>
            <input name="idDivision" type="text" class="form-control" id="validationDefault11" value="" required placeholder="Enter your address...">
        </div>
    </div>

    <button class="btn btn-primary" type="submit">Submit</button>
</form>
</body>
</html>
