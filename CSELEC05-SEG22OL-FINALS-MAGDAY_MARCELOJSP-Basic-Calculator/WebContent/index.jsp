<%@ page
	language="java"
	contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Magday's Calculator</title>
</head>
<!-- Bootstrap CSS -->
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">
<body>
	<div class="container">
		<form
			action="calculate"
			method="post">
			<h1 class="text-center">MAGDAY CALCULATOR</h1>
			<%
				if (request.getAttribute("errorMsg") != null) {
			%>
			<%@ include file="templates/error-msg.jsp"%>
			<%
				}
			%>
			<div class="form-group">
				<label for="firstInput">Number 1: </label>
				<input
					id="firstInput"
					name="firstInput"
					class="form-control w-25"
					type="number"
					step="0.01"
					required="required">
			</div>
			<div class="form-group">
				<label for="secondInput">Number 2: </label>
				<input
					id="secondInput"
					name="secondInput"
					class="form-control w-25"
					type="number"
					step="0.01"
					required="required">
			</div>
			<div class="form-group">
				<label for="operatorSelector">Operation</label>
				<select
					id="operatorSelector"
					name="operatorSelector"
					class="form-control w-25">
					<option value="0">Addition</option>
					<option value="1">Subtraction</option>
					<option value="2">Multiplication</option>
					<option value="3">Division</option>
				</select>
			</div>
			<button class="btn btn-primary">Submit</button>
		</form>
		<%
			if (request.getAttribute("answer") != null) {
		%>
		<%@include file="templates/answer.jsp"%>
		<%
			}
		%>
	</div>
	<!-- JS, Popper.js, and jQuery -->
	<script
		src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
		integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"
		integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI"
		crossorigin="anonymous"></script>
</body>
</html>