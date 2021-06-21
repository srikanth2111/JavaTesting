<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>
	<div align="center">
		<h1>Welcome Page</h1>
		<a href="addOrder.jsp">
		  <button style="color: red">Add New Order</button>
		</a>
	</div>
	<table width="750" align="center">
		<thead>
			<tr>
				<th>Order Id</th>
				<th>Order Name</th>
				<th>Order Quality</th>
				<th>Order Price</th>
				<th colspan="2">Actions</th>
			</tr>
		</thead>
		<s:iterator value="orders" var="order">
			<tr>
				<td><s:property value="#order.orderId" /></td>
				<td><s:property value="#order.orderName" /></td>
				<td><s:property value="#order.orderQuality" /></td>
				<td><s:property value="#order.orderPrice" /></td>
				<td>
				<a href="updateOrder.jsp?orderId=<s:property value="#order.orderId" />">
				<button>Update</button>
				</a>
				</td>
				<td>Delete</td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>