<%@include file="taglib_include.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Izmeni proizvod | Administrator</title>
        <link rel="stylesheet" href="style.css" type="text/css">
    </head>

    <body>
        <section>
            <center>
                <header>
                    <a class="logout" href="logout.htm">Logout</a> 
                    <h1>Izmeni proizvod | Administrator</h1> 
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
                    <a href="edit_product.htm" class="button blue small">Izmeni proizvod</a>
                    <a href="delete_product.htm" class="button gray small">Izbriši proizvod</a>
                </div>
            </center>    
            <table id="edit" style="width: 20%;">
                    <spring:nestedPath path="name">
                        <form:form method="POST" commandName="edit">
                            <tr>
                                <td>ID proizvoda:</td>
                                <td><spring:bind path="productId"><input type="text" name="${status.expression}" value="${status.value}"/></spring:bind></td>
                            </tr>
                            <tr>
                                <td>Ime proizvoda:</td>
                                <td><spring:bind path="productName"><input type="text" name="${status.expression}" value="${status.value}"/></spring:bind></td>
                            </tr>
                            <tr>
                                <td>Tip proizvoda:</td>
                                <td><spring:bind path="productType"><input type="text" name="${status.expression}" value="${status.value}"/></spring:bind></td>
                            </tr>
                            <tr>
                                <td>Cena:</td>
                                <td><spring:bind path="Price"><input type="text" name="${status.expression}" value="${status.value}"/></spring:bind></td>
                            </tr>
                            <tr>
                                <td>Boja proizvoda:</td>
                                <td><spring:bind path="productColor"><input type="text" name="${status.expression}" value="${status.value}"/></spring:bind></td>
                            </tr>
                            <tr>
                                <td>Proizvođač:</td>
                                <td><spring:bind path="productBrand"><input type="text" name="${status.expression}" value="${status.value}"/></spring:bind> </td>
                            </tr>
                            <tr>
                                <td>Memorija proizvoda:</td>
                                <td><spring:bind path="productSize"><input type="text" name="${status.expression}" value="${status.value}"/></spring:bind> </td>
                            </tr>
                            <tr>
                                <td></td>
                                <td><input class="push_button red"type="submit" value="Izmeni proizvod"/></td>
                            </tr> 
                        </form:form>
                    </spring:nestedPath>
                </table>      
        </section>
    </body>
</html>
