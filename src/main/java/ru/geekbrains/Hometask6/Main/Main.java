package ru.geekbrains.Hometask6.Main;

import ru.geekbrains.Hometask6.Service.CustomerService;
import ru.geekbrains.Hometask6.Service.CustomerServiceImpl;
import ru.geekbrains.Hometask6.Service.ProductService;
import ru.geekbrains.Hometask6.Service.ProductServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring_config_lesson6.xml");
        ProductService productService = context.getBean("productServiceImpl", ProductServiceImpl.class);
        CustomerService customerService = context.getBean("customerServiceImpl", CustomerServiceImpl.class);
        productService.getProductCostumers(3l);
        customerService.getCostumerProducts(1);
        customerService.getCostumerProducts(2);
        context.close();
    }
}
