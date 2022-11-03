package com.example.productDetail.services;

import com.example.productDetail.domain.Product;
import com.example.productDetail.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServicesImpl implements ProductServices{

    private ProductRepository productRepository;
    public ProductServicesImpl(ProductRepository productRepository){
        this.productRepository=productRepository;
    }
    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public boolean deleteProductById(int productId) {
        productRepository.deleteById(productId);
        return true;
    }

    @Override
    public List<Product> getProductByProductId(int productId) {
        return productRepository.findByProductId(productId);
    }
}
