package shoppingMall.main;

import shoppingMall.mainView.MainView;
import shoppingMall.product.View.ProductInsertView;

public class Main {
	
	public static void main(String[] args) {
		
		MainView mainView = new MainView();
		mainView.mainView();
		
		ProductInsertView piv = new ProductInsertView();
		piv.productInsertView();
		
	}
	
}
