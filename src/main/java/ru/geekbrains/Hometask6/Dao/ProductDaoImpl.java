package ru.geekbrains.Hometask6.Dao;

import ru.geekbrains.Hometask6.Entity.Customer;
import ru.geekbrains.Hometask6.Entity.Product;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;


@Repository
@RequiredArgsConstructor
public class ProductDaoImpl implements ProductDao {
    private final SessionFactory sessionFactory;

    @Override
    public void getProductCustomers(Long id) {
        Session currentSession = sessionFactory.getCurrentSession();
        Product product = currentSession.get(Product.class, id);
        System.out.println(product);
        for (Customer b : product.getCustomerList()) {
            System.out.println(b.getName());
        }
    }
}