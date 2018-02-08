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
<title>List of Students</title>

<!-- Bootstrap -->
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	rel="stylesheet">

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

<style>
body {
	margin-top: 30px;
}
</style>

</head>
<body>

	<div class="container">
		<div class="row">
			<div class="span12">
				<form method="get" action="find" class="form-inline">
					<input name="first_name" type="text"
						placeholder="Nombre"> <input
						name="last_name" type="text" placeholder="Apellidos">
					<button type="submit" class="btn btn-primary">
						Buscar
					</button>
				</form>
			</div>
		</div>

		<div class="row">
			<table
				class="table table-bordered table-striped table-hover table-condensed table-responsive">
				<thead>
					<tr>
						<th>id</th>
						<th>Nombre</th>
						<th>Apellidos</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${listaEstudiantes}" var="estudiante">
						<tr>
							<td>${estudiante.id}</td>
							<td>${estudiante.firstName}</td>
							<td>${estudiante.lastName}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<a href="newStudent">Añadir un nuevo estudiante</a>
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