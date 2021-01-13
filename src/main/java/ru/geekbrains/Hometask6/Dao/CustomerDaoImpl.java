package ru.geekbrains.Hometask6.Dao;

import ru.geekbrains.Hometask6.Entity.Customer;
import ru.geekbrains.Hometask6.Entity.Product;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class CustomerDaoImpl implements CustomerDao {
    private final SessionFactory sessionFactory;

    @Override
    public void getCustomerProducts(int id) {
        Session currentSession = sessionFactory.getCurrentSession();
        Customer customer = currentSession.get(Customer.class, id);
        System.out.println(customer);
        for (Product p : customer.getProductList()) {
            System.out.println(p.getTitle());
        }
    }
}
