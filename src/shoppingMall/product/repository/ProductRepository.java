package shoppingMall.product.repository;

import java.util.ArrayList;

import shoppingMall.product.vo.Product;

public class ProductRepository {

	// variable
	private static ArrayList<Product> products;
	private static int productLastposition;
	
	// constructor
	public ProductRepository() {
<<<<<<< HEAD
<<<<<<< HEAD
		
		products = new ArrayList<Product>();
		
		Product newProduct1 = new Product("SH01",120000,"운동화","검정");
		newProduct1.setProductNumber(1);
		products.add(0, newProduct1);
		
		newProduct1 = new Product("SH02",130000,"테니스화","흰색");
		newProduct1.setProductNumber(2);
		products.add(1, newProduct1);
	
		newProduct1 = new Product("SH03",180000,"농구화","파란색");
		newProduct1.setProductNumber(3);
		products.add(2, newProduct1);
		
		newProduct1 = new Product("SH04",230000,"골프화","보라색");
		newProduct1.setProductNumber(4);
		products.add(3, newProduct1);
		
		newProduct1 = new Product("SH05",80000,"축구화","노란색");
		newProduct1.setProductNumber(5);
		products.add(4, newProduct1);
		
		productLastposition = 5;
		
=======
			
>>>>>>> parent of 86c1990... update login
=======
			
>>>>>>> parent of 93f7781... Revert "update fileio Order and Product"
	}

	// getter and setter
	public static ArrayList<Product> getProducts() {
		return products;
	}

	public static int getProductLastposition() {
		return productLastposition;
	}

	public static void setProductLastposition(int productLastposition) {
		ProductRepository.productLastposition = productLastposition;
	}
}
