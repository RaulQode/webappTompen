<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="org.example.model.Course" %>

<%
    if (request.getMethod().equalsIgnoreCase("POST")) {
        String studentCode = request.getParameter("studentCode");
        int courseId = Integer.parseInt(request.getParameter("courseId"));
        String courseName = request.getParameter("courseName");
        String professorName = request.getParameter("professorName");
        String courseSchedule = request.getParameter("courseSchedule");

        Course course = new Course();
        course.setId(courseId);
        course.setName(courseName);
        course.setProfessorName(professorName);
        course.setSchedule(courseSchedule);

        response.sendRedirect("index.jsp");

    }

%>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Curso</title>
</head>
<body>
<h2>Curso</h2>
