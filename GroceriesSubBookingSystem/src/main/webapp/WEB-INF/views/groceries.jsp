<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>List of Groceries</title>
</head>
<body>
    <h1>List of Groceries</h1>
    
     <!-- Search Form -->
    <form action="${pageContext.request.contextPath}/groceries/search" method="post">
        <input type="text" name="query" placeholder="Search by grocery name"/>
        <input type="submit" value="Search"/>
    </form>
    
    <table border="1">
        <thead>
            <tr>
                <th>Grocery Name</th>
                <th>Description</th>
                <th>Price</th>
                <th>Stock</th>
                <th>Image</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${groceries}" var="grocery">
                <tr>
                    <td>${grocery.groceryName}</td>
                    <td>${grocery.description}</td>
                    <td>${grocery.grocery_price}</td>
                    <td>${grocery.in_stock}</td>
                    <td><img src="${pageContext.request.contextPath}/uploaded/${grocery.imageURL}" alt="${grocery.groceryName}" width="100"/></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>

