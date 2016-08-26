package shoppingMall.main;

import shoppingMall.mainController.MainController;
import shoppingMall.product.View.ProductInsertView;

public class Main {
	
	public static void main(String[] args) {
		
		new MainController();

		MainController.requestMainView();
		
	}
	
}
