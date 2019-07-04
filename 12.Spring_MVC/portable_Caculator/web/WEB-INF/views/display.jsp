<%--
  Created by IntelliJ IDEA.
  User: joker
  Date: 02/04/2019
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Caculator</title>
</head>
<body>
<h3>Caculator</h3>
<form action="caculator" method="post">
    <input type="text" name="first" placeholder="First number">
    <input type="text" name="second" placeholder="Second number"><br><br>

    <input type="submit" name="choose" value="Addition(+)">
    <input type="submit" name="choose" value="Subtraction(-)">
    <input type="submit" name="choose" value="Multiplication(X)">
    <input type="submit" name="choose" value="Division(/)">
</form>
    <br>
    <h3 style="color:red">${message}</h3>


</body>
</html>
