<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add Category</title>
</head>
<body>
    <h1>Add Category</h1>
    <form action="${pageContext.request.contextPath}/categories/add" method="post">
        <label for="category_name">Category Name:</label>
        <input type="text" id="category_name" name="category_name" required /><br/>

        <input type="submit" value="Add Category" />
    </form>

    <c:if test="${not empty message}">
        <p>${message}</p>
    </c:if>
</body>
</html>

