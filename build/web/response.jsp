<%-- 
    Document   : response
    Created on : 16.02.2013, 12:37:39
    Author     : Миша
--%>
<jsp:useBean id="TestAction" scope="page" class="mypackage.test" />
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:setProperty name="TestAction" property="name"/>
        
    </body>
</html>
