<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="ControllerServlet">
<label>Enter your Employee Id :</label>
<input type="text" name="eid" required /><br/><br/>
<label>Enter your First name :</label>
<input type="text" name="fname" required/><br/><br/>
<label>Enter your Last name :</label>
<input type="text" name="lname" required/><br/><br/>
<label>Enter your Date of Joining :</label>
<input  type="text" name="doj" required/><br/><br/>
<label>Enter your Department :</label>
<input type="text" name="dept" required/><br/><br/>
<button type="submit">Register</button>
</form>
</body>
</html>