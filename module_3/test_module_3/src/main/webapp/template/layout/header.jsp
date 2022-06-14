<%--
  Created by IntelliJ IDEA.
  User: HELLO
  Date: 6/14/2022
  Time: 5:42 PM
  To change this template use File | Settings | File Templates.
--%>
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <html>
    <head>
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
    <title>Header</title>
    <link rel="stylesheet" href="template/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" href="template/datatable/css/dataTables.bootstrap4.min.css">
    <link rel="stylesheet" href="template/style.css">
    </head>
    <body>
    <header id="header" class="fixed-top header-transparent">
    <div class="container d-flex align-items-center justify-content-between">

    <div class="logo">
    <h1 class="text-light"><a href="index.html"><span>Traveloka</span></a></h1>
    </div>

    <nav id="navbar" class="navbar">
    <ul>
    <li><a class="nav-link scrollto active" href="/home">Home</a></li>
    <li><a class="nav-link scrollto" href="/students">Student</a></li>
    <li><a class="nav-link scrollto" href="#">Customer</a></li>
    <li class="dropdown"><a href="#"><span>Service</span> <i class="bi bi-chevron-down"></i></a>
    <ul>
    <li><a href="#">Add Service Villa</a></li>
    <li><a href="#">Add Service House</a></li>
    <li><a href="#">Add Service Room</a></li>
    </ul>
    </li>
    <li><a class="nav-link scrollto" href="/contracts">Contract</a></li>
    <li class="dropdown"><a href="#"><span>Trần Nguyễn Diễm Hoàng</span> <i class="bi bi-chevron-down"></i></a>
    <ul>
    <li><a href="#">Personal Profile</a></li>
    <li><a href="#">Archive</a></li>
    <li><a href="#">Manage Your Account</a></li>
    <form method="post" action="/login?action=logout"  class="form-inline my-2 my-lg-0">
    <li><a href="#" type="submit">Logout</a></li>
    </form>

    </ul>
    </li>
    </ul>
    <i class="bi bi-list mobile-nav-toggle"></i>
    </nav><!-- .navbar -->

    </div>
    </header>
    </body>
    <script src="template/bootstrap/jquery-3.6.0.min.js"></script>
    <script src="template/bootstrap/js/bootstrap.js"></script>
    <script src="template/datatable/js/jquery.dataTables.min.js"></script>
    <script src="template/datatable/js/dataTables.bootstrap4.min.js"></script>
    <script src="template/main.js"></script>
    </html>
