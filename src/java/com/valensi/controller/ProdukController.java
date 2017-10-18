/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi.controller;

import com.valensi.dao.ProdukService;
import com.valensi.model.Produk;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


//@Controller
//@RequestMapping("/customer")
//public class ProdukController {
//    @Autowired
//    ProdukService cs;
//    
//    @RequestMapping(value="/all")
//    public String showAllCustomers(HttpSession session){
//        List<Produk> customers=cs.findAllCustomer();
//        session.setAttribute("customer", customers);
//        return "customer";
//    }
//    
//    @RequestMapping(value ="/{id}")
//    public String showOneCustomer(@PathVariable Integer id, HttpSession session){
//        Produk customer= cs.finById(id);
//        session.setAttribute("customer", customer);
//        return "customerdetail";
//    }
//    
//     @RequestMapping("/addCarts")
//    public String addToCarts(HttpSession session){
//    List<Produk> barang= (List<Produk>) session.getAttribute("keranjang");
//    barang.add((Produk) session.getAttribute("prod"));
//    session.removeAttribute("prod");
//    return "keranjang";
//    }
//}

@Controller
@RequestMapping("/customer")
public class ProdukController {
    @Autowired
    ProdukService cs;
    
    List<Produk> keranjang = new ArrayList<>();
    
    @RequestMapping("/all")
    public String showAllProduct(HttpSession session){
    List<Produk> product=cs.findAllCustomer();
    session.setAttribute("customer",product);
    session.setAttribute("keranjang",keranjang);
    return "customer";
    }
    
    @RequestMapping(value ="/{id}")
    public String showOneCustomer(@PathVariable Integer id, HttpSession session){
        Produk customer= cs.finById(id);
        session.setAttribute("customer", customer);
        return "customerdetail";
    }
    
    @RequestMapping("/addCarts")
    public String addToCarts(HttpSession session){
    List<Produk> barang= (List<Produk>) session.getAttribute("keranjang");
    barang.add((Produk) session.getAttribute("customer"));
    session.removeAttribute("cuctomer");
    return "keranjang";
    }
}
