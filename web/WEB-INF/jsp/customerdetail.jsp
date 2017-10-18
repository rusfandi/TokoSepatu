<%-- 
    Document   : customerdetail
    Created on : Oct 13, 2017, 4:23:10 PM
    Author     : Misbahul Munir
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head
        
 
        <title>JSP Page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
    </head>
    <body>
        <h1>ID Produk : ${customer.namaproduk}</h1>
        Nama Produk : ${customer.namaproduk}<br/>
        Harga : ${customer.harga}<br/>
        Stok : ${customer.stok}<br/>
        <a href="addCarts"><button type="button" class="btn btn-primary">Tambah</button></a>
    </body>
</html>
