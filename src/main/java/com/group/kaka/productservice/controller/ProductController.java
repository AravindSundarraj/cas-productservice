package com.group.kaka.productservice.controller;

import com.group.kaka.productservice.entity.ProductEntity;
import com.group.kaka.productservice.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductRepo productRepo;

    @GetMapping
    public ResponseEntity<ProductEntity> getProducts() {

        System.out.println("get into Products");
        List<ProductEntity> listProduct = productRepo.findAll();
        ResponseEntity<ProductEntity> response = new ResponseEntity(listProduct,
                HttpStatus.OK);
        return response;
    }
}
