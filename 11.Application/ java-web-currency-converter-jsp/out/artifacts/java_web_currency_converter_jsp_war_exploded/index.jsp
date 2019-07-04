<%--
  Created by IntelliJ IDEA.
  User: joker
  Date: 20/03/2019
  Time: 16:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form method="post" action="converter.jsp">
    <div class="monney"></div>
    <h1>Currency Converter</h1>
    <label>Rate:</label>
    <input type="number" name="rate" size="20">
    <br>
    <label>USD</label>
    <input type = "number" name = "usd" size="20">
    <input type="submit" value ="Converter" id="submit">
  </form>
  </body>
</html>
