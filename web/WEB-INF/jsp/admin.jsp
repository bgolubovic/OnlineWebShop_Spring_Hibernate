<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
if(request.getSession().getAttribute("admin")==null){
    response.sendRedirect("admin_login.htm");
}    
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Administrator</title>
        <link rel="stylesheet" href="style.css" type="text/css">
    </head>

    <body>
        <section>
            <center>
                <header>
                    <a class="logout" href="logout.htm">Logout</a>                    
                    <h1>Administrator Kontrolni Panel</h1>
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
            </center>
            <center>
                <div id="buttons">
                    <a href="admin.htm" class="button blue small">Administrator</a>
                    <a href="add_product.htm" class="button gray small">Dodaj novi proizvod</a>
                    <a href="edit_product.htm" class="button gray small">Izmeni proizvod</a>
                    <a href="delete_product.htm" class="button gray small">Izbriši proizvod</a>
                </div>
            </center>
        </section>
    </body>
</html>
