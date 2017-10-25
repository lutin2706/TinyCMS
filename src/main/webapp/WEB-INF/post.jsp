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
		<p>${comment }</p>
		<p>${comment.auhor.login }</p>p>
			</c:forEach>

</body>
</html>
