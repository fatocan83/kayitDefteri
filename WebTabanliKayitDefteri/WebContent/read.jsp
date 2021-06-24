<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Kayit Listesi</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link href="<c:url value="/resources/bootstrap.css" />" rel="stylesheet">
<%@ include file="/header.jsp"%>
</head>

<body>
	<p><strong> <a href="./create">Yeni Kayit</a></strong></p>
	<div class="container">
  <h2>Kayit Listesi</h2>
  
  <div class="table-responsive">
  <table class="table">
    <thead>
		<tr>
			<th>Adi</th>
			<th>Soyadi</th>
			<th>Kangrubu</th>
			<th>Ceptel</th>
			<th>Adres</th>
		</tr>
		<c:forEach var="kayit" items="${listKayit}">
			<tr>
				<td>${kayit.adi}</td>
				<td>${kayit.soyadi}</td>
				<td>${kayit.kanGrubu}</td>
				<td>${kayit.cepTel}</td>
				<td>${kayit.adres}</td>
			</tr>
		</c:forEach>
	</table>
	</div>
	</div>
	
	<%@ include file="/footer.jsp"%>
</body>

</html>