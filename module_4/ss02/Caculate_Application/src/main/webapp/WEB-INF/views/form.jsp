<%--
  Created by IntelliJ IDEA.
  User: HELLO
  Date: 6/27/2022
  Time: 8:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="caculate" method="post">
    <input type="number" name="num1" value="${num1}">
    <input type="number" name="num2" value="${num2}"><br>
    <button type="submit" name="caculate" value="cong">Cộng</button>
    <button type="submit" name="caculate" value="tru">Trừ</button>
    <button type="submit" name="caculate" value="nhan">Nhân</button>
    <button type="submit" name="caculate" value="chia">Chia</button>
</form>
<p>${result}</p>
</body>
</html>
