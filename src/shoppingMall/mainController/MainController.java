package shoppingMall.mainController;

import shoppingMall.Login.Controller.LoginController;
import shoppingMall.User.Controller.UserController;
import shoppingMall.mainView.MainView;

public class MainController {

	// variable
	private static UserController userController;
	//private static ProductController productController;
	//private static OrderController orderController;
	private static LoginController loginController;
	//private static ArticleController articleController;	

	// constructor
	public MainController(){

		userController = new UserController();
		//productController = new ProductController();
		//orderController = new OrderController();
		loginController = new LoginController();
		//articleController = new ArticleController();

	}

	// getter and setter
	public static UserController getUserController() {
		return userController;
	}

//	public static ProductController getProductController() {
//		return productController;
//	}
//
//	public static OrderController getOrderController() {
//		return orderController;
//	}

	public static LoginController getLoginController() {
		return loginController;
	}

//	public static ArticleController getArticleController() {
//		return articleController;
//	}

	
	public static void requestMainView(){
		
		MainView mainView = new MainView();
		mainView.mainView();
		
	}
	
	public static void systemExit(){
		
		System.exit(0);
		
	}
	
}