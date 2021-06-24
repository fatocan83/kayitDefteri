<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Kayit Defteri</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link href="<c:url value="/resources/bootstrap.css" />" rel="stylesheet">
<%@ include file="/header.jsp"%>
</head>
<body>
<body>

<div class="container">
<form action="create" method="post">
    <strong><a href="./create">Yeni Kayit</a>  | </strong>
    <strong><a href="./read">Kayit Listesi</a></strong>
</form>
</div>
<%@ include file="/footer.jsp"%>
</body>
</html>