<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert Values</title>

</head>
<body>
	<form action="<%= request.getContextPath() %>/hibernate_vth_servlet"
		method="post">
		Enter the id: <input type="number" name="id"
			placeholder="enter the id"> <br> <br> Enter the
		name:<input type="text" name="name1" placeholder="enter the name">
		<br> <br> Enter the age: <input type="number" name="age"
			placeholder="enter the age"> <br> <br> <input
			type="submit">
	</form>
</body>
</html>