<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Jsp adding example_jsp</title>
</head>
<!-- adding the color for the body -->
<body bgcolor="cyan">

<!-- we alsway write the java code as following and dont forget the brackets -->
<%
	/*while using Jsp the java code neccessarry objects will also be provided free*/
	
 	/*fetching the values from html file*/
	int i = Integer.parseInt(request.getParameter("num1"));
	int j = Integer.parseInt(request.getParameter("num2"));

	/*calculation*/
	int k = j + i;
	
	out.println("The output is: " + k);
	
%>

</body>
</html>