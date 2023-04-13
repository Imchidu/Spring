<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<title>Mobile Information</title>
<style type="text/css">
body {
	background-color: blue;
	background-image:
		url("https://i0.wp.com/www.alphr.com/wp-content/uploads/2020/09/pixabay-waterfalls-2987477_1920.jpg?resize=768%2C451&ssl=1");
	background-repeat: no-repeat;
	background-size: 100%;
}

p {
	text-align: center;
	font-size: xx-large;
	font-weight: bold;
	font-style: oblique;
}

form {
	font-size: x-large;
	font-weight: bold;
	font-style: italic;
	color: orange;
}

h1 {
	text-align: center;
	font-size: xx-large;
	font-style: italic;
	font-weight: bolder;
	text-decoration: underline;
	color: fuchsia;
}
</style>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-info"
		style="font-style: oblique;">
		<img alt=""
			src="https://www.thechennaimobiles.com/image/catalog/A%20showroom%20images/IMG_20181127_124843.jpg"
			width="150" height="75">
		<div class="container-fluid">

			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarNav"
				aria-controls="navbarNav" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNav">
				<ul class="navbar-nav">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="#">Home</a> <a class="nav-link active"
						aria-current="page" href="Search.jsp">SEARCH</a></li>


				</ul>
			</div>
		</div>
	</nav>
	<h1>Mobile Information</h1>
	<p style="color: yellow;">${message}</p>
	<p style="color: red;">${error}</p>

	<form action="save" method="post" style="text-align: center;">
		<pre>
  Brand :  <input type="text" name="brand" value="${entity.brand}"
				placeholder="brand">
  
  color:   <input type="text" name="color" value="${entity.color}"
				placeholder="color">
  
  price:  <input type="text" name="price" value="${entity.price}"
				placeholder="price">
  
  Type:    <input type="text" name="type" value="${entity.type}"
				placeholder="type">
  

  
     <input type="submit" value="submit" class="btn-primary">
         <!-- -  <button type="button" class="btn btn-primary" value="save">Submit</button> --->
    
     </pre>




	</form>

	<!-- Optional JavaScript; choose one of the two! -->

	<!-- Option 1: Bootstrap Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>

	<!-- Option 2: Separate Popper and Bootstrap JS -->
	<!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    -->
</body>
</html>