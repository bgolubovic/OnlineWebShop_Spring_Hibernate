<%@include file="taglib_include.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Tableti | Gadgets Online Prodavnica</title>
        <link rel="stylesheet" href="style.css" type="text/css">
    </head>

    <body>
        <section>
            <center>
                <header>
                        <h1>Tableti | Gadgets Online Prodavnica</h1> 
                        <nav>
                            <ul>
                                <li><a href="index.htm">Naslovna</a></li>
                                <li><a class="current" href="tablets.htm">Tableti</a></li>
                                <li><a href="smartphones.htm">Smart Telefoni</a></li>
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
                <c:forEach var="tablets" items="${tablets}">
                    <tr>
                        <td>
                            <c:out value="${tablets.getProductName()}"></c:out>
                        </td>
                        <td>
                            <c:out value="${tablets.getProductType()}"></c:out>
                        </td>
                        <td>
                            <c:out value="${tablets.getPrice()}"></c:out>&nbsp;rsd
                        </td>
                        <td>
                            <c:out value="${tablets.getProductColor()}"></c:out>
                        </td>
                        <td>
                            <c:out value="${tablets.getProductBrand()}"></c:out>
                        </td>
                        <td>
                            <c:out value="${tablets.getProductSize()}"></c:out>
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
