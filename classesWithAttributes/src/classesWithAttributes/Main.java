package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);
		product.setRenk("");
	
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());
		
		//kullanıcı herhangi bir alan için kısıtlamayı öngörürür encapsulation
		//constructor iki yazım stilini de kullanmak demektir
		//overloading aynı anda iki yazım şeklini kullanmak demek(hem set hemde tek satırda kod yazımı)
		
		
		
		

	}

}
