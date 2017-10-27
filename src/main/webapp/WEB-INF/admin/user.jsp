<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Administration de ${model.blogTitle }</title>
<link rel="stylesheet" href="../bootstrap/css/bootstrap.css">
<link rel="stylesheet" href="../bootstrap/css/starter-template.css">
</head>
<body>
	<c:import url="header.jsp" />
	<main role="main" class="container">
	<h1>Administration de ${model.blogTitle }</h1>
	<form action="createUser" method="post">
		<div class="form-group">
			<label for="exampleFormControlInput1">Login</label> <input
				name="login" type="text" class="form-control" id="exampleFormControlInput1"
				placeholder="Login" cols="100">
		</div>
		<div class="form-group">
			<label for="exampleFormControlInput1">Password</label> <input
				name="password" type="password" class="form-control" id="exampleFormControlInput1"
				placeholder="Password" cols="100">
		</div>
		<div class="form-group">
			<label for="exampleFormControlInput1">Email</label> <input
				name="email" type="email" class="form-control" id="exampleFormControlInput1"
				placeholder="Email" cols="100">
		</div>
		<div class="form-group">
			<label for="exampleFormControlSelect1">Role</label> 
			<select class="form-control" id="exampleFormControlSelect1" name="role" >
				<c:forEach var="role" items="${model.roles}">
					<option value="${role.id }">${role.name }</option>
				</c:forEach>
			</select>
		</div>
		<button class="btn btn-primary" type="submit">Créer la catégorie</button>
	</form>
	</main>
	<!-- /.container -->


	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script>
		window.jQuery
				|| document
						.write('<script src="../../../../assets/js/vendor/jquery.min.js"><\/script>')
	</script>
	<script src="../../../../assets/js/vendor/popper.min.js"></script>
	<script src="../../../../dist/js/bootstrap.min.js"></script>
</body>
</html>