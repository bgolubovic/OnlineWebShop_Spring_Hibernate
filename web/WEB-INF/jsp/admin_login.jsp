<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
if(request.getSession().getAttribute("admin")!=null){
    response.sendRedirect("admin.htm");
}    
%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="admin.css" type="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Administrator Prijava</title>
    </head>
    <body>
    <center style="margin-top: 35px;"><h4>Administrator Molimo Pijavite Se</h4></center>
        <div class="container">
                <section id="content">
                        <form:form method="post" commandName="AdminLogin">
                                <h1>Admin Prijava</h1>
                                <div>
                                        <form:input path="userName" placeholder="Korisničko ime" id="username" />
                                        <font color="red"><form:errors path="userName"/></font><br/><br/>
                                </div>
                                <div>
                                        <form:password path="password" placeholder="Šifra" id="password" />
                                        <font color="red"><form:errors path="password"/></font><br/><br/>
                                </div>
                                <div>
                                        <input type="submit" value="Prijava" />
                                </div>
                        </form:form><!-- form -->
                </section><!-- content -->
        </div><!-- container -->
        
    </body>
</html>
