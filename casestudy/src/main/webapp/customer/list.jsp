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
    <title>Customer List</title>
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
            integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF"
            crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
          integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
<%--    <%@include file="/template/header.jsp" %>--%>
<%--    <link rel="stylesheet" type="text/css" href="/css/sidebar.css">--%>
    <meta content="" name="description">
    <meta content="" name="keywords">

    <!-- Favicons -->
    <link href="assets/img/favicon.png" rel="icon">
    <link href="assets/img/apple-touch-icon.png" rel="apple-touch-icon">

    <!-- Google Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

    <!-- Vendor CSS Files -->
    <link href="assets/vendor/aos/aos.css" rel="stylesheet">
    <link href="assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
    <link href="assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
    <link href="assets/vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
    <link href="assets/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">

    <!-- Template Main CSS File -->
    <link href="assets/css/style.css" rel="stylesheet">
</head>
<body>
<%--<div class="row">--%>
<%--    <div class=" row container-fluid">--%>
<%--        <div class="col-md-3 p-0">--%>
<%--            <%@include file="/template/sidebar.jsp" %>--%>
<%--        </div>--%>
<%--        <div class="col-md-9 row m-0 p-0">--%>
<%--            <h1 style="margin-top: 30px; font-family: 'Baskerville Old Face'; text-align: center; font-size: 50px">--%>
<%--                Customer List</h1>--%>
<%--            <a href="/customers?action=create" style="text-decoration: none; color: white">--%>
<%--                <button type="button" class="btn btn-info col-ml-6" style=" height: 40px">Create</button>--%>
<%--            </a>--%>
<%--            <div style=" margin-top: 30px" class="col-md-12">--%>
<%--                <form class="form-inline my-2 my-lg-0">--%>
<%--                    <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">--%>
<%--                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>--%>
<%--                </form>--%>
<%--            </div>--%>
<%--            &lt;%&ndash;<p style="color: green; margin-left: 200px">${message}</p>&ndash;%&gt;--%>
<%--            &lt;%&ndash;<p>&ndash;%&gt;--%>
<%--            &lt;%&ndash;    <c:if test='${requestScope["message-create"] != null}'>&ndash;%&gt;--%>
<%--            &lt;%&ndash;        <span style="color: green">${requestScope["message-create"]}</span>&ndash;%&gt;--%>
<%--            &lt;%&ndash;    </c:if>&ndash;%&gt;--%>
<%--            &lt;%&ndash;</p>&ndash;%&gt;--%>
<%--            <div class="container">--%>
<%--                <table class="table table-hover table-dark" style=" ">--%>
<%--                    <tr>--%>
<%--                        <th scope="col">ID</th>--%>
<%--                        <th scope="col">Customer Name</th>--%>
<%--                        <th scope="col">Gender</th>--%>
<%--                        <th scope="col">Birthday</th>--%>
<%--                        <th scope="col">ID_Card</th>--%>
<%--                        <th scope="col">Phone Number</th>--%>
<%--                        <th scope="col">Email</th>--%>
<%--                        <th scope="col">Address</th>--%>
<%--                        <th scope="col">Type Customer</th>--%>
<%--                        <th scope="col">Edit</th>--%>
<%--                        <th scope="col">Delete</th>--%>
<%--                    </tr>--%>
<%--                    <c:forEach items="${customers}" var="contract">--%>
<%--                        <tr>--%>
<%--                            <td>${contract.getId()}</td>--%>
<%--                            <td><a href="/products?action=view&id=${contract.getId()}">${contract.getName()}</a></td>--%>
<%--                            <td><c:if test="${contract.getGender()==true}">Man</c:if>--%>
<%--                                <c:if test="${contract.getGender()==false}">Woman</c:if>--%>
<%--                            </td>--%>
<%--                            <td>${contract.getBirthday()}</td>--%>
<%--                            <td>${contract.getIdCard()}</td>--%>
<%--                            <td>${contract.getPhone()}</td>--%>
<%--                            <td>${contract.getEmail()}</td>--%>
<%--                            <td>${contract.getAddress()}</td>--%>
<%--                            <td>${contract.getIdTypeCustomer()}</td>--%>
<%--                            <td><a href="/customers?action=edit&id=${contract.getId()}"--%>
<%--                                   style="text-decoration: none; color: white">--%>
<%--                                <button type="button" class="btn btn-info" style="width: 80px;">Edit</button>--%>
<%--                            </a></td>--%>
<%--                                &lt;%&ndash;            <td><button type="button" class="btn btn-info" style="width: 80px;"><a href="/customers?action=delete&id=${customer.getId()}" style="text-decoration: none; color: white">Delete</a></button></td>&ndash;%&gt;--%>
<%--                            <td>--%>
<%--                                <button type="button" onclick="showInfo('${contract.getId()}','${contract.getName()}')"--%>
<%--                                        class="btn btn-outline-danger" data-toggle="modal"--%>
<%--                                        data-target="#staticBackdrop">--%>
<%--                                    Delete--%>
<%--                                </button>--%>
<%--                            </td>--%>
<%--                        </tr>--%>
<%--                    </c:forEach>--%>
<%--                </table>--%>
<%--            </div>--%>
<%--            <div class="modal fade" id="staticBackdrop" data-backdrop="static" data-keyboard="false" tabindex="-1"--%>
<%--                 aria-labelledby="staticBackdropLabel" aria-hidden="true">--%>
<%--                <div class="modal-dialog">--%>
<%--                    &lt;%&ndash;        thêm thẻ form&ndash;%&gt;--%>
<%--                    <form action="/customers?action=delete" method="post">--%>
<%--                        <div class="modal-content">--%>
<%--                            <div class="modal-header">--%>
<%--                                <h5 class="modal-title" id="staticBackdropLabel">Xóa khách hàng</h5>--%>
<%--                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">--%>
<%--                                    <span aria-hidden="true">&times;</span>--%>
<%--                                </button>--%>
<%--                            </div>--%>
<%--                            <div class="modal-body">--%>
<%--                                <input hidden type="text" id="idCustomer" name="idDelete">--%>
<%--                                <span>Bạn có muốn xóa khách hàng </span>--%>
<%--                                <span class="text-danger" id="nameCustomer" name="nameDelete"></span> không?<span/>--%>
<%--                            </div>--%>
<%--                            <div class="modal-footer">--%>
<%--                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>--%>
<%--                                <button type="submit" class="btn btn-primary">Delete</button>--%>
<%--                            </div>--%>
<%--                        </div>--%>
<%--                    </form>--%>
<%--                </div>--%>
<%--            </div>--%>

