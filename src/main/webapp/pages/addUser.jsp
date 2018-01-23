<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>JAVA EE Project</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<a href="/JEE-PROJECT/home"><img alt="Appuyez pour aller au home" src="img/homeimg.png" width="150px" height="150px"></a>

	<h2>Saisissez vos informations !</h2>
		<p style="color:green">${msg}</p>
		<p style="color:red">${errors}</p>
	<sf:form modelAttribute="User" method="post"
		action="storeUser" class="form-horizontal">
		<div class="form-group">
			<label class="control-label col-sm-2" for="codeD">Nom: </label>
			<div class="col-sm-10">
				<sf:input type="text" path="nom" class="form-control" name="codeD" />
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="chefLieu">Prénom: </label>
			<div class="col-sm-10">
				<sf:input class="form-control" type="text" path="prenom"
					name="chefLieu" />
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="nomDep">Nationalité: </label>
			<div class="col-sm-10">
				<sf:input type="text" class="form-control" path="nationalite"
					name="nomDep" />
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="optradio">Sexe: </label>
			<div class="col-sm-10">
				<label class="radio-inline"><sf:radiobutton path="sexe" name="optradio" value="M"/>Male</label>
				<label class="radio-inline"><sf:radiobutton path="sexe" name="optradio" value="F"/>Female</label>
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="email" >email: </label>
			<div class="col-sm-10">
				<sf:input type="email" class="form-control" path="email" name="email"/>
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="password">mot de passe: </label>
			<div class="col-sm-10">
				<sf:input type="password" class="form-control" path="password" name="password"/>
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="type">Type de profil: </label>
			<div class="col-sm-10">
				<sf:select path="typeUser" name="type">
						<sf:option value="voyagiste">Voyagiste</sf:option>
						<sf:option value="touriste">Touriste</sf:option>
				</sf:select>
			</div>
		</div>
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<button type="submit" class="btn btn-primary">S'inscrire</button>
			</div>
		</div>
	</sf:form>
	</body>
</html>