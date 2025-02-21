<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Home</title>
</head>
<body>
    <h2>Welcome to Faculty Portal</h2>
    
    <h3>Available Courses</h3>
    <ul>
        <c:forEach var="course" items="${course_list}">
            <li>${course.courseName}</li>
        </c:forEach>
    </ul>

    <a href="login.jsp">Logout</a>
</body>
</html>
