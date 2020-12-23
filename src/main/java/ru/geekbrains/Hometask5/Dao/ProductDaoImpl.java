package ru.geekbrains.Hometask5.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import ru.geekbrains.Hometask5.Model.Product;

import java.util.List;

public class ProductDaoImpl implements ProductDao {
    private SessionFactory sessionFactory;

    @Override
    public List<Product> getProduct() {
        Session session = sessionFactory.getCurrentSession();
        Query<Product> productQuery = session.createQuery("from Product", Product.class);
        List<Product> productList = productQuery.getResultList();
        return productList;
    }

    @Override
    public void saveOrUpdateProduct(Product product) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(product);
    }

    @Override
    public Product getProduct(Long id) {
        Session currentSession = sessionFactory.getCurrentSession();
        return currentSession.get(Product.class, id);
    }

    @Override
    public void deleteProduct(Long id) {
        Session currentSession = sessionFactory.getCurrentSession();
        Query query = currentSession.createQuery("delete from product where id =:customerId");
        query.setParameter("customerId", id);
        query.executeUpdate();
    }

    @Override
    public List<Product> searchProduct(String theSearchTitle) {
        Session currentSession = sessionFactory.getCurrentSession();
        Query theQuery = null;
        if (theSearchTitle != null && theSearchTitle.trim().length() > 0) {
            theQuery = currentSession.createQuery("from Product where lower(title) like:title", Product.class);
            theQuery.setParameter("title", "%" + theSearchTitle.toLowerCase() + "%");
        } else {
            theQuery = currentSession.createQuery("from Product", Product.class);
        }
        return (List<Product>) theQuery.getResultList();
    }


}
