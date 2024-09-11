<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Order Details</title>
</head>
<body>
    <h1>Order Details</h1>
    <c:if test="${not empty order}">
        <p><strong>Order ID:</strong> <c:out value="${order.order_id}"/></p>
        <p><strong>Total Amount:</strong> <c:out value="${order.totalAmount}"/></p>
        <p><strong>Status:</strong> <c:out value="${order.orderStatus}"/></p>
        <p><strong>Order Date:</strong> <c:out value="${order.order_date}"/></p>
        <a href="${pageContext.request.contextPath}/orders">Back to Orders List</a>
    </c:if>
    <c:if test="${empty order}">
        <p>Order not found.</p>
    </c:if>
</body>
</html>
