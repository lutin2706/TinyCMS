<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Administration de ${model.blogTitle }</title>
<link rel="stylesheet" href="bootstrap/css/bootstrap.css">
<link rel="stylesheet" href="bootstrap/css/starter-template.css">
</head>
<body>
	<c:import url="header_back.jsp" />
	<main role="main" class="container">
	<h1>Administration de ${model.blogTitle }</h1>
	<div class="container">
		<div class="row">
			<div class="col">
				<div class="card">
					<div class="card-body">
						<h1 class="card-title">Articles</h1>
						<p class="card-text">
							Vous avez actuellement ${model.nbrPosts } articles sur votre blog
							<br> <a href="post?id=${post.id}">Créer un nouvel
								article</a> <br> <a href="">Voir la liste complète</a>
						</p>
					</div>
				</div>
			</div>
			<div class="col">
				<div class="card">
					<div class="card-body">
						<h1 class="card-title">Catégories</h1>
						<p class="card-text">
							Vous avez actuellement ${model.nbrCategories } catégories
							définies <br> <a href="">Créer une nouvelle catégorie</a> <br>
							<a href="">Voir la liste complète</a>
						</p>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col">
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
			<div class="col">
				<div class="card">
					<div class="card-body">
						<h1 class="card-title">Utilisateurs</h1>
						<p class="card-text">
							Vous avez actuellement ${model.nbrPosts } utilisateurs actifs <br>
							<a href="">Créer un nouvel utilisateur</a> <br> <a href="">Voir
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