<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead | Create</title>
<link rel="stylesheet"  href="/css/styleSheet_create_lead.css">
<style>
</style>
</head>
<body>
	<div class="headerFont"><h2>Create Leads</h2></div>
	<div"><%@ include file="menu.jsp" %></div>
	<hr>
	<div id="showError">${emailError}</div>
	<div class="formContainer">
		<form action="saveLead" method="post" class="form">
			<pre>
				First Name	<input type="text" name="firstName"/><br>
				Last Name	<input type="text" name="lastName"/><br>
				Lead Source:	<select name="LeadSource">
							  <option value="radio">Radio Channel</option>
							  <option value="newspaper">News Paper</option>
							  <option value="tv">TV</option>
							  <option value="online">Online</option>
							</select><br>
				Email		<input type="email" name="email"/><br>
				Mobile		<input type="text" name="mobile"/>
							<br>
						    <input type="reset" value="Reset"/>   <input type="submit" value="Save"/>
							
			</pre>
		</form>
	</div>
</body>
</html>