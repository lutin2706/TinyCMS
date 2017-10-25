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
	<p>
		<c:if test="${empty user }">
			<a href="login">Login</a>
		</c:if>
		<c:if test="${!empty user }">
			<p>Bienvenue ${user.login } !</p>
		</c:if>
	</p>
	<c:forEach var="post" items="${model.posts}">
		<!-- <a href="details?id=${post.id}"> 
					<img
							alt="${product.nom }" src="${product.imageURL }"></a> -->
		<h2>${post.title }</h2>
		<p>${post.body }</p>
		<a href="post?id=${post.id}">Voir le post</a>
	</c:forEach>

</body>
</html>
