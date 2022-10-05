package oopWithNLayereApp;

import oopWithNLayereApp.business.ProductManager;
import oopWithNLayereApp.core.loging.DatabaseLogger;
import oopWithNLayereApp.core.loging.FileLogger;
import oopWithNLayereApp.core.loging.Logger;
import oopWithNLayereApp.dataAccess.HibernateProductDao;
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
