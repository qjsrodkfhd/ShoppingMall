package shoppingMall.product.View;

import java.util.Scanner;

import shoppingMall.product.vo.Product;

public class ProductInsertView {
	
	public Product productInsertView() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[제품등록 모드]");
		System.out.println("------------------------------");
		
		System.out.print("제품명 : ");
		String productName = sc.next();
		
		System.out.print("제품가격 : ");
		int productPrice = sc.nextInt();

		System.out.print("제품브랜드 : ");
		String productBrandName = sc.next();
		
		System.out.print("제품컬러 : ");
		String productColor = sc.next();
		System.out.println();
		
		Product newProduct = new Product(productName, productPrice, productBrandName, productColor);
		
		return newProduct;
		
	}
	
}
