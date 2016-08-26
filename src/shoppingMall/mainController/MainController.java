package shoppingMall.mainController;

<<<<<<< HEAD
import shoppingMall.mainView.MainView;
import shoppingMall.product.controller.ProductController;
=======
import shoppingMall.Login.Controller.LoginController;
import shoppingMall.User.Controller.UserController;
>>>>>>> choiwj1012/master

public class MainController {

	// variable
<<<<<<< HEAD
	// private static UserController userController;
	 private static ProductController productController;
	// private static OrderController orderController;
	// private static LoginController loginController;
	// private static ArticleController articleController;	
	
=======
	private static UserController userController;
	//private static ProductController productController;
	//private static OrderController orderController;
	private static LoginController loginController;
	//private static ArticleController articleController;	

>>>>>>> choiwj1012/master
	// constructor
	public MainController(){

		userController = new UserController();
		//productController = new ProductController();
		//orderController = new OrderController();
		loginController = new LoginController();
		//articleController = new ArticleController();

	}

	// getter and setter
<<<<<<< HEAD
//	public static UserController getUserController() {
//		return userController;
//	}
//
	public static ProductController getProductController() {
		return productController;
	}
=======
	public static UserController getUserController() {
		return userController;
	}

//	public static ProductController getProductController() {
//		return productController;
//	}
>>>>>>> choiwj1012/master
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

}