<%--        </div>--%>
<%--    </div>--%>
<%--</div>--%>
<header id="header" class="fixed-top header-transparent">
    <div class="container d-flex align-items-center justify-content-between">

        <div class="logo">
            <h1 class="text-light"><a href="index.html"><span>Traveloka</span></a></h1>
            <!-- Uncomment below if you prefer to use an image logo -->
            <!-- <a href="index.html"><img src="assets/img/logo.png" alt="" class="img-fluid"></a>-->
        </div>

        <nav id="navbar" class="navbar">
            <ul>
                <li><a class="nav-link scrollto active" href="/home">Home</a></li>
                <li><a class="nav-link scrollto" href="/employees">Employee</a></li>
                <li><a class="nav-link scrollto" href="/customers">Customer</a></li>
                <li class="dropdown"><a href="#"><span>Service</span> <i class="bi bi-chevron-down"></i></a>
                    <ul>
                        <li><a href="/service?action=showFormAddServiceVilla">Add Service Villa</a></li>
                        <li><a href="/service?action=showFormAddServiceHouse">Add Service House</a></li>
                        <li><a href="/service?action=showFormAddServiceRoom">Add Service Room</a></li>
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
</header><!-- End Header -->

<!-- ======= Hero Section ======= -->
<section id="hero">
    <div class="hero-container" data-aos="fade-up">
        <h1>Customer List</h1>
        <h2>Click to see details</h2>
        <a href="#about" class="btn-get-started scrollto"><i class="bx bx-chevrons-down"></i></a>
    </div>
</section><!-- End Hero -->

