<%-- 
    Document   : name-response
    Created on : Mar 30, 2016, 3:17:00 PM
    Author     : hkhoi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="mybean" scope="session" class="model.NameHandler" />
        <jsp:setProperty name="mybean" property="name" />
        <h1>Hello, <jsp:getProperty name="mybean" property="name" />!</h1>
        <form name="name-form" action="name-response.jsp">
            <input type="text" name="text-input-name" value="" />
            <input type="submit" value="OK" />
        </form>
    </body>
</html>
