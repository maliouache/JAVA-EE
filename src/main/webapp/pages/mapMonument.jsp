<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>

<%@ include file="../includes/top.jsp" %>
	<h2>Naviguez sur la carte pour voir l'emplacement des monuments!</h2>
	<div id="map"></div>
	<a href="/JEE-PROJECT/listMonuments"><button
			class="btn btn-info btn-lg btn-block">Listing</button></a>
	<br>
	</div>
	</div>
	</div>
<script>
      function initMap() {
        var uluru = {lat: 43.6085116, lng: 3.8740822};
        var map = new google.maps.Map(document.getElementById('map'), {
          zoom: 13,
          center: uluru
        });
		<c:forEach items="${AllMonuments}" var="unMonument">
        var marker${unMonument.codeM} = new google.maps.Marker({
          position: {lat: ${unMonument.latitude}, lng: ${unMonument.longitude}},
          map: map,
          title: "${unMonument.nomM}",
          animation: google.maps.Animation.DROP
        });
        marker${unMonument.codeM}.addListener('click',chargMonument(${unMonument.codeM}));
		</c:forEach>
      }
      function chargMonument(idMon){
    	  console.log('wo'+idMon);
    	  /* window.location="unMonumentd?idMon="+idMon; */
      }
    </script>
	<script async defer
		src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCPIqMss7WGU-sWaI3YBBvMQxsZWm4Nvs4&callback=initMap">
    </script>
 </body>
 </html>