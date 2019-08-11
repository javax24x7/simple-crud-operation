<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit User</title>
</head>
<body>
<h3>Edit User</h3>
<form action="${contextPath}/update" id="updateUser" name="updateUser" method="post">
<input type="hidden" id="id" name = "id" value="${userBean.id}" value="${userBean.id}"> <br/>
<label>First Name : </label><input id="firstName" name="firstName" type="text" value="${userBean.firstName}"> <br/>
<label>Last Name : </label><input id="lastName" name="lastName" type="text" value="${userBean.lastName}"> <br/>
<label>Username : </label><input id="username" name="username" type="text" value="${userBean.username}"> <br/>
<label>Password : </label><input id="password" name="password" type="password" value="${userBean.password}"> <br/>
<input type="submit" value="update"> <br/>
</form>
</body>
</html>