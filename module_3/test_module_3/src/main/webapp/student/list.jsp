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
    <title>Student List</title>
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
    <meta content="" name="description">
    <meta content="" name="keywords">

    <!-- Favicons -->
    <link href="/template/assets/img/favicon.png" rel="icon">
    <link href="/template/assets/img/apple-touch-icon.png" rel="apple-touch-icon">

    <!-- Google Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

    <!-- Vendor CSS Files -->
    <link href="/template/assets/vendor/aos/aos.css" rel="stylesheet">
    <link href="/template/assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="/template/assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
    <link href="/template/assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
    <link href="/template/assets/vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
    <link href="/template/assets/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">

    <!-- Template Main CSS File -->
    <link href="/template/assets/css/style.css" rel="stylesheet">
</head>
<body>
<%--Header--%>
<div>
    <%@include file="/template/layout/header.jsp" %>
</div>
<%--End header--%>

<!-- ======= Hero Section ======= -->
<section id="hero">
    <div class="hero-container" data-aos="fade-up">
        <h1>Student List</h1>
        <h2>Click to see details</h2>
        <a href="#about" class="btn-get-started scrollto"><i class="bx bx-chevrons-down"></i></a>
    </div>
</section><!-- End Hero -->

<main id="main">

    <!-- ======= About Section ======= -->
    <section id="about" class="about">
        <div class="container">
            <h1 style="margin-top: 30px; font-family: 'Baskerville Old Face'; text-align: center; font-size: 50px">Student List</h1>
            <div class="row">
                <a href="/students?action=create" style="text-decoration: none; color: white"><button type="button" class="btn btn-info col-ml-6" style="width: 80px;margin-left: 150px; height: 40px">Create</button></a>
                <div style="margin-left: 1000px; margin-top: 30px" class="col-ml-6">
                    <form class="form-inline my-2 my-lg-0" action="/employees?action=search" method="get">
                        <input  hidden name="action"  value="search" placeholder="Nhập ID">
                        <input class="form-control mr-sm-2" name="idEmployee" type="search" placeholder="Nhập ID" aria-label="Search">
                        <input class="form-control mr-sm-2" name="nameEmployee" type="search" placeholder="Nhập tên nhân viên" aria-label="Search">
                        <button class="btn btn-outline-success my-2 my-sm-0" type="submit" >Search</button>
                    </form>
                </div>
            </div>
            <%--<p style="color: green; margin-left: 200px">${message}</p>--%>
            <%--<p>--%>
            <%--    <c:if test='${requestScope["message-create"] != null}'>--%>
            <%--        <span style="color: green">${requestScope["message-create"]}</span>--%>
            <%--    </c:if>--%>
            <%--</p>--%>
            <table class="table table-hover table-dark">
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Student Name</th>
                    <th scope="col">Student Birthday</th>
                    <th scope="col">Email</th>
                    <th scope="col">Student Type</th>
                    <th scope="col">Edit</th>
                    <th scope="col">Delete</th>
                </tr>
                <c:forEach items="${students}" var="student">
                    <tr>
                        <td>${student.getId()}</td>
                        <td><a href="">${student.getName()}</a></td>
                        <td>${student.getBirthday()}</td>
                        <td>${student.getEmail()}</td>
<%--                        <td>${student.getIdStudentType()}</td>--%>
                        <td>
                            <c:forEach items="${studentTypes}" var="type">
                                <c:if test="${type.id == student.id}"> ${type.nameType} </c:if>
                            </c:forEach>
                        </td>

                        <td><a href="#" style="text-decoration: none; color: white"><button type="button" class="btn btn-info" style="width: 80px;">Edit</button></a></td>
                        <td> <button type="button" onclick="showInfo('${student.getId()}','${student.getName()}')"
                                     class="btn btn-outline-danger" data-toggle="modal"
                                     data-target="#staticBackdrop">
                            Delete
                        </button></td>
                    </tr>
                </c:forEach>
            </table>


        </div>
    </section><!-- End About Section -->
    <%--+++++footer+++++++--%>
    <div>
        <%@include file="/template/layout/footer.jsp" %>
    </div>

<a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i class="bi bi-arrow-up-short"></i></a>

<!-- Vendor JS Files -->
<script src="assets/vendor/purecounter/purecounter.js"></script>
<script src="assets/vendor/aos/aos.js"></script>
<script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
<script src="assets/vendor/glightbox/js/glightbox.min.js"></script>
<script src="assets/vendor/isotope-layout/isotope.pkgd.min.js"></script>
<script src="assets/vendor/swiper/swiper-bundle.min.js"></script>
<script src="assets/vendor/php-email-form/validate.js"></script>

<!-- Template Main JS File -->
<script src="assets/js/main.js"></script>
<script>
    function showInfo(id,name) {
        document.getElementById("idStudent"). value= id;
        document.getElementById("nameStudent").innerText=name;
    }
</script>
<div class="modal fade" id="staticBackdrop" data-backdrop="static" data-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
    <div class="modal-dialog">
        <%--        thêm thẻ form--%>
        <form action="/students?action=delete" method="post">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="staticBackdropLabel">Are you sure?</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    <input  hidden type="text" id="idStudent" name="idDelete">
                    <span>Are you sure you want to delete  </span>
                    <span class="text-danger" id="nameStudent" name="nameDelete"></span> student?<span/>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                    <button type="submit" class="btn btn-primary">Delete</button>
                </div>
            </div>
        </form>
    </div>
</div>
</body>
</html>
