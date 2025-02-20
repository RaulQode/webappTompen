<%@ page import="org.springframework.context.support.ClassPathXmlApplicationContext" %>
<%@ page import="org.example.app.Application" %>
<%@ page import="org.example.service.MessageService" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>

<%
    MessageService messageService = (MessageService) Application.getContext().getBean("messageService");
    out.println("<ul>");
    for(String message : messageService.getMessages()){
        out.println("<li>");
        out.println(message);
        out.println("</li>");
    }
    out.println("</ul>");

%>

<form action="messageServlet" method="post">
    <label>
        <input type="text" name="message">
    </label>
    <input type="submit">
</form>

</body>
</html>