package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product();
		product.name = "Laptop";
		product.id = 1;
		product.price = 5000;
		product.description = "Asus Laptop";
		product.stockAmount = 5;
		
		System.out.println(product.name);

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
	}

}
