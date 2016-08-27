package shoppingMall.product.controller;

import java.util.ArrayList;

import shoppingMall.mainView.MainAlertView;
import shoppingMall.product.Dao.ProductDao;
import shoppingMall.product.View.ProductDeleteView;
import shoppingMall.product.View.ProductInsertView;
import shoppingMall.product.View.ProductMenuView;
import shoppingMall.product.View.ProductReadView;
import shoppingMall.product.View.ProductSearchView;
import shoppingMall.product.View.ProductSelectOneView;
import shoppingMall.product.vo.Product;

public class ProductController {

	private static ProductDao productDao;

	public ProductController() {

		productDao = new ProductDao();

	}
	
	
	//제품검색
	public void requestSearchProduct() {
		
		//제품 검색뷰 호출
		ProductSearchView productSearchView = new ProductSearchView();
		productSearchView.productSearch();
		
	}
	
	public Product requestSearchProductNumber(int searchProductNumber) {

		//productDao를 통해 productRepository에 데이터 확인
		Product searchProduct = productDao.searchProduct(searchProductNumber);
		
		MainAlertView mainAlertView = new MainAlertView();
		ProductSelectOneView productSelectOneView = new ProductSelectOneView();
		
		if(searchProduct == null) {
			
			mainAlertView.alert("[!]검색하신 상품이 없습니다.");
			
		} else {
			
			mainAlertView.alert("[!]상품을 찾았습니다.");
			
			productSelectOneView.selectOneProduct(searchProduct);
		}
		
		return searchProduct;

	}
	

	//제품등록
	public void requestRegisterProduct() {

		//제품 입력뷰 호출
		ProductInsertView productInsertView = new ProductInsertView();
		Product newProduct = productInsertView.productInsertView();

		//productDao를 통해 productRepository에 데이터를 저장.
		boolean success = productDao.registerProduct(newProduct);

		MainAlertView mainAlertView = new MainAlertView();

		if(success) {

			mainAlertView.alert("[!]정상적으로 등록 되었습니다.");
			requestReadProduct();

		} else {
			mainAlertView.alert("[!]제품 등록에 실패 했습니다.");
		}

	}

	//제품목록 가져오기
	public void requestReadProduct() {

		//productDao를 통해 productRepository에서 데이터 호출
		ArrayList<Product> listAll = productDao.readProduct();

		//productView를 호출
		ProductReadView productReadView = new ProductReadView();
		productReadView.productRead(listAll);

	}

	//삭제할 제품 번호 가져오기
	public void requestGetSelectedProductNumber(int selectedProductNumber) {

		//productDao를 통해 productRepository에 데이터 삭제
		boolean success = productDao.deleteProduct(selectedProductNumber);

		MainAlertView mainAlertView = new MainAlertView();

		if(success == true) {

			mainAlertView.alert("[!]삭제되었습니다.");

		} else {

			mainAlertView.alert("[!]삭제를 실패 하였습니다.");

		}
	}

	//제품목록 삭제
	public void requestDeleteProductView() {

		//제품 목록에서 제품 선택 View
		ProductDeleteView productDeleteView = new ProductDeleteView();
		productDeleteView.productDelete();

	}

	public void requestUpdateProductView() {

		//제품 목록에서 수정할 제품 선택 View


	}

	public void requestProductMenuView() {

		ProductMenuView productMenuView = new ProductMenuView();
		productMenuView.productMenuView();

	}

}
