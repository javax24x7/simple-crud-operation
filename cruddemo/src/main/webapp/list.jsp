<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List User</title>
</head>
<body>
<h3>List User</h3>
<h4><a href = "${contextPath}/add">Add User</a></h4>
	<table>
		<thead>
			<th>ID</th>
			<th>FIRST NAME</th>
			<th>LAST NAME</th>
			<th>USERNAME</th>
			<th>ACTIVE</th>
			<th colspan="2">ACTION</th>
		</thead>

		<tbody>
			<c:forEach var="userBean" items="${list}">
				<tr>
					<td>${userBean.id}</td>
					<td>${userBean.firstName}</td>
					<td>${userBean.lastName}</td>
					<td>${userBean.username}</td>
					<td>${userBean.active}</td>
					<td><a href="${contextPath}/edit/${userBean.id}">EDIT</a></td>
					<td><a href="${contextPath}/delete/${userBean.id}">DELETE</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>