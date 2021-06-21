<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add New Order</title>
</head>
<body>
<div align="center" style="color: pink;font-size: 24px">
<h3>Add New Order</h3>
</div>
<div align="center">
<s:form action="addAction">
<s:textfield name="orderId" label="Order Id"></s:textfield><br/>
<s:textfield name="orderName" label="Order Name"></s:textfield><br/>
<s:textfield name="orderQuality" label="Order Quality"></s:textfield><br/>
<s:textfield name="orderPrice" label="Order Pice"></s:textfield><br/>
<s:submit value="AddOrder"></s:submit>
</s:form>
</div>
</body>
</html>