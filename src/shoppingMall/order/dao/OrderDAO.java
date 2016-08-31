package shoppingMall.order.dao;

import java.util.ArrayList;

import shoppingMall.order.repository.OrderRepository;
import shoppingMall.order.vo.Order;
import shoppingMall.product.vo.Product;

public class OrderDAO {
	
	// variable
	OrderRepository orderRepository;
	
	// constructor
	public OrderDAO(){
		
		this.orderRepository = new OrderRepository();
		
	}


	// method
	// 요청 번호 주문 리스트에 넣기
	public boolean order(Order selectedOrder){

		boolean success = false;
		
		int orderNumber = OrderRepository.getLastOrderNumber();
		orderNumber = orderNumber + 1;
		
		OrderRepository.setLastOrderNumber(orderNumber);
		selectedOrder.setOrderNumber(orderNumber);
		
		ArrayList<Order> selectedOrderProduct = OrderRepository.getOrderList();
		selectedOrderProduct.add(selectedOrder);
		
		success = true;
		
		return success;
	}

	
	// 선택 주문한 상품이 존재하는지 확인
	public boolean checkOrderProduct(Order selectedOrder, ArrayList<Product> allProductList){
		
		boolean isFind = false;
		
		for(int i = 0; i<allProductList.size(); i++){
			if(selectedOrder.getProductNumber() == allProductList.get(i).getProductNumber()){
				
				isFind = true;
				return isFind;
				
			}
		}
		
		return isFind;
		
	}
	
	
	// 선택한 상품이 장바구니에 이미 존재하는지 확인
	public boolean checkOrderProductInCart(Order selectedOrder){
		
		boolean isFindInOrder = false;
		
		for(int i=0; i<OrderRepository.getOrderList().size(); i++){
			
			if(selectedOrder.getProductNumber() == OrderRepository.getOrderList().get(i).getProductNumber()){
				
				OrderRepository.getOrderList().get(i).setProductCount(selectedOrder.getProductCount());
				isFindInOrder = true;
				return isFindInOrder;
				
			}
			
		}
		
		return isFindInOrder;
		
	}
	
	
	// 주문 리스트 전체 요청
	public ArrayList<Order> selectAll(){

		ArrayList<Order> orders = OrderRepository.getOrderList();
		
		return orders;
		
	}

	
	// 주문 리스트 수정 요청
	public void updateOrder(Order updateOrder){

		for(int i=0; i<OrderRepository.getOrderList().size(); i++){
			if(updateOrder.getOrderNumber() == OrderRepository.getOrderList().get(i).getOrderNumber()){
			
				if(updateOrder.getProductCount() == -1){
					OrderRepository.getOrderList().remove(i);
					return;
				}
				
				OrderRepository.getOrderList().get(i).setProductCount(updateOrder.getProductCount());
				
			}
		}

	}

}
