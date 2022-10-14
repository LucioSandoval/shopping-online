package com.online.shopping.controller;

import com.online.shopping.model.Product;
import com.online.shopping.service.IProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class ProductController {

  @Autowired
  IProductService productService;


  @GetMapping("product")
  public List<Product> getProduct(){

    return  productService.getAll();
  }

}
