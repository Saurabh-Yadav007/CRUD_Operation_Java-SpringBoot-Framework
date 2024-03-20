<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CRUD OPERATION</title>
<script type="text/javascript">
function addUser()
{
	document.fn.action="openregister";
	document.fn.submit();
}
function editUser()
{
	document.fn.action="edit";
	document.fn.submit();
}
function deleteUser()
{
	document.fn.action="delete";
	document.fn.submit();
}
</script>
</head>
<body>
<form name="fn">
<h1>LOGIN SUCCESS......</h1>
<table border="1">
<tr>
<th>Select</th>
<th>UID</th>
<th>NAME</th>
<th>USER NAME</th>
<th>PASSWORD</th>
<th>CONTACT</th>
<th colspan="3">ACTION</th>
</tr>
<c:forEach items="${data}" var="s">
<tr>
<td><input type="radio" name="uid" value="${s.uid}"></td>
<td>${s.uid} </td>
<td>${s.name} </td>
<td>${s.uname} </td>
<td>${s.password} </td>
<td>${s.contact} </td>
<td><input type="button" value="ADD" onclick="addUser()"></td>
<td><input type="button" value="EDIT" onclick="editUser()"></td>
<td><input type="button" value="DELETE" onclick="deleteUser()"></td>
</tr>
</c:forEach>
</table>
</form>
</body>
</html>