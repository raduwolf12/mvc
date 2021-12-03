<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MARE UPDATE</title>
</head>
<body>
     <div align="center">
        <h1>New/Edit Employee</h1>
        <form action="updateData" method="post" modelAttribute="employee">
        <table>
            <input type="hidden" name="employeeId" id="employeeId" path="employeeId" value="${employee.getEmployeeId()}"/>
            <tr>
                <td>Name:</td>
                <td><input name="name" id="name" value="${employee.getName()}"/></td>
            </tr>
            <tr>
                <td>Project Details:</td>
                <td><input name="project" id="project" path="project" value="${employee.getProject()}"/></td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><input name="mailId" id="mailId"  path="mailId" value="${employee.getMailId()}" /></td>
            </tr>
            <tr>
                <td>Phone Number:</td>
                <td><input name="phoneNo" id="phoneNo" path="phoneNo" value="${employee.getPhoneNo()}"/></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save"></td>
            </tr>
        </table>
        </form>
    </div>
</body>
</html>