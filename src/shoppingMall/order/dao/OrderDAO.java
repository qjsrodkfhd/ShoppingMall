package shoppingMall.order.dao;

import java.util.ArrayList;

import shoppingMall.order.repository.OrderRepository;
import shoppingMall.order.vo.Order;
import shoppingMall.product.repository.ProductRepository;

public class OrderDAO {
	
	// variable
	OrderRepository orderRepository;
	
	// constructor
	public OrderDAO(){
		
		this.orderRepository = new OrderRepository();
		
	}


	// method
	// 요청 번호 주문 리스트에 넣기
	public boolean order(Order order){

		boolean success = false;
		
		for(int i=0; i<ProductRepository.getProducts().size(); i++){
			if(order.getOrderNumber() == ProductRepository.getProducts().get(i).getProductNumber()){
							
				OrderRepository.getOrderList().get(OrderRepository.getLastOrderNumber()).setOrderNumber(OrderRepository.getLastOrderNumber() + 1);
				OrderRepository.getOrderList().get(OrderRepository.getLastOrderNumber()).setProductNumber(order.getProductNumber());
				OrderRepository.getOrderList().get(OrderRepository.getLastOrderNumber()).setProductName(ProductRepository.getProducts().get(order.getProductNumber()).getProductName());
				OrderRepository.getOrderList().get(OrderRepository.getLastOrderNumber()).setDisplay(ProductRepository.getProducts().get(order.getProductNumber()).getProductBrandName());
				OrderRepository.getOrderList().get(OrderRepository.getLastOrderNumber()).setColor(ProductRepository.getProducts().get(order.getProductNumber()).getProductColor());
				OrderRepository.getOrderList().get(OrderRepository.getLastOrderNumber()).setPrice(ProductRepository.getProducts().get(order.getProductNumber()).getProductPrice());
				OrderRepository.getOrderList().get(OrderRepository.getLastOrderNumber()).setProductCount(order.getProductCount());
				OrderRepository.setLastOrderNumber(OrderRepository.getLastOrderNumber() + 1);
					
				success = true;
				return success;

			}
		}

		return success;
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
				}
				
				OrderRepository.getOrderList().get(i).setProductCount(updateOrder.getProductCount());
				
			}
		}

	}

}
