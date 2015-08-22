<%-- 
    Document   : logout
    Created on : Apr 26, 2015, 9:43:23 PM
    Author     : Administrator
--%>
<% 
request.getSession().setAttribute("admin",null);
response.sendRedirect("index.htm");
%>
