package shoppingMall.order.controller;

import java.util.ArrayList;

import shoppingMall.mainView.MainAlertView;
import shoppingMall.order.dao.OrderDAO;
import shoppingMall.order.view.OrderListView;
import shoppingMall.order.view.SelectProductNumber;
import shoppingMall.order.view.UpdateOrderView;
import shoppingMall.order.vo.Order;

public class OrderController {

	// variable
	OrderDAO orderDAO;

	// constructor
	public OrderController(){

		this.orderDAO = new OrderDAO();

	}

	// method
	// 주문 요청
	public void requestOrder(){

		SelectProductNumber selectProductNumber = new SelectProductNumber(); 
		Order selectedOrder = selectProductNumber.selectProductNumber();

		boolean success = orderDAO.order(selectedOrder);
		MainAlertView alertView = new MainAlertView();

		if(success){

			alertView.alert("상품이 성공적으로 장바구니에 담겨졌습니다");

		} else {

			alertView.alert("상품이 장바구니에 담겨지지 않았습니다");

		}

	}


	// 주문 리스트 요청
	public void requestOrderList(){

		ArrayList<Order> allOrderList = orderDAO.selectAll();
			
		OrderListView orderListView = new OrderListView();
		orderListView.orderListView(allOrderList);

	}


	// 주문 리스트 수정 요청
	public void requestUpdateOrder(){
		
		UpdateOrderView orderUpdateView = new UpdateOrderView();
		Order updateOrder = orderUpdateView.orderUpdate();
		orderDAO.updateOrder(updateOrder);
		
	}

}
