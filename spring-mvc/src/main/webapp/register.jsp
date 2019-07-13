<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
	<form action="register" method=POST enctype="multipart/form-data">

		<h1 align="center">Create Account</h1>
		<label> Username </label> 
		<input type="text" name="uname" placeholder="Between 2-50 Characters" /><br/>
		<label> Telephone </label>
		<input name="tphone" placeholder="10 Digits" /><br/>
		<label> Email </label> 
		<input name="email" type="email" placeholder="Example@Example.com" /> <br/>
		<label>Password </label> 
		<input name="password" type="password" placeholder="Minimum 6 Chars" /><br/>
		Select File: <input type="file" name="file"/><br/>
		<button type="submit">Create Account</button>
		
	</form>
</body>
</html>