<html>
<head>
<meta charset="utf-8">
<title>Kayit Ekle</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link href="<c:url value="/resources/bootstrap.css" />" rel="stylesheet">
<%@ include file="/header.jsp"%>

</head>
<body>
	<strong><a href="./read">Kayit Listesi</a></strong>
<div class="container">
<h2>Kayit Formu</h2>
<form action="create" method="post" class="needs-validation" novalidate >
	<div class="form-row">
    <div class="col-md-2 mb-3">
        <label for="adi">Ad</label>
      </div>
      <div class="col-md-5">
        <input type="text" class="form-control" id="adi" name="adi" required>
      </div>
    </div>	
	<div class="form-row">
    <div class="col-md-2 mb-3">
        <label for="adi">Soyad</label>
      </div>
      <div class="col-md-5">
        <input type="text" class="form-control" id="soyadi" name="soyadi" required>
      </div>
    </div>	
	<div class="form-row">
    <div class="col-md-2 mb-3">
        <label for="adi">Kan grubu</label>
      </div>
      <div class="col-md-5">
        <input type="text" class="form-control" id="kangrubu" name="kangrubu" required>
      </div>
    </div>
	<div class="form-row">
    <div class="col-md-2 mb-3">
        <label for="adi">Cep tel</label>
      </div>
      <div class="col-md-5">
        <input type="tel" class="form-control" id="ceptel" name="ceptel" placeholder="05.." required pattern="^\d{4}\d{3}\d{4}$" >
      </div>
    </div>	
	<div class="form-row">
    <div class="col-md-2 mb-3">
        <label for="adi">Adres</label>
      </div>
      <div class="col-md-5">
        <input type="text" class="form-control"  id="adres" name="adres" required>
      </div>
    </div>	
	<div class="row">
      <div class="col-md-5">
        	
      </div>
      <div class="col-md-2">
        <input class="btn btn-primary" type="submit" value="Kaydet" />
      </div>
    </div>
	

</form>

<script>
// Example starter JavaScript for disabling form submissions if there are invalid fields
(function() {
  'use strict';
  window.addEventListener('load', function() {
    // Fetch all the forms we want to apply custom Bootstrap validation styles to
    var forms = document.getElementsByClassName('needs-validation');
    // Loop over them and prevent submission
    var validation = Array.prototype.filter.call(forms, function(form) {
      form.addEventListener('submit', function(event) {
        if (form.checkValidity() === false) {
          event.preventDefault();
          event.stopPropagation();
        }
        form.classList.add('was-validated');
      }, false);
    });
  }, false);
})();
</script>

</div>
${msg}
<br>
<%@ include file="/footer.jsp"%>
</body>
</html>

