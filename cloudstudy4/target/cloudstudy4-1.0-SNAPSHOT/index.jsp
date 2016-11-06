<%--
  Created by IntelliJ IDEA.
  User: Amalia
  Date: 11/2/2016
  Time: 12:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<%@ page import="gr.amaliatsa.models.Questionnaire" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
</head>
<body>
<%
    List<Questionnaire> questions = (List<Questionnaire>) request.getAttribute( "questions" );
%>
<%
    for (Questionnaire q : questions) {
        pageContext.setAttribute("firstname", q.getName() );
%>
<div>${firstname}</div>
<%
    }
%>
</body>
</html>