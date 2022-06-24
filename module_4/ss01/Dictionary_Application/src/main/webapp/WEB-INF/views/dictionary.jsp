<%--
  Created by IntelliJ IDEA.
  User: HELLO
  Date: 6/24/2022
  Time: 8:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Convert</title>
</head>
<body>
<h1>Dictionary</h1>
<form method="post" action="result">
    <label>USD: </label>
    <input name="word" type="text">
    <button>Translate</button>
</form>
<h1>${result}</h1>
</body>
</html>
