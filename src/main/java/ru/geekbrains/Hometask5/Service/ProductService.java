package ru.geekbrains.Hometask5.Service;

import ru.geekbrains.Hometask5.Model.Product;

import java.util.List;

public interface ProductService {
    List<Product>getProduct();

    void saveOrUpdateCostumer (Product product);

    Product getProduct(long id);

    void deleteProduct(long id);

    List<Product> searchProduct(String SearchTitle);
}
