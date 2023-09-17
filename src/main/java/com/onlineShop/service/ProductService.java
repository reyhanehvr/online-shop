package com.onlineShop.service;


import com.onlineShop.model.Category;
import com.onlineShop.model.Product;
import com.onlineShop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<Product> getAllProduct(){return productRepository.findAll();}
    public void addProduct(Product product){productRepository.save(product);}
    public void removeProductById(int id){productRepository.deleteById(id);}
    public Optional<Product> getProductById(int id){return productRepository.findById(id);}
    public List<Product> getAllProductByCategoryId(int id){return productRepository.findAllByCategory_Id(id);}



}
