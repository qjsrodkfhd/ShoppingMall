package shoppingMall.order.vo;

public class Order {

	// variable
	// 주문 번호
	private int orderNumber;
	
	// 주문한 상품명
	private String productName;
	
	// 주문한 상품브랜드
	private String display;
	
	// 주문한 상품색상
	private String color;
	
	// 주문한 상품 가격
	private int price;
	
	// 주문한 상품번호
	private int productNumber;
	
	// 주문한 상품수량
	private int productCount;
	
	// constructor
	public Order(){
		
		this.productCount = 1;
		
	}

	// getter and setter
	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public int getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(int productNumber) {
		this.productNumber = productNumber;
	}

	public int getProductCount() {
		return productCount;
	}

	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
		
}
