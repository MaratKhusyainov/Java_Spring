package ru.geekbrains.Hometask5;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.geekbrains.Hometask5.Model.Product;
import ru.geekbrains.Hometask5.Service.ProductService;
import ru.geekbrains.Hometask5.Service.ProductServiceImpl;

public class CrudApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
        ProductService productService = context.getBean("productService2", ProductServiceImpl.class);
        System.out.println(productService.getProduct());
        productService.saveOrUpdateCostumer(new Product("IPhone 8",70000));
        System.out.println(productService.getProduct());
        productService.saveOrUpdateCostumer(new Product(1L,"IPhone 9",80000));
        System.out.println(productService.getProduct());
        System.out.println(productService.getProduct(30));
        productService.deleteProduct(2L);
        System.out.println(productService.searchProduct("smartphone"));
    }
}
