<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add Order Details</title>
</head>
<body>
    <h1>Add Order Details</h1>
    <form action="${pageContext.request.contextPath}/order-details/add" method="post">
        <label for="order">Order ID:</label>
        <input type="text" id="order" name="order.order_id" required><br>

        <label for="grocery">Grocery ID:</label>
        <input type="text" id="grocery" name="groceries.grocery_id"><br>

        <label for="subscription">Subscription ID:</label>
        <input type="text" id="subscription" name="subscription.subscription_id"><br>

        <label for="quantity">Quantity:</label>
        <input type="number" id="quantity" name="quantity" required><br>

        <label for="itemPrice">Item Price:</label>
        <input type="text" id="itemPrice" name="item_price" required><br>

        <label for="itemName">Order Item Name:</label>
        <input type="text" id="itemName" name="oredr_item_name" required><br>

        <input type="submit" value="Add Order Details">
    </form>
</body>
</html>
