<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: ismayilovasgar
  Date: 29/10/2025
  Time: 23:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h3>Information for all employees</h3>

<security:authorize access="hasRole('HR')">
    <input type="button" value="Salary" onclick="window.location.href='hr_info'"/>
    only HR staff
</security:authorize>

<br><br>

<security:authorize access="hasRole('Manager')">
    <input type="button" value="Performance" onclick="window.location.href='manager_info'"/>
    only Manager staff
</security:authorize>

</body>
</html>
