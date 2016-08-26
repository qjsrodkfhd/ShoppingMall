package shoppingMall.product.View;

import java.util.Scanner;

import shoppingMall.mainController.MainController;

public class ProductMenuView {
	
	public void productMenuView() {
		
		Scanner sc = new Scanner(System.in);
		
		boolean isFind = false;
		
		while(true) {
			
			String[] productMenuItem = {"1.상품조회","2.상품등록","3.상품수정","4.상품삭제","5.바로가기"};
			
			for(int i = 0 ; i < productMenuItem.length ; i++) {
				System.out.println(productMenuItem[i]);
			}
			
			System.out.println("[상품관리]");
			System.out.println("번호선택 : ");
			int selectedNumber = sc.nextInt();
			
			if(selectedNumber == 1) {
				
				//상품조회
				MainController.getProductController().requestSearchProduct();
				
			} else if (selectedNumber == 2) {
				
				//상품등록
				MainController.getProductController().requestRegisterProduct();
				
			} else if (selectedNumber == 3) {
				
				//상품수정
				MainController.getProductController().requestUpdateProductView();
				
			} else if (selectedNumber == 4) {
				
				//상품삭제
				MainController.getProductController().requestDeleteProductView();
				
			} else if (selectedNumber == 5) {
				
				//바로 전 단계 메뉴로 돌아가기
				break;
				
			} else {
				System.out.println("[!]없는 번호 입니다.");
			}
			
			
		}//end of while
	}

}
