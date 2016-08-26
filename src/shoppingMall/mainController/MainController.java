package shoppingMall.mainController;

public class MainController {

	// variable
	private static UserController userController;
	private static ProductController productController;
	private static OrderController orderController;
	private static LoginController loginController;
	private static ArticleController articleController;
	private static MainView mainView;
	
	public MainController(){
		
		this.userController = new UserController();
		this.productController = new ProductController();
		this.orderController = new OrderController();
		this.loginController = new LoginController();
		this.articleController = new ArticleController();
		this.mainView = new MainView();
		
	}

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
	
}
