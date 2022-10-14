package com.online.shopping.service;

import com.online.shopping.model.Product;
import com.online.shopping.repository.IProductRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements IProductService{

  @Autowired
  IProductRepository productRepository;

  @Override
  public List<Product> getAll() {
    List <Product> products = productRepository.findAll();
    return products;
  }

}
