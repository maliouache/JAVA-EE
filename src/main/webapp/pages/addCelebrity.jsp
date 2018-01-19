<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>

<%@ include file="../includes/top.jsp" %>

	<h2>Saisissez les informations sur la nouvelle celebrité</h2>
	<p style="color:green">${msg}</p>
	<sf:form modelAttribute="Celebrite" method="post"
		action="storeCelebrity" class="form-horizontal">
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
			<label class="control-label col-sm-2" for="nomDep">Epoque: </label>
			<div class="col-sm-10">
				<sf:input type="text" class="form-control" path="epoque" />
			</div>
		</div>
		<div class="form-group">
			<label class="control-label col-sm-2" for="lieu">Associer au Monument: </label>
			<div class="col-sm-10">
				<sf:select path="monumentTemp" name="lieu">
					<c:forEach items="${AllMonuments}" var="unMonument">
						<sf:option value="${unMonument.codeM}">${unMonument.nomM}</sf:option>
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