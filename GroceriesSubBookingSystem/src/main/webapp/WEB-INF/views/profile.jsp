<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
    <title>Profile</title>
</head>
<body>
    <h2>Profile</h2>
    <form action="${pageContext.request.contextPath}/users/profile" method="post">
        <input type="hidden" name="user_id" value="${user.user_id}">
        <label for="user_Name">Name:</label>
        <input type="text" id="user_Name" name="user_Name" value="${user.user_Name}" required><br>
        <label for="userEmail">Email:</label>
        <input type="email" id="userEmail" name="userEmail" value="${user.userEmail}" required><br>
        <label for="userPassword">Password:</label>
        <input type="password" id="userPassword" name="userPassword" value="${user.userPassword}" required><br>
        <label for="userMobileNumber">Mobile Number:</label>
        <input type="text" id="userMobileNumber" name="userMobileNumber" value="${user.userMobileNumber}" required><br>
        <button type="submit">Update Profile</button>
    </form>
    <p>${message}</p>
</body>
</html>
    