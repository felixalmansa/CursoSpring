<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<title>Bootstrap 101 Template</title>

<!-- Bootstrap -->
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	rel="stylesheet">
<style>
body {
	padding-top: 30px;
}

.glyphicon {
	margin-bottom: 10px;
	margin-right: 10px;
}

small {
	display: block;
	line-height: 1.428571429;
	color: #999;
}
</style>
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col-xs-12 col-sm-6 col-md-6">
				<div class="well well-sm">
					<div class="row">
						<div class="col-sm-6 col-md-4">
							<img
								src="https://cdn1.iconfinder.com/data/icons/user-pictures/100/male3-256.png"
								alt="" class="img-rounded img-responsive" />
						</div>
						<div class="col-sm-6 col-md-8">
							<h4>${profesor.nombre}</h4>
							<small><cite title="Seville, Spain">Seville, Spain<i
									class="glyphicon glyphicon-map-marker"> </i>
							</cite></small>
							<p>
								<i class="glyphicon glyphicon-envelope"></i>${profesor.email}<br />
								<i class="glyphicon glyphicon-globe"></i><a
									href="http://www.openwebinars.net">www.openwebinars.net</a> <br />
								<i class="glyphicon glyphicon-tag"></i>${profesor.seminario}<br />
								<c:forEach items="${profesor.listadoAsignaturas}" var="asig"
									varStatus="status">
									<i class="glyphicon glyphicon-briefcase"></i>

									<a href="${profesor.id}/asig/${status.index}">${asig.titulo}</a>
									<br />
								</c:forEach>
							</p>
							<!-- Split button -->
							<div class="btn-group">
								<button type="button" class="btn btn-primary">Social</button>
								<button type="button" class="btn btn-primary dropdown-toggle"
									data-toggle="dropdown">
									<span class="caret"></span><span class="sr-only">Social</span>
								</button>
								<ul class="dropdown-menu" role="menu">
									<li><a href="#">Twitter</a></li>
									<li><a href="https://plus.google.com/+Jquery2dotnet/posts">Google
											+</a></li>
									<li><a href="https://www.facebook.com/jquery2dotnet">Facebook</a></li>
									<li class="divider"></li>
									<li><a href="#">Github</a></li>
								</ul>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>