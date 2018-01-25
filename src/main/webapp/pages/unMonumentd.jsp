<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>

<%@ include file="../includes/top.jsp" %>
	<b><h2>${unMonument.nomM }</h2></b>
	<div id="map"></div>
	<div id="button"></div>
	<div id="output"></div>
	
	</div>
	</div>
	</div>
	<script>
	var marker;
      function initMap() {
        var uluru = {lat: ${unMonument.latitude}, lng: ${unMonument.longitude}};
        var map = new google.maps.Map(document.getElementById('map'), {
          zoom: 15,
          center: uluru
        });
        marker = new google.maps.Marker({
          position: {lat: ${unMonument.latitude}, lng: ${unMonument.longitude}},
          map: map,
          title: "${unMonument.nomM}",
          animation: google.maps.Animation.DROP
        });
        marker.addListener('click', toggleBounce);
      }
        function toggleBounce() {
        	  if (marker.getAnimation() !== null) {
        	    marker.setAnimation(null);
        	  } else {
        	    marker.setAnimation(google.maps.Animation.BOUNCE);
        	  }
        }
    </script>
	<script async defer
		src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCPIqMss7WGU-sWaI3YBBvMQxsZWm4Nvs4&callback=initMap">
    </script>
	<!-- <script type="text/javascript">
    document.addEventListener('DOMContentLoaded', function () {
        var xdr = new XMLHttpRequest(); 
		console.log('loaded');
		xdr.onload = function() {
			alert(xdr.responseText);
			console.log('entered');
		}

		xdr.open("GET", "https://www.google.fr/search?dcr=0&source=hp&ei=NskqWta9BoPCwQLC64PICg&q=Chateau+d%27o&oq=Chateau+d%27o&gs_l=psy-ab.3..0l10.3576.8461.0.9534.11.9.0.2.2.0.96.696.9.9.0....0...1c.1.64.psy-ab..0.11.713...0i131k1.0.JzRahM663Eg");
		xdr.send();
     });
  </script> -->
</body>
</html>