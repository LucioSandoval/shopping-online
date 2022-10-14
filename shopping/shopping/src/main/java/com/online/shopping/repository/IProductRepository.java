package com.online.shopping.repository;

import com.online.shopping.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product, Long> {

}
