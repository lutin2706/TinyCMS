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
	<form action="createCategory" method="post">
		<div class="form-group">
			<label for="exampleFormControlInput1">Nom</label> <input
				name="name" type="text" class="form-control" id="exampleFormControlInput1"
				placeholder="Nom de la catégorie" cols="100">
		</div>
		<div class="form-group">
			<label for="exampleFormControlSelect1">Parent</label> 
			<select class="form-control" id="exampleFormControlSelect1" name="parent" >
				<option value="0">Aucun parent</option>
				<c:forEach var="cat" items="${model.categories}">
					<option value="${cat.id }">${cat.name }</option>
				</c:forEach>
			</select>
		</div>
		<button class="btn btn-primary" type="submit">Créer la catégorie</button>
	</form>
	</main>
	<!-- /.container -->


	<c:import url="footer.jsp" />

</body>
</html>