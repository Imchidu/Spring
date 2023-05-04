<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Details</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
	integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
	crossorigin="anonymous">
<style type="text/css">
body {
	font-size: large;
	font-style: oblique;
}

h1 {
	text-align: center;
	text-decoration: underline;
	font-size: xx-large;
	font-weight: bold;
}

form {
	font-style: italic;
	font-size: xx-large;
	font: bold;
	color: aqua;
	text-align: center;
}

#inputName {
	height: 50px;
}

button {
	width: 200px;
}

p {
	text-align: center;
	font-size: xx-large;
	font-weight: bold;
}
</style>
</head>
<body>
	
<nav>
		<div class="container-fluid">
			<a class="navbar-brand">NAVBAR</a>
				<form class="d-flex">
				</form>
			
			<a href="Search.jsp">Search</a>
					<!-- <input class="form-control me-2" type="search" placeholder="Search"
						aria-label="Search">
					<button class="btn btn-outline-success" type="submit">Search</button>
			 -->
		</div>
		
	</nav>


	<h1>Student Informations</h1>
	<p style="color: yellow;">${message}</p>
	<p style="color: red;">${error}</p>


	<form action="save" method="post"  style="text-align: center;">

		<pre>
Name   :<input type="text" id="inputName" name="name"
				value="${dto.name }" placeholder="name">

Address:<input type="text" name="address" value="${dto.address }"
				placeholder="address">


<button type="submit" class="btn btn-primary ">SUBMIT</button>

</pre>


	</form>
	
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx"
		crossorigin="anonymous"></script>
</body>
</html>