<%-- 
    Document   : keranjangBelanja
    Created on : Oct 18, 2017, 8:48:28 AM
    Author     : Rusfandi
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="keranjang" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Keranjang Detail</title>
    </head>
    <body>
        <h1>Keranjang</h1>
        <keranjang:forEach items="${customer}" var="k">
            <p>
                ${k.namaproduk}
            </p>
        </keranjang:forEach>
            <a href="customer/all"><button>Kembali</button></a>
    </body>
</html>
