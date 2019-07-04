<%--
  Created by IntelliJ IDEA.
  User: joker
  Date: 22/03/2019
  Time: 00:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <style>
        table, th, td {
            border: 1px solid blue;
            border-collapse: collapse;
        }
        td {
            padding: 15px;
            text-align: left;
            width: 100px;
        }

    </style>
    <title>Account List</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <style type="text/css">
        #content{
            width: 450px;
            margin: 0 auto;

            padding: 5px 20px 20px;
            border: 5px solid black;
        }
    </style>
</head>
<body>

<form action="AccountServlet" method="get">
    <div id="content">
<h2 align="center">  DANH SACH KHACH HANG</h2>
<hr  width="440" align="left"/>
        <table style="width:80%">
            <tr>
                <th width="100">Name</th>
                <th>Birthday</th>
                <th>Address</th>
                <th>Image</th>
            </tr>

                <c:forEach items="${accounts}" var="acc">
                    <tr  style="width:100%" align="left">
                        <td>${acc.accountName}</td>
                        <td> ${acc.birthDay} </td>
                        <td> ${acc.address}</td>
                        <td><img src="${acc.image}"width="60px" height="60px"></td>
                    </tr>

                </c:forEach>
        </table>
    </div>
</form>
</body>
</html>
