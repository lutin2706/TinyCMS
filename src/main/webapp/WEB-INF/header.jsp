<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${model.blogTitle }</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.3/css/bootstrap.min.css" integrity="sha384-Zug+QiDoJOrZ5t4lssLdxGhVrurbmBWopoEl+M6BdEfwnCJZtKxi1KgxUyJq13dy" crossorigin="anonymous">
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<header class="container-fluid">
		<div class="row">
			<div class="col-md-6">
				<h1>${model.blogTitle }</h1>
			</div>
			<div class="col-md-6">
				<c:if test="${!empty user }">
					<p class="mt-2">Bienvenue ${user.login } !</p>
				</c:if>
			</div>
			
		</div>
		<nav class="row navbar navbar-expand-lg navbar-light">
			<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo02" aria-controls="navbarTogglerDemo02" aria-expanded="false" aria-label="Toggle navigation">
			    <span class="navbar-toggler-icon"></span>
			</button>
		
			<div class="collapse navbar-collapse" id="navbarTogglerDemo02">
				<ul class="navbar-nav mr-auto">
					<li class="nav-item active"><a class="nav-link monlien" href="index">Accueil</a></li>
					<li class="nav-item dropdown">
						<a class="nav-link dropdown-toggle monlien" href="#" data-toggle="dropdown">Categories</a>
						<div class="dropdown-menu" >
							<c:forEach var="cat" items="${model.categories }">
								<a class="dropdown-item" href="#" >${cat.name }</a>
							</c:forEach>
						</div>
					</li>
					<li class="nav-item"><a class="nav-link monlien" href="#">Qui sommes-nous ?</a></li>
					<li class="nav-item"><a class="nav-link monlien" href="#">Contact</a></li>
					<c:if test="${!empty user }">
					<li class="nav-item"><a class="nav-link monlien" href="admin/">Administration</a></li>
					</c:if>
				</ul>

				<form class="form-inline my-2 my-lg-0">
			      <input class="form-control mr-sm-2" type="search" placeholder="Search">
			      <button class="btn btn-light my-2 my-sm-0 mx-2" type="submit">Search</button>
			    </form>
			    <c:if test="${empty user }">
					<a href="login"><button type="button" class="btn btn-dark">Login</button></a>
				</c:if>
				<c:if test="${!empty user }">
					<a href="logout"><button type="button" class="btn btn-dark">Se déconnecter</button></a>
				</c:if>    
			 </div>
		</nav>
	</header>
	