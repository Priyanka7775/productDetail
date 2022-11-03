package com.example.productDetail.services;

import com.example.productDetail.domain.Product;

import java.util.List;

public interface ProductServices {
    public Product addProduct(Product product);
    public List<Product> getAllProduct();
    public boolean deleteProductById(int productId);
    public List<Product> getProductByProductId(int productId);
}
