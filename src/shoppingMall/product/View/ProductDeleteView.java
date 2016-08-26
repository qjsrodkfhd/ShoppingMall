package shoppingMall.product.View;

import java.util.Scanner;

import shoppingMall.mainController.MainController;
import shoppingMall.product.controller.ProductController;
import shoppingMall.product.vo.Product;

public class ProductDeleteView {
	
	public void productDelete() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("[!]삭제할 제품 번호를 선택 하세요.");
		System.out.println("번호선택 : ");
		int selectedProductNumber = sc.nextInt();
		
		//selectedProductNumber()통해 전달 받은 입력값을 Controller의 requestGetSelectedProductNumber()으로 전달.
		MainController.getProductController().requestGetSelectedProductNumber(selectedProductNumber);

	}

}
