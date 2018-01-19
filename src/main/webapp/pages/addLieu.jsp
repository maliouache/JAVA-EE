<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>

<%@ include file="../includes/top.jsp" %>
	<h2>Saisissez les informations sur le nouveau Lieu</h2>
		<p style="color:green">${msg}</p>
	
	<sf:form modelAttribute="Lieu" method="post" action="storeLieu" class="form-horizontal">
		<div class="form-group">
			<label class="control-label col-sm-2" for="codeD">Nom du lieu: </label> 
			<div class="col-sm-10">
				<sf:input type="text" path="nomCom" class="form-control" name="codeD" />
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="codeInsee">code Insee: </label>
			<div class="col-sm-10">
				<sf:input class="form-control" type="text" path="codeInsee"
					name="codeInsee" />
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="longitude">Longitude: </label>
			<div class="col-sm-10">
				<sf:input class="form-control" type="text" path="longitude"
					name="longitude" />
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="latitude">Latitude: </label>
			<div class="col-sm-10">
				<sf:input class="form-control" type="text" path="latitude"
					name="latitude" />
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="dep">Departement: </label>
			<div class="col-sm-10">
				<sf:select path="dep.dep" name="dep">
					<c:forEach items="${AllDeps}" var="unDep">
						<sf:option value="${unDep.dep}">${unDep.dep} ${unDep.nomDep}</sf:option>
					</c:forEach>
				</sf:select>
			</div>
		</div>
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<button type="submit" class="btn btn-primary">Ajouter</button>
			</div>
		</div>
	</sf:form>
<%@ include file="../includes/bottom.html" %>