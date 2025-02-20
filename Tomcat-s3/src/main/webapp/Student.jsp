<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.io.*, java.util.*, javax.servlet.*, javax.servlet.http.*" %>
<%@ page import="org.example.model.Student" %>
<%@ page import="org.example.repository.StudentRepository" %>
<%@ page import="org.example.app.Application" %>
<%@ page import="org.example.service.StudentService" %>

<%
    if (request.getMethod().equalsIgnoreCase("POST")) {
        String code = request.getParameter("code");
        String name = request.getParameter("name");
        String program = request.getParameter("program");


        Student student = new Student();
        student.setCode(code);
        student.setName(name);
        student.setProgram(program);

        StudentService studentService = (StudentService) Application.getContext().getBean("studentService");
        studentService.addStudent(student);

        response.sendRedirect("index.jsp");

    }

%>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Agregar Estudiante</title>
</head>
<body>
<h2>Agregar Estudiante</h2>
<form action="Student.jsp" method="post">
    <label for="code">Código:</label>
    <input type="text" id="code" name="code" required><br>

    <label for="name">Nombre:</label>
    <input type="text" id="name" name="name" required><br>

    <label for="program">Programa:</label>
    <input type="text" id="program" name="program" required><br>

    <button type="submit">Guardar</button>
</form>
</body>
</html>

