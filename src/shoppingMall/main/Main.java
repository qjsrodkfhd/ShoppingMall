package shoppingMall.main;

import shoppingMall.mainController.MainController;
import shoppingMall.mainView.MainView;
import shoppingMall.product.View.ProductInsertView;

public class Main {
	
	public static void main(String[] args) {
		
		new MainController();

	
		MainView mainView = new MainView();
		mainView.mainView();
		
		ProductInsertView piv = new ProductInsertView();
		piv.productInsertView();
		
	}
	
}
