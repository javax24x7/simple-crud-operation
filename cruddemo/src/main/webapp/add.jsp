<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add User</title>
</head>
<body>
<h3>Add User</h3>
<form action="${contextPath}/add" id="updateUser" name="updateUser" method="post">
<label>First Name : </label><input id="firstName" name="firstName" type="text" > <br/>
<label>Last Name : </label><input id="lastName" name="lastName" type="text" > <br/>
<label>Username : </label><input id="username" name="username" type="text"> <br/>
<label>Password : </label><input id="password" name="password" type="password" > <br/>
<input type="submit" value="submit"> <br/>
</form>
</body>
</html>