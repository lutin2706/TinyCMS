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
	<table class="table table-striped">
		<thead>
			<tr>
				<th scope="col">Title</th>
				<th scope="col">Category</th>
				<th scope="col">Date</th>
				<th scope="col">Author</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="post" items="${model.posts }">
			<tr>
 				<td>${post.title }</td>
				<td>${post.category.name }</td>
				<td>${post.date }</td>
				<td>${post.author.login }</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
		<a href="createPost"><button type="button" class="btn btn-primary">Créer un nouvel article</button></a>
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