<main id="main">

    <!-- ======= About Section ======= -->
    <section id="about" class="about">
        <div class="container row">
            <div class="col-md-3">
                <%@include file="/template/sidebar.jsp"%>
            </div>
            <div class="col-md-9">
                <h1 style="margin-top: 30px; font-family: 'Baskerville Old Face'; text-align: center; font-size: 50px">Customer List</h1>
                <div style=" margin-top: 30px" class="col-md-12 row">
                    <a href="/customers?action=create" style="text-decoration: none; color: white">
                        <button type="button" class="btn btn-info col-ml-6" style=" height: 40px">Create</button>
                    </a>
                    <form class="form-inline my-2 my-lg-0">
                        <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                        <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                    </form>
                </div>
                <%--<p style="color: green; margin-left: 200px">${message}</p>--%>
                <%--<p>--%>
                <%--    <c:if test='${requestScope["message-create"] != null}'>--%>
                <%--        <span style="color: green">${requestScope["message-create"]}</span>--%>
                <%--    </c:if>--%>
                <%--</p>--%>
                <div>
                    <table class="table table-hover table-dark">
                        <tr>
                            <th scope="col">ID</th>
                            <th scope="col">Customer Name</th>
                            <th scope="col">Gender</th>
                            <th scope="col">Birthday</th>
                            <th scope="col">ID_Card</th>
                            <th scope="col">Phone Number</th>
                            <th scope="col">Email</th>
                            <th scope="col">Address</th>
                            <th scope="col">Type Customer</th>
                            <th scope="col">Edit</th>
                            <th scope="col">Delete</th>
                        </tr>
                        <c:forEach items="${customers}" var="customer">
                            <tr>
                                <td>${customer.getId()}</td>
                                <td><a href="/products?action=view&id=${customer.getId()}">${customer.getName()}</a></td>
                                <td><c:if test="${customer.getGender()==true}">Man</c:if>
                                    <c:if test="${customer.getGender()==false}">Woman</c:if>
                                </td>
                                <td>${customer.getBirthday()}</td>
                                <td>${customer.getIdCard()}</td>
                                <td>${customer.getPhone()}</td>
                                <td style="word-break: break-word">${customer.getEmail()}</td>
                                <td>${customer.getAddress()}</td>
<%--                                <td>${customer.getIdTypeCustomer()}</td>--%>
                                <td>
<%--                                        <c:if test="${customerTypes != null}" >--%>
                                            <c:forEach items="customerTypes" var="type">
                                                            <c:if test="${type.getCustomerTypeID() == customer.getIdTypeCustomer()}">
                                                               ${type.getCustomerTypeName()}
                                                            </c:if>
                                            </c:forEach>
