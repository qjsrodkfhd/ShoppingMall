package shoppingMall.order.view;

import java.util.ArrayList;

import shoppingMall.order.vo.Order;


public class OrderListView {

	
	public void orderListView(ArrayList<Order> allOrderList){
		
		System.out.println("장바구니 상품목록 입니다");
		System.out.println("주문번호\t상품명\t상품브랜드\t상품색상\t상품가격\t상품수량");
		
		for(int i=0; i<allOrderList.size(); i++){
			
			// 주문번호
			System.out.println(allOrderList.get(i).getOrderNumber());
			
			// 상품명
			System.out.println(allOrderList.get(i).getProductName());
			
			// 상품브랜드
			System.out.println(allOrderList.get(i).getDisplay());
			
			// 상품색상
			System.out.println(allOrderList.get(i).getColor());
			
			// 상품가격
			System.out.println(allOrderList.get(i).getPrice());
			
			// 상품수량
			System.out.println(allOrderList.get(i).getProductCount());
			
		}
		
		
	}
	
}
