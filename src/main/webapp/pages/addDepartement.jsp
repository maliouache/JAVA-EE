<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>

<%@ include file="../includes/top.jsp" %>
	<h2>Saisissez les informations sur le nouveau Département</h2>
		<p style="color:green">${msg}</p>
	<sf:form modelAttribute="Departement" method="post"
		action="storeDepartement" class="form-horizontal">
		<div class="form-group">
			<label class="control-label col-sm-2" for="codeD">Code du
				Departement:</label>
				<div class="col-sm-10">
			<sf:input type="text" path="dep" class="form-control" name="codeD" />
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="chefLieu">Chef
				Lieu: </label>
				<div class="col-sm-10">
			<sf:input class="form-control" type="text" path="chefLieu"
				name="chefLieu" />
				</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="nomDep">Nom du
				département: </label>
				<div class="col-sm-10">
			<sf:input type="text" class="form-control" path="nomDep"
				name="nomDep" />
				</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="nomDep">Région: </label>
			<div class="col-sm-10">
			<sf:input type="text" class="form-control" path="reg" />
			</div>
		</div>
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<button type="submit" class="btn btn-primary">Ajouter</button>
			</div>
		</div>
	</sf:form>
<%@ include file="../includes/bottom.html" %>