<%--                                        </c:if>--%>
                                </td>
                                <td><a href="/customers?action=edit&id=${customer.getId()}"
                                       style="text-decoration: none; color: white">
                                    <button type="button" class="btn btn-info" style="width: 80px;">Edit</button>
                                </a></td>
                                    <%--            <td><button type="button" class="btn btn-info" style="width: 80px;"><a href="/customers?action=delete&id=${customer.getId()}" style="text-decoration: none; color: white">Delete</a></button></td>--%>
                                <td>
                                    <button type="button" onclick="showInfo('${customer.getId()}','${customer.getName()}')"
                                            class="btn btn-outline-danger" data-toggle="modal"
                                            data-target="#staticBackdrop">
                                        Delete
                                    </button>
                                </td>
                            </tr>
                        </c:forEach>
                    </table>
                </div>
            </div>
            </div>
    </section><!-- End About Section -->





    <!-- ======= Team Section ======= -->
    <section id="team" class="team">
        <div class="container">

            <div class="section-title" data-aos="fade-in" data-aos-delay="100">
                <h2>Team</h2>
                <p>Magnam dolores commodi suscipit. Necessitatibus eius consequatur ex aliquid fuga eum quidem. Sit sint consectetur velit. Quisquam quos quisquam cupiditate. Et nemo qui impedit suscipit alias ea. Quia fugiat sit in iste officiis commodi quidem hic quas.</p>
            </div>

            <div class="row">

                <div class="col-lg-4 col-md-6">
                    <div class="member" data-aos="fade-up">
                        <div class="pic"><img src="assets/img/team/team-1.jpg" class="img-fluid" alt=""></div>
                        <div class="member-info">
                            <h4>Walter White</h4>
                            <span>Chief Executive Officer</span>
                            <div class="social">
                                <a href=""><i class="bi bi-twitter"></i></a>
                                <a href=""><i class="bi bi-facebook"></i></a>
                                <a href=""><i class="bi bi-instagram"></i></a>
                                <a href=""><i class="bi bi-linkedin"></i></a>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="col-lg-4 col-md-6">
                    <div class="member" data-aos="fade-up" data-aos-delay="150">
                        <div class="pic"><img src="assets/img/team/team-2.jpg" class="img-fluid" alt=""></div>
                        <div class="member-info">
                            <h4>Sarah Jhonson</h4>
                            <span>Product Manager</span>
                            <div class="social">
                                <a href=""><i class="bi bi-twitter"></i></a>
                                <a href=""><i class="bi bi-facebook"></i></a>
                                <a href=""><i class="bi bi-instagram"></i></a>
                                <a href=""><i class="bi bi-linkedin"></i></a>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="col-lg-4 col-md-6">
                    <div class="member" data-aos="fade-up" data-aos-delay="300">
                        <div class="pic"><img src="assets/img/team/team-3.jpg" class="img-fluid" alt=""></div>
                        <div class="member-info">
                            <h4>William Anderson</h4>
                            <span>CTO</span>
                            <div class="social">
                                <a href=""><i class="bi bi-twitter"></i></a>
                                <a href=""><i class="bi bi-facebook"></i></a>
                                <a href=""><i class="bi bi-instagram"></i></a>
                                <a href=""><i class="bi bi-linkedin"></i></a>
                            </div>
                        </div>
                    </div>
                </div>

            </div>

        </div>
    </section><!-- End Team Section -->

    <!-- ======= Contact Section ======= -->
    <section id="contact" class="contact section-bg">
        <div class="container" data-aos="fade-up">

            <div class="section-title">
                <h2>Contact</h2>
                <p>Magnam dolores commodi suscipit. Necessitatibus eius consequatur ex aliquid fuga eum quidem. Sit sint consectetur velit. Quisquam quos quisquam cupiditate. Et nemo qui impedit suscipit alias ea. Quia fugiat sit in iste officiis commodi quidem hic quas.</p>
            </div>

            <div class="row">
                <div class="col-lg-6">
                    <div class="info-box mb-4">
                        <i class="bx bx-map"></i>
                        <h3>Our Address</h3>
                        <p>A108 Adam Street, New York, NY 535022</p>
                    </div>
                </div>

                <div class="col-lg-3 col-md-6">
                    <div class="info-box  mb-4">
                        <i class="bx bx-envelope"></i>
                        <h3>Email Us</h3>
                        <p>contact@example.com</p>
                    </div>
                </div>

                <div class="col-lg-3 col-md-6">
                    <div class="info-box  mb-4">
                        <i class="bx bx-phone-call"></i>
                        <h3>Call Us</h3>
                        <p>+1 5589 55488 55</p>
                    </div>
                </div>

            </div>

            <div class="row">

                <div class="col-lg-6 ">
                    <iframe class="mb-4 mb-lg-0" src="https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d12097.433213460943!2d-74.0062269!3d40.7101282!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0xb89d1fe6bc499443!2sDowntown+Conference+Center!5e0!3m2!1smk!2sbg!4v1539943755621" frameborder="0" style="border:0; width: 100%; height: 384px;" allowfullscreen></iframe>
                </div>

                <div class="col-lg-6">
                    <form action="forms/contact.php" method="post" role="form" class="php-email-form">
                        <div class="row">
                            <div class="col-md-6 form-group">
                                <input type="text" name="name" class="form-control" id="name" placeholder="Your Name" required>
                            </div>
                            <div class="col-md-6 form-group mt-3 mt-md-0">
                                <input type="email" class="form-control" name="email" id="email" placeholder="Your Email" required>
                            </div>
                        </div>
                        <div class="form-group mt-3">
                            <input type="text" class="form-control" name="subject" id="subject" placeholder="Subject" required>
                        </div>
                        <div class="form-group mt-3">
                            <textarea class="form-control" name="message" rows="5" placeholder="Message" required></textarea>
                        </div>
                        <div class="my-3">
                            <div class="loading">Loading</div>
                            <div class="error-message"></div>
                            <div class="sent-message">Your message has been sent. Thank you!</div>
                        </div>
                        <div class="text-center"><button type="submit">Send Message</button></div>
                    </form>
                </div>

            </div>

        </div>
    </section><!-- End Contact Section -->

