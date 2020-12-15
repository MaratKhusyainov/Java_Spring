package com.spring.Hometask2;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.List;

@Component
@AllArgsConstructor
public class ProductRepository {

    private List<Product> productList;

    @PostConstruct
    public void init() {
            int i = 1;
            productList.add(new Product(i++, "IPhone 8", 70000));
            productList.add(new Product(i++, "IPhone 9", 80000));
            productList.add(new Product(i++, "IPhone 10", 90000));
            productList.add(new Product(i++, "IPhone 11", 100000));
            productList.add(new Product(i++, "IPhone 12", 110000));
    }

    public List<Product> getProductList() {
        return Collections.unmodifiableList(productList);
    }

    public Product getById(int i) {
        return this.productList.get(i - 1);
    }
}
