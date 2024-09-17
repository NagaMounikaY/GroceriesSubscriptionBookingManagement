<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add Order</title>
</head>
<body>
    <h1>Add Order</h1>
    <form action="${pageContext.request.contextPath}/orders/add" method="post">
        <!-- Include fields for order details -->
        <label for="user_id">User ID:</label>
        <input type="text" id="user_id" name="user_id" required /><br/>

        <label for="subscription_id">Subscription ID:</label>
        <input type="text" id="subscription_id" name="subscription_id" required /><br/>

        <label for="totalAmount">Total Amount:</label>
        <input type="number" step="0.01" id="totalAmount" name="totalAmount" required /><br/>

        <label for="orderStatus">Order Status:</label>
        <select id="orderStatus" name="orderStatus">
            <option value="Pending">Pending</option>
            <option value="Processed">Processed</option>
            <option value="Shipped">Shipped</option>
            <option value="Delivered">Delivered</option>
            <option value="Cancelled">Cancelled</option>
        </select><br/>

        <input type="submit" value="Add Order" />
    </form>

    <c:if test="${not empty message}">
        <p>${message}</p>
    </c:if>
</body>
</html>

