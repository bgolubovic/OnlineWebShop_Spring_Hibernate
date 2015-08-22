<%@include file="taglib_include.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Izbriši proizvod | Administrator</title>
        <link rel="stylesheet" href="style.css" type="text/css">
    </head>

    <body>
        <section>
            <center>
                <header>
                    <a class="logout" href="logout.htm">Logout</a> 
                    <h1>Izbriši proizvod | Administrator</h1>  
                    <nav>
                        <ul>
                            <li><a href="index.htm">Naslovna</a></li>
                            <li><a href="tablets.htm">Tableti</a></li>
                            <li><a href="smartphones.htm">Smart Telefoni</a></li>
                            <li><a href="laptops.htm">Laptopovi</a></li>
                            <li><a href="musicplayers.htm">Plejeri</a></li>
                        </ul>
                    </nav>
                </header>
                <div id="buttons">
                    <a href="admin.htm" class="button gray small">Administrator</a>
                    <a href="add_product.htm" class="button gray small">Dodaj novi proizvod</a>
                    <a href="edit_product.htm" class="button gray small">Izmeni proizvod</a>
                    <a href="delete_product.htm" class="button blue small">Izbriši proizvod</a>
                </div>
            </center>   
            <center>
                <table id="delete" style="width: 20%;">
                    <spring:nestedPath path="name">
                        <form:form method="POST" commandName="delete">
                            <tr>
                                <td>ID proizvoda:</td>
                                <td><spring:bind path="productId"><input type="text" name="${status.expression}" value="${status.value}"/></spring:bind></td>
                            </tr>
                            <tr>
                                <td></td>
                                <td><input class="push_button red" type="submit" value="Izbriši proizvod"/></td>
                            </tr> 
                        </form:form>
                    </spring:nestedPath>
                </table>  
            </center>
        </section>
    </body>
</html>
