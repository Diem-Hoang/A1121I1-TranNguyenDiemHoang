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
    <%--    <%@include file="template/header.jsp"%>--%>
    <meta charset="utf-8">
    <meta content="width=device-width, initial-scale=1.0" name="viewport">

    <title>Footer</title>
    <meta content="" name="description">
    <meta content="" name="keywords">

    <!-- Favicons -->
    <link href="assets/img/favicon.png" rel="icon">
    <link href="assets/img/apple-touch-icon.png" rel="apple-touch-icon">

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
    &copy; Copyright <strong><span>MY WEBSITE</span></strong>. All Rights Reserved
    </div>
    <div class="credits">
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
    </body>
    </html>
