<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Administration de ${model.blogTitle }</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.3/css/bootstrap.min.css" integrity="sha384-Zug+QiDoJOrZ5t4lssLdxGhVrurbmBWopoEl+M6BdEfwnCJZtKxi1KgxUyJq13dy" crossorigin="anonymous">
<link rel="stylesheet" href="../css/admin_style.css">
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
			<c:if test="${contraintes.containsKey('title') }">
				<p class="error">${contraintes.get('title') }</p>
			</c:if>
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
			<c:if test="${contraintes.containsKey('body') }">
				<p class="error">${contraintes.get('body') }</p>
			</c:if>
			<small id="textHelpBlock" class="form-text text-muted">Votre
				texte ne peut pas contenir de balises HTML et doit contenir entre 100 et 500 caractères.</small>
		</div>
		<button class="btn btn-primary" type="submit">Envoyer
			l'article</button>
	</form>
	</main>
	<!-- /.container -->

	<c:import url="footer.jsp" />

</body>
</html>