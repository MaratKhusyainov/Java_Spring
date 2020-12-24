package ru.geekbrains.Hometask3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductService {
    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public List<Product> getAllProducts() {
        return productRepository.getProductList();
    }
    public void save(Product product) {
        productRepository.save(product);
    }


    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }
}
