package com.example.productDetail.controller;

import com.example.productDetail.domain.Product;
import com.example.productDetail.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/productDetails/app/")
public class ProductController {

    private ProductServices productServices;
    @Autowired
    public ProductController(ProductServices productServices){
        this.productServices=productServices;
    }
    @PostMapping("/product")
    public ResponseEntity<?> insertProduct(@RequestBody Product product){
        return new ResponseEntity<>(productServices.addProduct(product), HttpStatus.CREATED);
    }
    @GetMapping("/product1")
    public ResponseEntity<?> getProductDetails(){
        return  new ResponseEntity<>(productServices.getAllProduct(),HttpStatus.FOUND);
    }
    @DeleteMapping("/product/{productId}")
    public ResponseEntity<?> deleteProduct(@PathVariable int productId){
        return new ResponseEntity<>(productServices.deleteProductById(productId),HttpStatus.FOUND);
    }
    @GetMapping("/product/{productId}")
    public ResponseEntity<?> fetchByProductId(@PathVariable int productId){
        return new ResponseEntity<>(productServices.getProductByProductId(productId),HttpStatus.FOUND);
    }


}
