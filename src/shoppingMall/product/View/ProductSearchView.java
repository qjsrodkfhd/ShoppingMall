package shoppingMall.product.View;

import java.util.Scanner;

import shoppingMall.mainController.MainController;
import shoppingMall.product.vo.Product;

public class ProductSearchView {

	public void productSearch() {

		Scanner sc = new Scanner(System.in);

		System.out.println("[상품검색 모드]");
		System.out.println("[!]검색할 제품 번호를 선택 하세요.");
		System.out.println("번호입력 : ");
		int searchProductNumber = sc.nextInt();
		
		MainController.getProductController().requestSearchProductNumber(searchProductNumber);
	}

}
