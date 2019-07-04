<%--
  Created by IntelliJ IDEA.
  User: joker
  Date: 21/03/2019
  Time: 10:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<style type="text/css">
    #content{
        width: 450px;
        margin: 0 auto;
        padding: 0px 20px 20px;
        background: cornflowerblue;
        border: 2px solid navy;


    }

    #data input{
        float: left;
        width: 15em;
        margin-bottom: .5em;
    }
    label{
        width: 10em;
        padding-right: 1em;
        float: left;
    }
</style>
<head>
    <title>Discount:</title>
</head>
<body>

<%
    Float price = Float.parseFloat(request.getParameter("price"));
    Float ratio = Float.parseFloat(request.getParameter("ratio"))/100;
    String description = request.getParameter("description");

    Float discount = price *ratio;

%>
<div id="content">
    <div id="data">
        <label>Description:</label>
<h1><%=description%></h1>
        <label>Discount:</label>
<h1><%=discount%></h1>
    </div>
</div>
</body>
</html>
