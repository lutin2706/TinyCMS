<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${model.blogTitle }</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<c:import url="navigation.jsp" />
	<!--  Add categories in <nav> -->
	<h1>${model.blogTitle }</h1>
	<h2>${model.post.title }</h2>
	<p>${model.post.body }</p>
	<!-- <a href="details?id=${post.id}"> 
					<img
							alt="${product.nom }" src="${product.imageURL }"></a> -->
	<p>Ecrit par : ${model.post.author.login }</p>
	<p>Commentaires:</p>
	<c:if test="${empty model.post.comments }">
		<p>Il n'y aucun commentaire pour le moment</p>
	</c:if>
	<c:forEach var="comment" items="${model.post.comments}">
		<p>${comment.text }</p>
		<p>Envoyé par: ${comment.author.login } le ${comment.date }</p>
	</c:forEach>
	<c:if test="${empty user }">
	<p>Vous devez être connecté(e) pour envoyer un commentaire</p>
	</c:if>
	<c:if test="${!empty user }">
		<form action="comment" method="post">
			<input type="hidden" name="postid" value="${model.post.id }">
			<input type="hidden" name="author" value="${user.id }">
			<div class="form-group">
				<label for="exampleFormControlTextarea1">Commentaire:</label>
				<textarea name="text" placeholder="Votre commentaire" rows="3"
					cols="50"></textarea>
			</div>
			<button type="submit">Envoyer un commentaire</button>
		</form>
	</c:if>
</body>
</html>