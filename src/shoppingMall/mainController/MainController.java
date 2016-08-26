package shoppingMall.mainController;

<<<<<<< HEAD
public class MainController {

	// variable
	private static UserController userController;
	private static ProductController productController;
	private static OrderController orderController;
	private static LoginController loginController;
	private static ArticleController articleController;	

	// constructor
	public MainController(){

		userController = new UserController();
		productController = new ProductController();
		orderController = new OrderController();
		loginController = new LoginController();
		articleController = new ArticleController();

	}

	//getter and setter
	public static UserController getUserController() {
		return userController;
	}

	public static ProductController getProductController() {
		return productController;
	}

	public static OrderController getOrderController() {
		return orderController;
	}

	public static LoginController getLoginController() {
		return loginController;
	}

	public static ArticleController getArticleController() {
		return articleController;
	}

=======
<<<<<<< HEAD
import shoppingMall.Login.Controller.LoginController;
import shoppingMall.User.Controller.UserController;
=======
import shoppingMall.mainView.MainView;
>>>>>>> refs/remotes/choiwj1012/master

public class MainController {

	// variable
<<<<<<< HEAD
	 private static UserController userController;
	// private static ProductController productController;
	// private static OrderController orderController;
	 private static LoginController loginController;
=======
	// private static UserController userController;
	// private static ProductController productController;
	// private static OrderController orderController;
	// private static LoginController loginController;
>>>>>>> refs/remotes/choiwj1012/master
	// private static ArticleController articleController;	
	
	// constructor
	public MainController(){
		
<<<<<<< HEAD
		userController = new UserController();
//		productController = new ProductController();
//		orderController = new OrderController();
		loginController = new LoginController();
//		articleController = new ArticleController();
=======
//		this.userController = new UserController();
//		this.productController = new ProductController();
//		this.orderController = new OrderController();
//		this.loginController = new LoginController();
//		this.articleController = new ArticleController();
>>>>>>> refs/remotes/choiwj1012/master
		
	}

	// getter and setter
<<<<<<< HEAD
	public static UserController getUserController() {
		return userController;

	}
=======
//	public static UserController getUserController() {
//		return userController;
//	}
>>>>>>> refs/remotes/choiwj1012/master
//
//	public static ProductController getProductController() {
//		return productController;
//	}
//
//	public static OrderController getOrderController() {
//		return orderController;
//	}
//
<<<<<<< HEAD
	public static LoginController getLoginController() {
		return loginController;
	}
=======
//	public static LoginController getLoginController() {
//		return loginController;
//	}
>>>>>>> refs/remotes/choiwj1012/master
//
//	public static ArticleController getArticleController() {
//		return articleController;
//	}
	
>>>>>>> origin/master
}
