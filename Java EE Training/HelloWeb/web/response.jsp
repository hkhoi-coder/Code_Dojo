<%-- 
    Document   : response
    Created on : Mar 17, 2016, 10:21:29 PM
    Author     : hkhoi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Your name is...</title>
    </head>
    <body>
        <jsp:useBean id="mybean" scope="page" class="net.hkhoi.NameHandler" />
        <jsp:setProperty name="mybean" property="name" />
    <h1>Hello, <jsp:getProperty name="mybean" property="name" />!</h1>
    </body>
</html>
