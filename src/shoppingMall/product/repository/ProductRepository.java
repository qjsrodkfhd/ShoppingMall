package shoppingMall.product.repository;

import java.util.ArrayList;

import shoppingMall.product.vo.Product;

public class ProductRepository {

	private static ArrayList<Product> products;
	private static int productLastposition;
	
	public ProductRepository() {
		
		products = new ArrayList<Product>();
		
		Product newProduct1 = new Product("이름1",100000,"브랜드1","녹색");
		newProduct1.setProductNumber(1);
		products.add(0, newProduct1);
		
		newProduct1 = new Product("이름2",200000,"브랜드2","흰색");
		newProduct1.setProductNumber(2);
		products.add(1, newProduct1);
	
		productLastposition = 1;
		
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
