package oopWithNLayereApp.dataAccess;

import oopWithNLayereApp.entities.Product;

public class JdbcProductDao implements ProductDao{
    public void add(Product product) {
        //db access codes are written...SQL
        System.out.println("Added to database with JDBC");
    }
}
