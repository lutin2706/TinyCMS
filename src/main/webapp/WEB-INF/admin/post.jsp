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
	<form action="createPost" method="post">
		<div class="form-group">
			<label for="exampleFormControlInput1">Titre</label> <input
				name="title" type="text" class="form-control" id="exampleFormControlInput1"
				placeholder="Titre de l'article" cols="100">
		</div>
		<div class="form-group">
			<label for="exampleFormControlSelect1">Catégorie</label> 
			<select
				class="form-control" id="exampleFormControlSelect1" name="cat" >
				<c:forEach var="cat" items="${model.categories}">
					<option value="${cat.id }">${cat.name }</option>
				</c:forEach>
			</select>
		</div>
		<div class="form-group">
			<!--     <label for="exampleFormControlTextarea1">Example textarea</label> -->
			<textarea name="body" class="form-control" id="exampleFormControlTextarea1"
				rows="20" cols="100" aria-describedby="textHelpBlock"
				placeholder="Insérez votre article ici"></textarea>
			<small id="textHelpBlock" class="form-text text-muted">Votre
				texte ne peut pas contenir de balises HTML.</small>
		</div>
		<button class="btn btn-primary" type="submit">Envoyer
			l'article</button>
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