<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<%@taglib uri="/struts-tags" prefix="s"%>

<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style type="text/css">
</style>
</head>
<body>
	<a href="/JEE-PROJECT/home"><img alt="Appuyez pour aller au home" src="img/homeimg.png" width="150px" height="150px"></a>
	<div class="container" style="">
		<h2>Athentifiez vous !</h2>
		<s:form  action="/login">
			<s:textfield name="email" class="form-control" label="Email" placeholder="Enter Email"></s:textfield>
			<s:textfield name="password" class="form-control" label="Password:" type="password"></s:textfield>
			<s:submit value="Login" class="btn btn-primary"></s:submit>
		</s:form>
		Vous n'avez pas de compte? <a href="addUser">Inscrivez</a> vous.
	</div>

</body>
</html>
