
<html>
<body>
	<form action="<%= request.getContextPath() %>/servlet1" method="post">
		<h2>Registration Form</h2>
		Enter the id <input type="number" name="id" placeholder="enter the id">
		<br> <br> 
		Enter the fname <input type="text" name="fname"placeholder="enter the first name"> 
		<br> <br>
		Enter the lname <input type="text" name="lname"placeholder="enter the last name"> 
		<br> <br>
		Enter the age <input type="number" name="age" placeholder="enter the age">
		<br> <br> 
		<input type="submit">

	</form>

</body>
</html>
