<%--
  Created by IntelliJ IDEA.
  User: HELLO
  Date: 5/27/2022
  Time: 8:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>Header</title>
    <style>
        nav {
            width: 80%;
            margin: 0 auto;
            background: #fff;
            /*padding: 10px 0;*/
            box-shadow: 0px 5px 0px #dedede;
        }
        nav ul {
            list-style: none;
            text-align: center;
        }
        nav ul li {
            display: inline-block;
        }
        nav ul li a {
            display: block;
            padding: 15px;
            text-decoration: none;
            color: #17a2b8f0;
            font-weight: 800;
            text-transform: uppercase;
            /*margin: 0 10px;*/
            margin-left: 100px;
        }
        nav ul li a,
        nav ul li a:after,
        nav ul li a:before {
            transition: all .5s;
        }
        nav ul li a:hover {
            color: #555;
        }

        /* SHIFT */
        nav.shift ul li a {
            position:relative;
            z-index: 1;
        }
        nav.shift ul li a:hover {
            color: black;
            text-decoration: none;
        }
        nav.shift ul li a:after {
            display: block;
            position: absolute;
            top: 0;
            left: 0;
            bottom: 0;
            right: 0;
            margin: auto;
            width: 100%;
            height: 1px;
            content: '.';
            color: transparent;
            background: sandybrown;
            /*visibility: none;*/
            opacity: 0;
            z-index: -1;
        }
        nav.shift ul li a:hover:after {
            opacity: 1;
            visibility: visible;
            height: 100%;
        }
        span.Logos {
            font-weight: 400;
            font-family: 'Bangers', cursive;
            font-size: 50px;
            text-align: center;
            letter-spacing: 3px;
            text-shadow: 2px 2px 0px #2d303a, -2px -2px 0px #2d303a, -2px 2px 0px #2d303a, 2px -2px 0px #2d303a;
            color: #17a2b8;
            margin-left: 20px;
        }
         /*css ảnh động   */
        .git {
            width: 150px;
            height: 150px;
            position: relative;
            -webkit-animation-name: example;
            -webkit-animation-duration: 20s;
            /*-webkit-animation-delay: 1s;*/
            animation-name: example;
            animation-duration: 20s;
            animation-iteration-count: infinite;
        }

        @-webkit-keyframes example {
            0% { left:0px; top:0px;}
            25% { left:900px; top:0px;}
            50% { left:0px; top:0px;}
            75% { left:900px; top:0px;}
            100% { left:0px; top:0px;}
            /*50% { left:200px; top:200px;}*/
            /*75% {left:0px; top:200px;}*/
            /*100% { left:0px; top:0px;}*/
        }
         /*   end css ảnh động*/

        /*xoay ảnh 360 độ*/
        img {
            -webkit-transition:all 0.5s ease-out;
            -moz-transition:all 0.5s ease-out;
            -ms-transition:all 0.5s ease-out;
            -o-transition:all 0.5s ease-out;
            transition:all 0.5s ease-out;
        }
        img:hover {
            -webkit-transform:rotate(360deg);
            -moz-transform:rotate(360deg);
            -ms-transform:rotate(360deg);
            -o-transform:rotate(360deg);
            transform:rotate(360deg);
        }
        /*xoay ảnh 360 độ*/
    </style>
</head>
<body>

<div class="header-top">
    <div class="content-fluid" style="margin: 10px; height: 30px">
        <div class="row" >
            <div class="col-md-4"><img style="height: 30px" src="img/sun.png"><span>&nbsp;Thời tiết:  28 °C/82 °F </span></div>
            <div class="col-md-4"><img style="height: 30px" src="img/clock.png"><span>&nbsp;Ngày giờ:&nbsp;<span id="date"></span> </span></div>
            <div class="col-md-4">
                    <img style="height: 30px" src="img/woman.png">
                    <span>&nbsp;
                        Trần Nguyễn Diễm Hoàng
                         <form method="post" action="/login?action=logout"  class="form-inline my-2 my-lg-0">
                        <button  class="btn btn-outline-success my-2 my-sm-0" type="submit" >LogOut</button>
                    </form>
                    </span>
            </div>
        </div>
    </div>
    <div class="row" style="margin-top: 30px">

        <div class="col-md-4" >
                <img style="height: 100px" src="/img/travel-and-tourism.png">
                <span class="Logos">Traveloka</span>
<%--                <img src="img/travel.png" class="git">--%>
        </div>
        <div class="col-md-8 row">
<%--                            <img src="img/travel.png" class="git">--%>
<%--            <div class="col-md-2">--%>
<%--                <img src="/img/sunrise.png" style="height: 200px">--%>

<%--            </div>--%>
<%--            <div class="col-md-2">--%>
<%--                <img src="/img/fast-food.png" style="height: 200px">--%>
<%--            </div>--%>
<%--            <div class="col-md-2">--%>
<%--                <img src="/img/sunrise.png" style="height: 200px">--%>
<%--            </div>--%>
<%--            <div class="col-md-2">--%>
<%--                <img src="/img/sunrise.png" style="height: 200px">--%>
            </div>
<%--                <img src="/img/fast-food.png.png" style="height: 100px; margin-left: 50px">--%>

<%--                <img src="/img/sunrise.png" style="height: 100px;  margin-left: 50px">--%>

<%--                <img src="/img/sunrise.png" style="height: 100px;  margin-left: 50px">--%>

        </div>

    </div>
</div>

<nav class="shift">
    <ul>
        <li><a href="/home">Home</a></li>
        <li><a href="/employees">Employee</a></li>
        <li><a href="/customers">Customer</a></li>
        <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown" aria-expanded="false">
                Service
            </a>
            <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                <a class="dropdown-item" href="/service?action=showFormAddServiceVilla">Add Service Villa</a>
                <a class="dropdown-item" href="/service?action=showFormAddServiceHouse">Add Service House</a>
                <a class="dropdown-item" href="/service?action=showFormAddServiceRoom">Add Service Room</a>
            </div>
        </li>
        <li><a href="/contracts">Contract</a></li>
    </ul>
</nav>

<script>
    var today = new Date();
    var date = today.getDate()+'-'+(today.getMonth()+1)+'-'+today.getFullYear();
    document.getElementById("date").innerHTML = date;

    var el = document.getElementById('time_span')
    setInterval(function() {

        var currentTime = new Date(),
            hours = currentTime.getHours(),
            minutes = currentTime.getMinutes(),
            ampm = hours > 11 ? 'PM' : 'AM';

        hours += hours < 10 ? '0' : '';
        minutes += minutes < 10 ? '0' : '';

        el.innerHTML = hours + ":" + minutes + " " + ampm;
    }, 1000);

    GetTime();

    function GetTime(){
        var CurrentTime = new Date()
        var hour = CurrentTime.getHours()
        var minute = CurrentTime.getMinutes()
        var second = CurrentTime.getSeconds()

        if(minute < 10){
            minute = "0" + minute
        }

        if(second < 10){
            second = "0" + second
        }

        var GetCurrentTime = hour + ":" + minute + ":" + second + " ";

        if(hour > 11){
            GetCurrentTime += "p.m."
        }else{
            GetCurrentTime += "a.m."
        }

        document.getElementById("CurrentTime").innerHTML = GetCurrentTime;
        setTimeout(GetTime,1000)
    }
</script>
</body>
</html>
