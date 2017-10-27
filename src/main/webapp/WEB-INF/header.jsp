<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<nav class="navbar navbar-expand-md navbar-light fixed-top" style="background-color: #ED5B46;">
		<a class="navbar-brand" href="index">${model.blogTitle }</a>

		<div class="collapse navbar-collapse" id="navbarsExampleDefault">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item"><a class="nav-link" href="index">Home</a>
				</li>
				<c:if test="${!empty user }">
				<li class="nav-item"><a class="nav-link" href="admin/">Administration</a></li>
				</c:if>
			</ul>
		</div>

		<p class="form-inline my-2 my-lg-0">
			<c:if test="${empty user }">
				<a href="login"><button type="button" class="btn btn-dark">Login</button></a>
			</c:if>
			<c:if test="${!empty user }">
				<div class="navbar-brand">Bienvenue ${user.login } !</div>
				<a href="logout"><button type="button" class="btn btn-dark">Se déconnecter</button></a>
			</c:if>
		</p>
	</nav>
