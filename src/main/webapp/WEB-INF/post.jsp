<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${model.blogTitle }</title>
<link rel="stylesheet" href="bootstrap/css/bootstrap.css">
<link rel="stylesheet" href="bootstrap/css/starter-template.css">
</head>
<body>
	<c:import url="header_front.jsp" />
	<main role="main" class="container">

	<div>
			<h1>${model.post.title }</h1>
			<p>${model.post.body }<br>
				Ecrit par : ${model.post.author.login }<br>				
			</p>
			
	<h3>Commentaires:</h3>
	<c:if test="${empty model.post.comments }">
		<p>Il n'y aucun commentaire pour le moment</p>
	</c:if>
	<c:forEach var="comment" items="${model.post.comments}">
		<p>${comment.text }<br>
		Envoyé par: ${comment.author.login } le ${comment.date }</p>
	</c:forEach>
	
	<c:if test="${empty user }">
	<p>Vous devez être connecté(e) pour envoyer un commentaire</p>
	</c:if>
	<c:if test="${!empty user }">
		<form action="comment" method="post">
			<input type="hidden" name="postid" value="${model.post.id }">
			<input type="hidden" name="author" value="${user.id }">
			<div class="form-group">
<!-- 				<label for="exampleFormControlTextarea1">Commentaire:</label> -->
				<textarea name="text" placeholder="Votre commentaire" rows="3" cols="50" class="form-control" id="exampleFormControlTextarea1" ></textarea>
			</div>
			<button type="submit">Envoyer un commentaire</button>
		</form>
	</c:if>

	</div>

	</main>
	<!-- /.container -->

	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script>window.jQuery || document.write('<script src="../../../../assets/js/vendor/jquery.min.js"><\/script>')</script>
	<script src="../../../../assets/js/vendor/popper.min.js"></script>
	<script src="../../../../dist/js/bootstrap.min.js"></script>
</body>
</html>







