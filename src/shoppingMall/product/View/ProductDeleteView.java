package shoppingMall.product.View;

import java.util.Scanner;

import shoppingMall.product.vo.Product;

public class ProductDeleteView {
	
	public void productDelete() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 제품 번호를 선택 하세요.");
		System.out.println("번호선택 : ");
		int selectedProductNumber = sc.nextInt();
		
		Product selectedProduct = new Product(int selectedProductNumber);
		
	}

}
