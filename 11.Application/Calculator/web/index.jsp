<%--
  Created by IntelliJ IDEA.
  User: joker
  Date: 21/03/2019
  Time: 10:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Simple Calculator</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <style type="text/css">
      #window-title h2{

        width: 450px;
        margin: 0 auto;
        padding: 5px 20px 20px;
      }
      #content{
        width: 450px;
        margin: 0 auto;

        padding: 5px 20px 20px;
        border: 5px solid black;
      }
      h2{
        margin: 0 auto;
        size: 50px;
      }
      label {
        width: 10em;
        padding-right: 0em;
        float: left;
      }
      #buttons {
        float: left;
      margin-bottom: 10em;
      }
      #content label{
        float: left;
        margin: 0 auto;
      }
    </style>
  </head>
  <body>
  <div id="window-title">
  <h2>Simple Calculator</h2>
  </div>
  <form action="calculator" method="post">


    <div id="content">
      <label>Calculator </label><br>
    <label>First operand :</label>
    <input type="text" name="first" placeholder="First number" value=""><br>

    <label>Operator:</label>
      <select name="operator">
        <option value="Addition">Addition</option>
        <option value="Subtraction">Subtraction</option>
        <option value="Division">Division</option>
        <option value="Multiplication">Multiplication</option>
      </select><br>

    <label>Second operator:</label>
    <input type="text" name="second" placeholder="Second number" value=""><br>

      <div id="buttons">
        <input type="submit" id="submit" value="Calculate">
      </div>

    </div>
  </form>
  </body>
</html>
