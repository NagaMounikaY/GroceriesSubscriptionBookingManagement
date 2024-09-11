<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h2>Login</h2>
    <form action="${pageContext.request.contextPath}/users/login" method="post">
        <label for="userEmail">Email:</label>
        <input type="email" id="userEmail" name="userEmail" required><br>
        <label for="userPassword">Password:</label>
        <input type="password" id="userPassword" name="userPassword" required><br>
        <button type="submit">Login</button>
    </form>
    <p>${error}</p>
</body>
</html>
