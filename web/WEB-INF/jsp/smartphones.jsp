<%@include file="taglib_include.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Smart Telefoni | Gadgets Online Prodavnica</title>
        <link rel="stylesheet" href="style.css" type="text/css">
    </head>

    <body>
        <section>
            <center>
                <header>
                        <h1>Smart Telefoni | Gadgets Online Prodavnica</h1> 
                        <nav>
                            <ul>
                                <li><a href="index.htm">Naslovna</a></li>
                                <li><a href="tablets.htm">Tableti</a></li>
                                <li><a class="current" href="smartphones.htm">Smart Telefoni</a></li>
                                <li><a href="laptops.htm">Laptopovi</a></li>
                                <li><a href="musicplayers.htm">Plejeri</a></li>
                            </ul>
                        </nav>
                </header>
            </center>    
            <table>
                <tr>
                    <th>Ime proizvoda</th><th>Tip proizvoda</th><th>Cena</th><th>Boja proizvoda</th><th>Proizvođač</th><th>Memorija proizvoda</th><th>&nbsp;</th>
                </tr>
                <c:forEach var="smartphones" items="${smartphones}">
                    <tr>
                        <td>
                            <c:out value="${smartphones.getProductName()}"></c:out>
                        </td>
                        <td>
                            <c:out value="${smartphones.getProductType()}"></c:out>
                        </td>
                        <td>
                            <c:out value="${smartphones.getPrice()}"></c:out>&nbsp;rsd
                        </td>
                        <td>
                            <c:out value="${smartphones.getProductColor()}"></c:out>
                        </td>
                        <td>
                            <c:out value="${smartphones.getProductBrand()}"></c:out>
                        </td>
                        <td>
                            <c:out value="${smartphones.getProductSize()}"></c:out>
                        </td>
                        <td>
                            <a href="#"><img src="images/addtocart.png" /></a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </section>
    </body>
</html>
