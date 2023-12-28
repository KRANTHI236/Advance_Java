<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
* {
	background-image: url("Multi_Color.jpg");
	background-repeat: no-repeat;
	background-size: cover;
	height: 524p
}

#main {
	text-align: center;
	color: purple;
}

#main1 {
	margin-top: 180px;
}
</style>
<body>


	<form action="<%=request.getContextPath()%>/yellow" method="post">
		<div id="main">
			<div id="main1">
				<h1>Registration Form</h1>


				<label for="fname">Enter the fname: <input type="text"
					name="fname" id="text" placeholder="enter the fname"></label><br>
				<br> <label for="lname">Enter the lname: <input
					type="text" name="lname" id="text" placeholder="enter the lname"></label><br>
				<br> <label for="age">Enter the age: <input
					type="number" name="age" id="age" placeholder="enter the age"></label><br>
				<br> <label for="gender">gender: <input type="radio"
					name="Gender">Male <input type="radio" name="Gender">female
				</label><br> <br> <label for="pnumber">Enter the Phone
					number: <input type="number" name="pnumber" id="pnumber"
					placeholder="enter the phone number">
				</label><br> <br> <input type="submit" value="Submit"><br>
				<br>
			</div>
		</div>

	</form>

</body>
</html>