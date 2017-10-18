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
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/keranjangBelanja")
public class CartsController {
    @Autowired
    ProdukService service;
    
    @RequestMapping()
    public String keranjang(HttpSession session, Model model){
    List<Produk> listProd=(List<Produk>) session.getAttribute("keranjang");
    List<Produk> products=new ArrayList<>();
        for (Produk produk : listProd) {
            products.add(service.finById(produk.getId()));
        }
        model.addAttribute("customer",products);
        
        return "keranjangBelanja";
    }
}
