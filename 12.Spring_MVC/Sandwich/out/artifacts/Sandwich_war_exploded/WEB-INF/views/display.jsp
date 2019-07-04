<%--
  Created by IntelliJ IDEA.
  User: joker
  Date: 02/04/2019
  Time: 10:17
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sandwich</title>
</head>
<body>
<span>List Sandwich which choosed: </span><br>

<c:forEach items="${sandwich}" var="abc" >
    ${abc}<br>
</c:forEach>


</body>
</html>
