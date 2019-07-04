<%--
  Created by IntelliJ IDEA.
  User: joker
  Date: 28/03/2019
  Time: 13:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Distionary</title>
</head>
<body>
<h2>
    Translate
</h2>
<form action="/translate"method="post">
    <label>English</label>
    <input type="text" name="english" placeholder="english"/>
    <input type="submit" id="submit" value="Translate"/>
</form>
</body>
</html>
