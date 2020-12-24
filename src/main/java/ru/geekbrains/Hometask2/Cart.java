package ru.geekbrains.Hometask2;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;


@Component
@Scope(value = "prototype")
@Getter
@NoArgsConstructor
public class Cart {
    private ProductRepository productRepository;
    private List<Product> productList;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostConstruct
    public void init() {
        productList = new ArrayList<>();
    }

    public void addProduct(int i) {
        productList.add(productRepository.getById(i));
    }

    public void deleteProduct(int i) {
        int ind = 0;
        for (Product p : productList) {
            int id = p.getId();
            if (id != i) {
                ind++;
            } else {
                break;
            }
        }
        productList.remove(ind);
    }
}


