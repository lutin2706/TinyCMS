<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
	<a class="navbar-brand" href="../index">${model.blogTitle }</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarsExampleDefault"
		aria-controls="navbarsExampleDefault" aria-expanded="false"
		aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>


	<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo02" aria-controls="navbarTogglerDemo02" aria-expanded="false" aria-label="Toggle navigation">
	    <span class="navbar-toggler-icon"></span>
	</button>
		
	<div class="collapse navbar-collapse" id="navbarTogglerDemo02">
		<ul class="navbar-nav mr-auto">
			<li class="nav-item active"><a class="nav-link monlien" href="./">Admin</a></li>
			<li class="nav-item dropdown">
				<a class="nav-link dropdown-toggle monlien" href="#" data-toggle="dropdown">Articles</a>
				<div class="dropdown-menu" >
					<a class="dropdown-item" href="createPost">Nouvel article</a> 
					<a class="dropdown-item" href="listPosts">Liste des articles</a>
				</div>
			</li>
			<li class="nav-item dropdown">
				<a class="nav-link dropdown-toggle monlien" href="#" data-toggle="dropdown">Catégories</a>
				<div class="dropdown-menu" >
					<a class="dropdown-item" href="createCategory">Nouvelle catégorie</a> 
					<a class="dropdown-item" href="#">Liste des catégories</a>
				</div>
			</li>
		</ul>
	 </div>
</nav>
