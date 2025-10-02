package com.tutorial.apidemo.controller;
import com.tutorial.apidemo.models.Product;
import com.tutorial.apidemo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import  org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
@RestController
@RequestMapping(path = "/api/v1/Products")
public class ProductController
{
    @Autowired
    private ProductRepository repository;
    @GetMapping("")
    List<Product> getAllProducts()
    {
//        return List.of(
//                new Product(1L,"Macbook",2020,2400,""),
//                new Product(2L,"Ipad",2025,2500,"")
                // Lưu database và cần dùng tới depedence H2
                // kiểm tra api bằng postman có gửi về dữ liệu không
        return repository.findAll();


    }
}

