package shoppingMall.product.repository;

import java.util.ArrayList;

import shoppingMall.product.vo.Product;

public class ProductRepository {

	// variable
	private static ArrayList<Product> products;
	private static int productLastposition;
	
	// constructor
	public ProductRepository() {
			
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
