package oopWithNLayereApp.business;

import oopWithNLayereApp.core.loging.Logger;
import oopWithNLayereApp.dataAccess.JdbcProductDao;
import oopWithNLayereApp.dataAccess.ProductDao;
import oopWithNLayereApp.entities.Product;

import java.util.List;

public class ProductManager {
    private ProductDao productDao;
    private List<Logger> loggers;

    public ProductManager(ProductDao productDao, List<Logger> loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }


    public void add(Product product) throws Exception {
        //business rules
        if (product.getUnitPrice() < 1000) {
            throw new Exception("The product price cannot be less than 10");
        }

        productDao.add(product);
        for(Logger logger:loggers){
            logger.log(product.getName());
        }
    }
}
