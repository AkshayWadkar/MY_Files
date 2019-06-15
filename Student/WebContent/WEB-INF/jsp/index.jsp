<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<div>


		<h1>Student Directory</h1>



		<form:form modelAttribute="student" action="save.obj" method="post">
			<div>
				<label for="fname">First Name</label>
				<div>
					<form:input path="firstName" id="fname" required="true" placeholder="First Name" />
				</div>
			</div>
			<div>
				<label for="lname">Last Name</label>
				<div>
					<form:input path="lastName" id="lname" required="true" placeholder="Last Name" />
				</div>
			</div>
			<div>
				<label for="dept">Department</label>
				<div>
					<form:select path="department" required="true">
						<form:option value="">Please Select department</form:option>
						<form:options items="${departments}" />
					</form:select>
				</div>
			</div>
			<div>
				<label for="marks">Marks</label>
				<div>
					<form:input path="marks" id="marks" required="true" placeholder="Marks" />
				</div>
			</div>
			<div>
				<div>
					<button type="submit">Add</button>
				</div>
			</div>
		</form:form>
		<!-- alert logic -->
		<c:if test="${param.message ne null}">
			<div>
				${param.message}
			</div>
		</c:if>
		
		<h3>Current List of Students:</h3>
		<c:if test="${stuList ne null}">
			<table>
				<tr>
					<th>#</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Department</th>
					<th>Marks</th>
				</tr>
				<c:forEach items="${stuList}" var="student">
					<tr>
						<th>${student.studentId}</th>
						<th>${student.firstName}</th>
						<th>${student.lastName}</th>
						<th>${student.department}</th>
						<th>${student.marks}</th>
					</tr>
				</c:forEach>
			</table>
		</c:if>
	</div>
</body>
</html>