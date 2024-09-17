<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Order Details</title>
</head>
<body>
    <h1>Order Details List</h1>
    <a href="${pageContext.request.contextPath}/order-details/add">Add New Order Details</a>
    <table>
        <tr>
            <th>Order Detail ID</th>
            <th>Order ID</th>
            <th>Grocery ID</th>
            <th>Subscription ID</th>
            <th>Quantity</th>
            <th>Item Price</th>
            <th>Order Item Name</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="orderDetail" items="${orderDetailsList}">
            <tr>
                <td><c:out value="${orderDetail.order_detail_id}"/></td>
                <td><c:out value="${orderDetail.order.order_id}"/></td>
                <td><c:out value="${orderDetail.groceries.grocery_id}"/></td>
                <td><c:out value="${orderDetail.subscription.subscription_id}"/></td>
                <td><c:out value="${orderDetail.quantity}"/></td>
                <td><c:out value="${orderDetail.item_price}"/></td>
                <td><c:out value="${orderDetail.oredr_item_name}"/></td>
                <td>
                    <a href="${pageContext.request.contextPath}/order-details/${orderDetail.order_detail_id}">View</a> |
                    <a href="${pageContext.request.contextPath}/order-details/delete/${orderDetail.order_detail_id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
