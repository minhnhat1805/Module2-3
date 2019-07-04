<%--
  Created by IntelliJ IDEA.
  User: joker
  Date: 20/03/2019
  Time: 22:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

  <head>
    <title>Product Discount Calculator</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
<style type="text/css">
  #content{
    width: 450px;
    margin: 0 auto;
    padding: 0px 20px 20px;
    background: red;
    border: 2px solid navy;
  }

  h1{
    color: navy;
  }

  label{
    width: 10em;
    padding-right: 1em;
    float: left;
  }

  #data input{
    float: left;
    width: 15em;
    margin-bottom: .5em;
  }

  #buttons input{
    float: left;
    margin-bottom: .5em;
  }
  br{
    clear: left;
  }
</style>
  </head>
  <body>
  <div id="content">
<h2>Product Discount Calculator</h2>

  <form action="discount.jsp  " method="post">
    <div id="data">
    <label>Product Description: </label>
    <input type="text" name="description" placeholder="description"/><br>
    <label>List Price: </label>
    <input type="text" name="price" placeholder="price" value=""/><br>
    <label>Discount Percent:</label>
    <input type="text" name="ratio" placeholder="ratio" value=""/>(%)<br>
    </div>
      <div id="buttons">
    <input type="submit" id="submit" value="Calculate Discount">
    </div>
  </form>
  </div>
  </body>
</html>
