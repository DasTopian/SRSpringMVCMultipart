<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<h1>${message}</h1>
<form method=POST action="login">
<label>Username</label>
<input type="text" name="uname"/><br>
<label>Password</label>
<input type="password" name="password"/><br>
<input type="submit"/>
</form>
</body>
</html>