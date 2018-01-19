<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>

<%@ include file="../includes/top.jsp" %>
	<h2>Voici la liste des Monuments des monuments</h2>
	<table class="table">
		<thead class="thead-inverse">
			<tr>
				<th>#</th>
				<th>Nom du Monument</th>
				<th>Proprietaire</th>
				<th>Lieu</th>
				<th>Type du Monument</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${AllMonuments}" var="unMonument">
				<tr>
					<th scope="row">${unMonument.codeM}</th>
					<td><a href="unMonumentd?idMon=${unMonument.codeM}">${unMonument.nomM}</a></td>
					<td>${unMonument.proprietaire}</td>
					<td>${unMonument.codeLieu.nomCom}</td>
					<td>${unMonument.typeMonument}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
<%@ include file="../includes/bottom.html" %>