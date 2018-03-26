<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<c:import url="header.jsp" />
	<!-- /.container -->
	<div class="container-fluid main my-2">
		<div class="row px-2 py-2">
			<section class="col-md-10">
				<c:forEach var="post" items="${model.posts}">
					<article class="container">
						<div class="row titre-article">
							<div class="col-md-8"><h5>${post.title }</h5></div>
							<div class="col-md-2"><em>${post.date }</em></div>
							<div class="col-md-2"><em>${post.author.login }</em></div>
						</div>
						<div class="row">
							<div class="col-md-12">
								<p>${post.body }</p>
								<p><a href="post?id=${post.id}">Voir le post</a></p>
							</div>
						</div>
					</article>
				</c:forEach>			
			</section>
			<aside class="col-md-2 px-1 py-1">

			</aside>
		</div>
	</div>
	<footer class="container-fluid">
		<div class="row">
			<div class="col-md-4">Ma petite couture</div>
			<div class="col-md-4 copyright">© MaPetitecouture</div>
			<div class="col-md-4 social">
				<i class="fab fa-facebook-square fa-3x"></i>    
				<i class="fab fa-twitter-square fa-3x"></i>    
				<i class="fab fa-instagram fa-3x"></i>
			</div>
		</div> 
	</footer>
	

	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.3/js/bootstrap.min.js" integrity="sha384-a5N7Y/aK3qNeh15eJKGWxsqtnX/wWdSZSKp+81YjTmS15nvnvxKHuzaWwXHDli+4" crossorigin="anonymous"></script>
</body>
</html>