</main><!-- End #main -->

<!-- ======= Footer ======= -->
<footer id="footer">
    <div class="footer-top">
        <div class="container">
            <div class="row">

                <div class="col-lg-4 col-md-6">
                    <div class="footer-info">
                        <h3>Traveloka</h3>
                        <p class="pb-3"><em>Qui repudiandae et eum dolores alias sed ea. Qui suscipit veniam excepturi quod.</em></p>
                        <p>
                            A108 Adam Street <br>
                            NY 535022, USA<br><br>
                            <strong>Phone:</strong> +1 5589 55488 55<br>
                            <strong>Email:</strong> info@example.com<br>
                        </p>
                        <div class="social-links mt-3">
                            <a href="#" class="twitter"><i class="bx bxl-twitter"></i></a>
                            <a href="#" class="facebook"><i class="bx bxl-facebook"></i></a>
                            <a href="#" class="instagram"><i class="bx bxl-instagram"></i></a>
                            <a href="#" class="google-plus"><i class="bx bxl-skype"></i></a>
                            <a href="#" class="linkedin"><i class="bx bxl-linkedin"></i></a>
                        </div>
                    </div>
                </div>

                <div class="col-lg-2 col-md-6 footer-links">
                    <h4>Useful Links</h4>
                    <ul>
                        <li><i class="bx bx-chevron-right"></i> <a href="#">Home</a></li>
                        <li><i class="bx bx-chevron-right"></i> <a href="#">About us</a></li>
                        <li><i class="bx bx-chevron-right"></i> <a href="#">Services</a></li>
                        <li><i class="bx bx-chevron-right"></i> <a href="#">Terms of service</a></li>
                        <li><i class="bx bx-chevron-right"></i> <a href="#">Privacy policy</a></li>
                    </ul>
                </div>

                <div class="col-lg-2 col-md-6 footer-links">
                    <h4>Our Services</h4>
                    <ul>
                        <li><i class="bx bx-chevron-right"></i> <a href="#">Web Design</a></li>
                        <li><i class="bx bx-chevron-right"></i> <a href="#">Web Development</a></li>
                        <li><i class="bx bx-chevron-right"></i> <a href="#">Product Management</a></li>
                        <li><i class="bx bx-chevron-right"></i> <a href="#">Marketing</a></li>
                        <li><i class="bx bx-chevron-right"></i> <a href="#">Graphic Design</a></li>
                    </ul>
                </div>

                <div class="col-lg-4 col-md-6 footer-newsletter">
                    <h4>Our Newsletter</h4>
                    <p>Tamen quem nulla quae legam multos aute sint culpa legam noster magna</p>
                    <form action="" method="post">
                        <input type="email" name="email"><input type="submit" value="Subscribe">
                    </form>

                </div>

            </div>
        </div>
    </div>

    <div class="container">
        <div class="copyright">
            &copy; Copyright <strong><span>Squadfree</span></strong>. All Rights Reserved
        </div>
        <div class="credits">
            <!-- All the links in the footer should remain intact. -->
            <!-- You can delete the links only if you purchased the pro version. -->
            <!-- Licensing information: https://bootstrapmade.com/license/ -->
            <!-- Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/squadfree-free-bootstrap-template-creative/ -->
            Designed by <a href="https://bootstrapmade.com/">BootstrapMade</a>
        </div>
    </div>
</footer><!-- End Footer -->

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
    function showInfo(id, name) {
        document.getElementById("idCustomer").value = id;
        document.getElementById("nameCustomer").innerText = name;
    }
</script>
<div class="modal fade" id="staticBackdrop" data-backdrop="static" data-keyboard="false" tabindex="-1"
     aria-labelledby="staticBackdropLabel" aria-hidden="true">
    <div class="modal-dialog">
        <%--        thêm thẻ form--%>
        <form action="/customers?action=delete" method="post">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="staticBackdropLabel">Xóa khách hàng</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    <input hidden type="text" id="idCustomer" name="idDelete">
                    <span>Bạn có muốn xóa khách hàng </span>
                    <span class="text-danger" id="nameCustomer" name="nameDelete"></span> không?<span/>
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
