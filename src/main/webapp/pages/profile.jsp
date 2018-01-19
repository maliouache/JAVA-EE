<%@ include file="../includes/top.jsp" %>
	</br>
	<h3>Your Informations!</h3>
	<table>
		<tr>
			<td style="width: 40%;">Name: </td>
			<td><b>${USER.nom }</b></td>
		</tr>
		<tr>
			<td>First name: </td>
			<td><b>${USER.prenom }</b></td>
		</tr>
		<tr>
			<td>Email: </td>
			<td><b>${USER.email }</b></td>
		</tr>
		<tr>
			<td>Type: </td>
			<td><b>${USER.typeUser }</b></td>
		</tr>
	</table>
	
<%@ include file="../includes/bottom.html" %>