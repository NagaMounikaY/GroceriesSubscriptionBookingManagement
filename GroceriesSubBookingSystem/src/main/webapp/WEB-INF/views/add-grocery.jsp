<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add Grocery</title>
</head>
<body>
    <h1>Add Grocery Item</h1>
    <form action="${pageContext.request.contextPath}/groceries/add" method="post" enctype="multipart/form-data">
        <input type="text" name="groceryName" placeholder="Grocery Name" required/><br>
        <textarea name="description" placeholder="Description"></textarea><br>
        <input type="number" name="grocery_price" placeholder="Price" step="0.01" required/><br>
        <input type="number" name="in_stock" placeholder="In Stock" required/><br>
        <input type="file" name="imageURL" required/><br>

        <input type="submit" value="Add Grocery"/>
    </form>

    <c:if test="${not empty message}">
        <p>${message}</p>
    </c:if>
</body>
</html>
