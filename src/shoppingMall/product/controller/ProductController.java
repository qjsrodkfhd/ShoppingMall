package shoppingMall.product.controller;

import java.util.ArrayList;

import shoppingMall.product.Dao.ProductDao;
import shoppingMall.product.View.ProductDeleteView;
import shoppingMall.product.View.ProductInsertView;
import shoppingMall.product.View.ProductReadView;
import shoppingMall.product.vo.Product;

public class ProductController {

	private static ProductDao productDao;

	public ProductController() {

		productDao = new ProductDao();

	}

	//제품등록
	public void requestRegisterProduct() {

		//제품 입력뷰 호출
		ProductInsertView productInsertView = new ProductInsertView();
		Product newProduct = productInsertView.productInsertView();
		
		//productDao를 통해 productRepository에 데이터를 저장.
		productDao.registerProduct(newProduct);

	}
	
	//제품목록 가져오기
	public void requestReadProduct() {
		
		//productDao를 통해 productRepository에서 데이터 호출
		ArrayList<Product> listAll = productDao.readProduct();
		
		//productView를 호출
		ProductReadView productReadView = new ProductReadView();
		productReadView.productRead(listAll);
		
	}
	
	//제품목록 삭제
	public void requestDeleteProduct() {
		
		//제품 목록에서 제품 선택
		ProductDeleteView productDeleteView = new ProductDeleteView();
		productDeleteView.productDelete();
		
		
		
		//productDao를 통해 productRepository에서 데이터 삭제
		 
		
	}

}
