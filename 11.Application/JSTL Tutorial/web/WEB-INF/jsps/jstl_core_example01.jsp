<%--
  Created by IntelliJ IDEA.
  User: joker
  Date: 21/03/2019
  Time: 23:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>JSTL Core Tags Example 01</title>
</head>
<body>
<h2>Departments and Employees</h2>

<!-- Dùng for để duyệt trên các phòng ban (departments) -->
<c:forEach items="${departments}" var="dept">

    <h3>${dept.deptName}</h3>

        <!-- Dùng for để duyệt trên các nhân viên
                    thuộc phòng ban hiện tại -->
        <c:forEach items="${dept.employees}" var="emp">
            <li>
                    ${emp.empName} - (${emp.job})
            </li>
        </c:forEach>

</c:forEach>

</body>
</html>
