<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>List of Orders</title>
</head>
<body>
    <h1>List of Orders</h1>

    <table border="1">
        <thead>
            <tr>
                <th>Order ID</th>
                <th>User ID</th>
                <th>Subscription ID</th>
                <th>Total Amount</th>
                <th>Status</th>
                <th>Date</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${orders}" var="order">
                <tr>
                    <td>${order.order_id}</td>
                    <td>${order.users.user_id}</td>
                    <td>${order.subscription.subscription_id}</td>
                    <td>${order.totalAmount}</td>
                    <td>${order.orderStatus}</td>
                    <td>${order.order_date}</td>
                    <td>
                        <a href="${pageContext.request.contextPath}/orders/details?order_id=${order.order_id}">View Details</a>
                        <!-- Form to update order status -->
                        <form action="${pageContext.request.contextPath}/orders/update-status" method="post" style="display:inline;">
                            <input type="hidden" name="order_id" value="${order.order_id}" />
                            <select name="status">
                                <option value="Pending" <c:if test="${order.orderStatus == 'Pending'}">selected</c:if>>Pending</option>
                                <option value="Processed" <c:if test="${order.orderStatus == 'Processed'}">selected</c:if>>Processed</option>
                                <option value="Shipped" <c:if test="${order.orderStatus == 'Shipped'}">selected</c:if>>Shipped</option>
                                <option value="Delivered" <c:if test="${order.orderStatus == 'Delivered'}">selected</c:if>>Delivered</option>
                                <option value="Cancelled" <c:if test="${order.orderStatus == 'Cancelled'}">selected</c:if>>Cancelled</option>
                            </select>
                            <input type="submit" value="Update Status" />
                        </form>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    
    <a href="${pageContext.request.contextPath}/orders/add">Add New Order</a>
</body>
</html>

