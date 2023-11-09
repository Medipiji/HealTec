
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="javax.servlet.http.HttpSession" %>
<%@page session="true"%>
<!DOCTYPE html>
<%
    String paginaAtual = "";
    if(session.getAttribute("paginaAtual") != null){
        paginaAtual = session.getAttribute("paginaAtual").toString();
    };
%>

<html>
    <head>
        <title>Healtec</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="../Style/homeStyle.css" type="text/css"/>
    </head>
    <body>
        <%if(!paginaAtual.equals("")){%>
            <jsp:include page="<%=paginaAtual%>"/>    
        <%}%>
        <script src="../Javascript/userJavascript.js" type="text/javascript"></script>
        <script src="../Javascript/adminJavascript.js" type="text/javascript"></script>
    </body>
</html>
