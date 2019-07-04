<%--
  Created by IntelliJ IDEA.
  User: joker
  Date: 28/03/2019
  Time: 14:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Translate</title>
</head>
<body>
<h3> Translate
</h3>
<c:choose>
    <c:when test="${vietnamese==null}">
        <p>Khong tim thay!</p>
        <br/>
    </c:when>

    <c:otherwise>
        <p>    ${english} :co nghia la ${vietnamese} </p>
        <br/>
    </c:otherwise>
</c:choose>


</body>
</html>
