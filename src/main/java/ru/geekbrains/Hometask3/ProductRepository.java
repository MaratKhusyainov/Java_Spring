package ru.geekbrains.Hometask3;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

@Component
@AllArgsConstructor
public class ProductRepository {
    private List<Product> productList;

    @PostConstruct
    public void init() {
        productList.add(new Product(1234L, "IPhone 8", new BigDecimal("70000").setScale(2, BigDecimal.ROUND_HALF_UP)));
        productList.add(new Product(5678L, "IPhone 9", new BigDecimal("80000").setScale(2, BigDecimal.ROUND_HALF_UP)));
        productList.add(new Product(8765L, "IPhone 10", new BigDecimal("90000").setScale(2, BigDecimal.ROUND_HALF_UP)));
        productList.add(new Product(4321L, "IPhone 11", new BigDecimal("100000").setScale(2, BigDecimal.ROUND_HALF_UP)));
        productList.add(new Product(1234L, "IPhone 12", new BigDecimal("110000").setScale(2, BigDecimal.ROUND_HALF_UP)));
    }

    public List<Product> getProductList() {
        return Collections.unmodifiableList(productList);
    }

    public Product getById(int i) {
        return this.productList.get(i - 1);
    }
    public void save(Product product) {
        productList.add(product);
    }

    public void deleteById(Long id) {
        productList.removeIf(b -> b.getId().equals(id));
    }

}
