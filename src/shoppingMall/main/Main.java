package shoppingMall.main;

import shoppingMall.mainController.MainController;
import shoppingMall.mainView.MainView;
import shoppingMall.product.View.ProductInsertView;

public class Main {
	
	public static void main(String[] args) {
		
		new MainController();

		MainController.requestMainView();
		
		ProductInsertView piv = new ProductInsertView();
		piv.productInsertView();
		
	}
	
}
