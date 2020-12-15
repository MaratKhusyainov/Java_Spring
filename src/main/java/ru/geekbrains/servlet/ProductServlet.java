package ru.geekbrains.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@WebServlet(name = "ProductServlet", urlPatterns = "/product")
public class ProductServlet extends HttpServlet {
    private List<Product> list;
    private static Logger logger = LoggerFactory.getLogger(ProductServlet.class);
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init();
        logger.info("init methode");
        list = new ArrayList<>();
        list.add(new Product(1, "IPhone 8", 75000));
        list.add(new Product(2, "IPhone 9", 80000));
        list.add(new Product(3, "IPhone 10", 90000));
        list.add(new Product(4, "IPhone 11", 100000));
        list.add(new Product(5, "IPhone 12", 110000));
        list.add(new Product(6, "IPhone 12 Pro", 120000));
        list.add(new Product(7, "IPhone 12 Pro Max", 130000));
        list.add(new Product(8, "Apple Watch", 30000));
        list.add(new Product(9, "Apple IMac", 140000));
        list.add(new Product(10, "Air Pods", 20000));

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        logger.info("get request");
        request.setAttribute("product", list);
        request.getRequestDispatcher("product.jsp").forward(request, response);
    }
}
