package shoppingMall.product.repository;

import java.util.ArrayList;

import shoppingMall.product.vo.Product;

public class ProductRepository {

	private static ArrayList<Product> products;
	private static int productLastposition;
	
	public ProductRepository() {
		products = new ArrayList<Product>();
	}

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
