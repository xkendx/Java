package oopIntro;

public class Main {
    public static void main(String[] args) {
        
        Product product1 = new Product();  // reference, instance
        product1.setId(1);
        product1.setName("Lenovo V14");
        product1.setUnitPrice(10000);
        product1.setDetail("16 GB Ram");
        product1.setDiscount(10);

        Product product2 = new Product(2, "Lenovo 15", 15000, "32 GB Ram", 10, 13500);
        // Product product2 = new Product();
        // product2.id = 2;
        // product2.name = "Lenovo V15";
        // product2.unitPrice = 15000;
        // product2.detail = "32 GB Ram";


        // Product product3 = new Product();
        
        // product3.id = 3;
        // product3.name = "HP 15";
        // product3.unitPrice = 9000;
        // product3.detail = "16 GB Ram";

        // Product product4 = new Product(4, "Dell XPS15", 25000, "64 GB Ram");

        // Product[] products = {product1, product2, product3, product4};

        Product[] products = {product1, product2};

        for (Product product : products) {
            System.out.println(product.getName());
        }

        System.out.println(products.length);


        Category category1 = new Category();
        category1.setId(1);
        category1.setName("Computer");

        // Category category2 = new Category();
        // category2.id = 2;
        // category2.name = "Home & Garden";

        
        System.out.println("Category name " + category1.getName());
        
        ProductManager productManager = new ProductManager();
        productManager.addToCart(product1);
        
        productManager.addToCart(product2);
        
        // productManager.addToCart(product3);
        
        // productManager.addToCart(product4);


    }
}