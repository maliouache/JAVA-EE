<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>

<%@ include file="../includes/top.jsp" %>
	<h2>Saisissez les informations sur le nouveau monument</h2>
		<p style="color:green">${msg}</p>
	
	<sf:form modelAttribute="Monument" method="post" action="storeMonument" class="form-horizontal">
		<div class="form-group">
			<label class="control-label col-sm-2" for="codeD">Nom du monument:</label> 
			<div class="col-sm-10">
				<sf:input type="text" path="nomM" class="form-control" name="codeD" />
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="chefLieu">Propriétaire: </label>
			<div class="col-sm-10">
				<sf:input class="form-control" type="text" path="proprietaire"
					name="chefLieu" />
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="type">Type du monument: </label>
			<div class="col-sm-10">
				<sf:input class="form-control" type="text" path="typeMonument"
					name="type" />
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
			<label class="control-label col-sm-2" for="lieu">Lieu: </label>
			<div class="col-sm-10">
				<sf:select path="codeLieu.codeInsee" name="lieu">
					<c:forEach items="${AllLieux}" var="unLieu">
						<sf:option value="${unLieu.codeInsee}">${unLieu.codeInsee} ${unLieu.nomCom}</sf:option>
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