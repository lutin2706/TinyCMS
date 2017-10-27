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
	<div class="container">
		<div class="row">
			<div class="col-sm-6">
				<div class="card">
					<div class="card-body">
						<h1 class="card-title">Articles</h1>
						<p class="card-text">
							Vous avez actuellement ${model.nbrPosts } articles sur votre blog
							<br> <a href="createPost">Créer un nouvel article</a> 
							<br> <a href="">Voir la liste complète</a>
						</p>
					</div>
				</div>
			</div>
			<div class="col-sm-6">
				<div class="card">
					<div class="card-body">
						<h1 class="card-title">Catégories</h1>
						<p class="card-text">
							Vous avez actuellement ${model.nbrCategories } catégories
							définies <br> <a href="createCategory">Créer une nouvelle catégorie</a> <br>
							<a href="">Voir la liste complète</a>
						</p>
					</div>
				</div>
			</div>
<!-- 		</div>
		<div class="row">
 -->			<div class="col-sm-6">
				<div class="card">
					<div class="card-body">
						<h1 class="card-title">Tags</h1>
						<p class="card-text">
							Vous avez actuellement ${model.nbrTags } tags utilisés <br>
							<a href="">Créer un nouveau tag</a> <br> <a href="">Voir
								la liste complète</a>
						</p>
					</div>
				</div>
			</div>
			<div class="col-sm-6">
				<div class="card">
					<div class="card-body">
						<h1 class="card-title">Utilisateurs</h1>
						<p class="card-text">
							Vous avez actuellement ${model.nbrPosts } utilisateurs actifs <br>
							<a href="createUser">Créer un nouvel utilisateur</a> <br> <a href="">Voir
								la liste complète</a>
						</p>
					</div>
				</div>
			</div>
		</div>
	</main>
	<!-- /.container -->


	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="../bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- 	<script src="../bootstrap/js/bootstrap.min.js"></script>
	<script
  src="https://code.jquery.com/jquery-3.2.1.min.js"
  integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4="
  crossorigin="anonymous"></script>
 -->		
</body>
</html>