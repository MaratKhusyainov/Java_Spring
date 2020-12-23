package ru.geekbrains.Hometask5.Service;

import ru.geekbrains.Hometask5.Dao.ProductDao;
import ru.geekbrains.Hometask5.Model.Product;

import javax.transaction.Transactional;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    private final ProductDao productDao;

    public ProductServiceImpl(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    @Transactional
    public List<Product>getProduct() {
        return productDao.getProduct();
    }

    @Override
    @Transactional
    public void saveOrUpdateCostumer(Product product) {
        productDao.saveOrUpdateProduct(product);

    }

    @Override
    @Transactional
    public Product getProduct(long id) {
        return productDao.getProduct(id);
    }

    @Override
    @Transactional
    public void deleteProduct(long id) {
        productDao.deleteProduct(id);

    }

    @Override
    @Transactional
    public List<Product> searchProduct(String SearchTitle) {
        return productDao.searchProduct(SearchTitle);
    }

}
