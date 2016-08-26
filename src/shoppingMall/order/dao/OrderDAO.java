package shoppingMall.order.dao;

import java.util.ArrayList;

import shoppingMall.order.repository.OrderRepository;
import shoppingMall.order.vo.Order;
import shoppingMall.product.repository.ProductRepository;

public class OrderDAO {


	// method
	// 요청 번호 주문 리스트에 넣기
	public boolean order(Order order){

		boolean success = false;
		
		for(int i=0; i<ProductRepository.getProducts().size(); i++){
			if(order.getOrderNumber() == ProductRepository.getProducts().get(i).getProductNumber()){
				
				OrderRepository.setLastOrderNumber(OrderRepository.getLastOrderNumber() + 1);
				OrderRepository.getOrderList().get(i).setOrderNumber(OrderRepository.getLastOrderNumber());
				OrderRepository.getOrderList().get(i).setProductNumber(order.getProductNumber());
				OrderRepository.getOrderList().get(i).setProductName(ProductRepository.getProducts().get(order.getProductNumber()).getProductName());
				OrderRepository.getOrderList().get(i).setDisplay(ProductRepository.getProducts().get(order.getProductNumber()).getProductBrandName());
				OrderRepository.getOrderList().get(i).setColor(ProductRepository.getProducts().get(order.getProductNumber()).getProductColor());
				OrderRepository.getOrderList().get(i).setPrice(ProductRepository.getProducts().get(order.getProductNumber()).getProductPrice());
				OrderRepository.getOrderList().get(i).setProductCount(order.getProductCount());
					
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
