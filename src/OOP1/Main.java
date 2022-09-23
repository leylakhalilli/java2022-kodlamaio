package OOP1;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makinesi");
        product1.setDiscount(7);
        product1.setImageUrl("random.jpg");
        product1.setUnitPrice(7500);
        product1.setUnitsInStock(3);

        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setDiscount(7);
        product2.setImageUrl("random.jpg");
        product2.setUnitPrice(7500);
        product2.setUnitsInStock(3);

        Product product3 = new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setDiscount(7);
        product3.setImageUrl("random.jpg");
        product3.setUnitPrice(7500);
        product3.setUnitsInStock(3);

        Product[] products = {product1, product2, product3};
        System.out.println("<ul>");
        for (Product product : products) {
            System.out.println("<li>" + product.getName() + "</li>");
        }
        System.out.println("</ul>");

        /////////////////////////////////////

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("0000000");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("Leyla");
        individualCustomer.setLastName("Khalilli");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("kodlama.io");
        corporateCustomer.setPhone("00022222");
        corporateCustomer.setTaxNumber("11111111111");
        corporateCustomer.setCustomerNumber("54321");

        Customer[] customers = {individualCustomer, corporateCustomer};
        

    }
}
