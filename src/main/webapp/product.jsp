<%@ page import="java.util.ArrayList" %>
<%@ page import="ru.geekbrains.servlet.Product" %><%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 06.12.2020
  Time: 16:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product</title>
</head>
<body>
<h3>Product info</h3>
<table border="1" width="500" align="center">
    <tr bgcolor="#deb887">
        <th><b>Product ID</b></th>
        <th><b>Product Title</b></th>
        <th><b>Product Price<b>

<%
    ArrayList<Product> product =
            (ArrayList<Product>) request.getAttribute("product");
    for (Product p : product) {%>
    <tr>
        <td><%=p.getId()%>
        </td>
        <td><%=p.getTitle()%>
        </td>
        <td><%=p.getPrice() + " p."%>
        </td>
    </tr>
<%}%>

</table>
<hr/>
</body>
</html>
