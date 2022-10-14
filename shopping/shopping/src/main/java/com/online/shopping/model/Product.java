package com.online.shopping.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String name;
  private String url_image;
  private float price;
  private int discount;
  @ManyToOne(fetch = FetchType.LAZY)
  private   Category categoria;

  @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
  @JsonIgnore
  @JoinColumn(name = "category", nullable = false)
  private Category category;

  public Product() {
  }

  public Product(long id, String name, String url_image, float price, int discount,
      Category idCategoria) {
    this.id = id;
    this.name = name;
    this.url_image = url_image;
    this.price = price;
    this.discount = discount;
    this.category = idCategoria;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUrl_image() {
    return url_image;
  }

  public void setUrl_image(String url_image) {
    this.url_image = url_image;
  }

  public float getPrice() {
    return price;
  }

  public void setPrice(float price) {
    this.price = price;
  }

  public int getDiscount() {
    return discount;
  }

  public void setDiscount(int discount) {
    this.discount = discount;
  }

  public Category getCategory() {
    return category;
  }

  public void setIdCategory(Category idCategoria) {
    this.category = idCategoria;
  }
}
