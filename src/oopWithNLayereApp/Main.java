package oopWithNLayereApp;

import oopWithNLayereApp.business.ProductManager;
import oopWithNLayereApp.core.logging.DatabaseLogger;
import oopWithNLayereApp.core.logging.FileLogger;
import oopWithNLayereApp.core.logging.Logger;
import oopWithNLayereApp.dataAccess.JdbcProductDao;
import oopWithNLayereApp.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        Product product1 = new Product(1, "Iphone 11ProMax", 3000);
        List<Logger> loggerList = new ArrayList<>();
        loggerList.add(new DatabaseLogger());
        loggerList.add(new FileLogger());

        ProductManager productManager = new ProductManager(new JdbcProductDao(), loggerList);
        productManager.add(product1);
    }
}
