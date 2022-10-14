package com.online.shopping.service;

import com.online.shopping.model.Product;
import java.util.List;
import org.apache.catalina.LifecycleState;

public interface IProductService {
  public List<Product> getAll();

}
