<%--
  Created by IntelliJ IDEA.
  User: joker
  Date: 02/04/2019
  Time: 00:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sandwich Condiments</title>
</head>
<body><h2>Sandwich Condiments</h2>

<h3 style="color:red">${message}</h3>

<form action="save" method="post">
    <input type="checkbox"  name="sandwich" value="Lettuce">Lettuce<br>
    <input type="checkbox"  name="sandwich" value="Tomato">Tomato<br>
    <input type="checkbox"  name="sandwich" value="Mustard" >Mustard<br>
    <input type="checkbox"  name="sandwich" value="Sprouts">Sprouts<br>
    <input type="hidden" name="sandwich" value="nhatcho" >
    <br>
    <input type="submit" value="Save">
</form>
</body>
</html>
