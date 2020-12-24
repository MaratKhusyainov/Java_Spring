package ru.geekbrains.Hometask5.Dao;

import ru.geekbrains.Hometask5.Model.Product;

import java.util.List;

public interface ProductDao {
    public List<Product> getProduct();

    void saveOrUpdateProduct(Product product);

    Product getProduct(Long id);

    void deleteProduct(Long id);

    List<Product> searchProduct(String theSearchTitle);
}