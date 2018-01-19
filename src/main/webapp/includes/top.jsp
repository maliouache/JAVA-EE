<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
  <title>JAVA EE Project</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

  <style>
    /* Remove the navbar's default margin-bottom and rounded borders */ 
    .navbar {
      margin-bottom: 0;
      border-radius: 0;
    }
    
    /* Set height of the grid so .sidenav can be 100% (adjust as needed) */
    .row.content {height: 550px}
    
    /* Set gray background color and 100% height */
    .sidenav {
      padding-top: 20px;
      background-color: #f1f1f1;
      height: 100%;
    }
    
    /* Set black background color, white text and some padding */
    footer {
      background-color: #555;
      color: white;
      padding: 15px;
      left: 0;
      bottom: 0;
      width: 100%;
      text-align: center;
    }
    .edit_btn{
            float: right;
        }
    #map {
		margin: auto;
		height: 600px;
		width: 80%;
	}
    /* On small screens, set height to 'auto' for sidenav and grid */
    @media screen and (max-width: 767px) {
      .sidenav {
        height: auto;
        padding: 15px;
      }
      .row.content {height:auto;} 
    }
  </style>
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="home">JAVA EE</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="home">Accueil</a></li>
        <li><a href="#">Details</a></li>
        <li><a href="/JEE-PROJECT/profile">Profil</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
          <li>
          <a href="/JEE-PROJECT/profile">${USER.userName} (<span style="color:blue;">${USER.typeUser}</span>)</a></li><li>
	          <a href="logout">
	              <span class="glyphicon glyphicon-log-in"></span>Déconnexion
	          </a>
         </li>
      </ul>
    </div>
  </div>
</nav>
  
<div class="container-fluid text-center">    
  <div class="row content">
    <div class="col-sm-4 sidenav">
    
    	<button type="button" class="btn btn-success btn-block" data-toggle="collapse" data-target="#demo_departement">  
        Departement</button>
        <div id="demo_departement" class="collapse">
            <a href="/JEE-PROJECT/seeDepartements"><button class="btn btn-link  btn-block">Voir tous</button></a>
            <c:if test="${USER.typeUser=='voyagiste'}">
            <a href="/JEE-PROJECT/addDepartement"><button class="btn btn-link  btn-block">Ajouter</button></a>
            <a href="/JEE-PROJECT/editDepartement"><button class="btn btn-link  btn-block">Modifier</button></a>
            <a href="/JEE-PROJECT/deleteDepartement"><button class="btn btn-link  btn-block">Supprimer</button></a>
            </c:if>
        </div>
        <button type="button" class="btn btn-success btn-block" data-toggle="collapse" data-target="#demo_lieu">  
        Lieu</button>
        <div id="demo_lieu" class="collapse">
            <a href="/JEE-PROJECT/seeLieux"><button class="btn btn-link  btn-block">Voir tous</button></a>
            <c:if test="${USER.typeUser=='voyagiste'}">
            <a href="/JEE-PROJECT/addLieu"><button class="btn btn-link  btn-block">Ajouter</button></a>
            <a href="/JEE-PROJECT/editLieu"><button class="btn btn-link  btn-block">Modifier</button></a>
            <a href="/JEE-PROJECT/deleteLieu"><button class="btn btn-link  btn-block">Supprimer</button></a>
            </c:if>
        </div>
        <button type="button" class="btn btn-success btn-block" data-toggle="collapse" data-target="#demo_monument">  
        Monument</button>
        <div id="demo_monument" class="collapse">
            <a href="/JEE-PROJECT/mapMonuments"><button class="btn btn-link  btn-block">Voir tous</button></a>
            <c:if test="${USER.typeUser=='voyagiste'}">
            <a href="/JEE-PROJECT/addMonument"><button class="btn btn-link  btn-block">Ajouter</button></a>
            <a href="/JEE-PROJECT/editMonument"><button class="btn btn-link  btn-block">Modifier</button></a>
            <a href="/JEE-PROJECT/editMonuments"><button class="btn btn-link  btn-block">Supprimer</button></a>
            </c:if>
        </div>
        <button type="button" class="btn btn-success btn-block" data-toggle="collapse" data-target="#demo_celebrity">  
        Celebrité</button>
        <div id="demo_celebrity" class="collapse">
            <a href="/JEE-PROJECT/seeCelebrities"><button class="btn btn-link  btn-block">Voir tous</button></a>
            <c:if test="${USER.typeUser=='voyagiste'}">
            <a href="/JEE-PROJECT/addCelebrity"><button class="btn btn-link  btn-block">Ajouter</button></a>
            <a href="/JEE-PROJECT/editCelebrity"><button class="btn btn-link  btn-block">Modifier</button></a>
            <a href="/JEE-PROJECT/deleteCelebrity"><button class="btn btn-link  btn-block">Supprimer</button></a>
            </c:if>
        </div>
    
    </div>
    <div class="col-sm-8 text-left"> 
        <!-- here starts the main content -->