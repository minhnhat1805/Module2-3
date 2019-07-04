<%--
  Created by IntelliJ IDEA.
  User: joker
  Date: 28/03/2019
  Time: 09:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Money conversion</title>
  </head>
  <body>

  <h2>Conversion Money</h2>
  <form action="/money" method="post">
    <label>USD</label>
    <input type="number" name="USD" placeholder="usd" /><br>
    <label>Rate</label>
    <input type="text"  name="rate"/>
    <input type="submit" id="submit" value="Submit">
  </form>
  </body>
</html>
