<%--
  Created by IntelliJ IDEA.
  User: HELLO
  Date: 6/2/2022
  Time: 4:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Contract List</title>
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
    <%@include file="/template/header.jsp"%>
    <link rel="stylesheet" type="text/css" href="/css/sidebar.css">
</head>
<body>
<div class="row">
    <div class=" row container-fluid">
<%--        <div class="col-lg-3">--%>
<%--            <%@include file="/template/sidebar.jsp"%>--%>
<%--        </div>--%>
            <h1 style="margin-top: 30px; font-family: 'Baskerville Old Face'; text-align: center; font-size: 50px">Contract List</h1>
            <div class="row">
                <a href="#" style="text-decoration: none; color: white"><button type="button" class="btn btn-info col-ml-6" style=" height: 40px">Create</button></a>
                <div style=" margin-top: 30px" class="col-ml-6">
                    <form class="form-inline my-2 my-lg-0">
                        <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                        <button class="btn btn-outline-success my-2 my-sm-0" type="submit" >Search</button>
                    </form>
                </div>
            </div>
            <table class="table table-hover table-dark" style=" ">
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Start Date</th>
                    <th scope="col">End Date</th>
                    <th scope="col">Deposit</th>
                    <th scope="col">Total Money</th>
                    <th scope="col">ID Employee</th>
                    <th scope="col">ID Customer</th>
                    <th scope="col">ID Service</th>
                    <th scope="col">Edit</th>
                    <th scope="col">Delete</th>
                </tr>
                <c:forEach items="${contracts}" var="customer">
                    <tr>
                        <td>${customer.getIdContract()}</td>
                        <td>${customer.getStartDate()}</td>
                        <td>${customer.getEndDate()}</td>
                        <td>${customer.getDeposit()}</td>
                        <td>${customer.getTotalMoney()}</td>
                        <td>${customer.getIdEmployee()}</td>
                        <td>${customer.getIdCustomer()}</td>
                        <td>${customer.getIdService()}</td>
                        <td><a href="#" style="text-decoration: none; color: white"><button type="button" class="btn btn-info" style="width: 80px;">Edit</button></a></td>
                        <td> <button type="button" onclick="showInfo('${customer.getIdContract()}')"
                                     class="btn btn-outline-danger" data-toggle="modal"
                                     data-target="#staticBackdrop">
                            Delete
                        </button></td>
                    </tr>
                </c:forEach>
            </table>
            <div class="modal fade" id="staticBackdrop" data-backdrop="static" data-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <%--        thêm thẻ form--%>
                    <form action="/contracts?action=delete" method="post">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h5 class="modal-title" id="staticBackdropLabel">Delete Contract</h5>
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                    <span aria-hidden="true">&times;</span>
                                </button>
                            </div>
                            <div class="modal-body">
                                <input  hidden type="text" id="idContract" name="idDelete">
                                <span>Bạn có muốn xóa hợp đồng này không?</span>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                <button type="submit" class="btn btn-primary">Delete</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>


    </div>
</div>
<script>
    function showInfo(id) {
        document.getElementById("idContract"). value= id;
        // document.getElementById("nameCustomer").innerText=name;
    }
</script>
</body>
</html>
