<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CRUD OPERATION</title>
</head>
<body>
<h1>EDIT PAGE</h1>
<form action="update">
<pre>
ID        : <input type="text" name="uid" value="${data.uid}"> <br>
NAME      : <input type="text" name="name" value="${data.name}"> <br>
USER NAME : <input type="text" name="uname" value="${data.uname}"> <br>
PASSWORD  : <input type="password" name="password" value="${data.password}"> <br>
CONTACT   : <input type="text" name="contact" value="${data.contact}"> <br><br>

<input type="submit" value="UPDATE">
</pre>
</form>
</body>
</html>