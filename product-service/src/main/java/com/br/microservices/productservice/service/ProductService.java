package com.br.microservices.productservice.service;

import com.br.microservices.productservice.dto.ProductRequest;
import com.br.microservices.productservice.model.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    public void createProduct(ProductRequest productRequest) {
        Product product = Product.builder()
    }

}
