<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<nav class="navbar navbar-expand-md navbar-dark bg-dark fixed-top">
		<a class="navbar-brand" href="index">${model.blogTitle }</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarsExampleDefault"
			aria-controls="navbarsExampleDefault" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarsExampleDefault">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item"><a class="nav-link" href="index">Home</a>
				</li>
			</ul>
		</div>

		<p class="form-inline my-2 my-lg-0">
			<c:if test="${empty user }">
				<a href="login">Login</a>
			</c:if>
			<c:if test="${!empty user }">
				<div class="navbar-brand">Bienvenue ${user.login } !</div>
				<a href="logout"><button
						class="btn btn-outline-success my-2 my-sm-0">Se
						déconnecter</button></a>
			</c:if>
		</p>
	</nav>
