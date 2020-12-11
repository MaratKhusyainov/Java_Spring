package com.spring.Hometask2;

import com.spring.Hometask2.Configuration.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        System.out.println("Используйте команды: \nadd и Номер продукта \ndelete и Номер продукта для удаления" +
                "\nExit для закрытия.\n");
        Cart cart = context.getBean("cart", Cart.class);
        cartAction(cart);
        context.close();
    }

    public static void cartAction(Cart cart) {
        Scanner scanner = new Scanner(System.in);
        boolean b = true;
        while (b) {
            String command = scanner.next();
            if (command.startsWith("add")) {
                try {
                    cart.addProduct(scanner.nextInt());
                    System.out.println("Cart: " + cart.getProductList());
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("\nНомер продукта некорректен, попробуй ещё раз.\n");
                }
            } else if (command.startsWith("delete")) {
                try {
                    cart.deleteProduct(scanner.nextInt());
                    System.out.println("Cart: " + cart.getProductList());
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("\nНомер продукта некорректен, попробуй ещё раз.\n");
                }
            } else if (command.startsWith("exit")) {
                b = false;
            }
        }
        System.out.println("В твоей корзине:" + cart.getProductList());
    }
}

