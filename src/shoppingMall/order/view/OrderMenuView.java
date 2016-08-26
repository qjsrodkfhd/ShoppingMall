package shoppingMall.order.view;

import java.util.Scanner;

import shoppingMall.mainController.MainController;

public class OrderMenuView {

	// variable
	Scanner keyboard;

	public OrderMenuView() {
		this.keyboard = new Scanner(System.in);
	}


	public void orderMenu(){

		System.out.println("상품 구매 페이지 입니다");

		while(true){
			System.out.println("원하시는 항목을 선택해 주세요");
			System.out.println("1. 상품구매  2. 상품상세 조회 3. 장바구니 확인 4. 장바구니 수정 5. 나가기");
			int selectedMenu = keyboard.nextInt();

			if(selectedMenu == 1){
				
				MainController.getOrderController().requestOrder();
				
			} else if(selectedMenu == 2){
				
				System.out.println("준비중입니다");

			} else if(selectedMenu == 3){

				MainController.getOrderController().requestOrderList();
				
			} else if(selectedMenu == 4){

				MainController.getOrderController().requestUpdateOrder();

			} else if(selectedMenu == 5){

				break;
				
			} else {
				
				System.out.println("잘못입력하셨습니다");
				
			}
			
		}
		
	}

}
