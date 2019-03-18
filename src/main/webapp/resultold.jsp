<%@page import="com.ssi.model.Circle"%>
<%
	Circle circle=(Circle)request.getAttribute("resultdata");
%>

<html>
<body>
<h3>Circle Details </h3>
<hr>
	<pre>
		Radius of Circle	:  <%=circle.getRadius() %>
		Area of Circle		:  <%=circle.getArea() %>
		Crfr of Circle		:  <%=circle.getCircumference() %>
	</pre>
<hr>
</body>
</html>