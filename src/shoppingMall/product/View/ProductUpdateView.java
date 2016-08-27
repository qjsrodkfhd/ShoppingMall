package shoppingMall.product.View;

import java.util.Scanner;

public class ProductUpdateView {
	
	// variable
	private Scanner keyboard;
	
	// constructor
	public ProductUpdateView() {
		
		this.keyboard = new Scanner(System.in);
		
	}
	
	// method
	// 상품 업데이트
	public void productUpdate() {
				
		System.out.println("[상품 업데이트 모드]");
		System.out.println("[!]수정할 제품 번호를 선택 하세요.");
		System.out.println("번호선택 : ");
		int selectedProductNumber = keyboard.nextInt();
		
	}

}
