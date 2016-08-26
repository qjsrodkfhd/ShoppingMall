package shoppingMall.product.Dao;

import java.util.ArrayList;

import shoppingMall.product.repository.ProductRepository;
import shoppingMall.product.vo.Product;

public class ProductDao {

	public ProductDao() {

		new ProductRepository();

	}


	//상품등록
	public boolean registerProduct(Product newProduct) {

		boolean success = false;

		if(newProduct == null) {

			return success;

		} else {

			ProductRepository.setProductLastposition(ProductRepository.getProductLastposition() + 1);
			newProduct.setProductNumber(ProductRepository.getProductLastposition());
			ProductRepository.getProducts().add(newProduct);
			success = true;

		}

		return success;

	}


	//상품목록호출	
	public ArrayList<Product> readProduct() {

		ArrayList<Product> listAll = ProductRepository.getProducts();
		return listAll;

<<<<<<< HEAD
	}


	//선택상품 삭제
	public boolean deleteProduct(int selectedProductNumber) {

		boolean success = false;

		try {

			ProductRepository.getProducts().remove(selectedProductNumber);
			success = true;

		} catch ( Exception e ) {
			
		}
		
		return success;

	}
	
	
	//선택상품 호출
	public Product searchProduct(int searchProductNumber) {
		
		Product selectProduct = null;
		
		for(int i = 0 ; i < ProductRepository.getProducts().size() ; i++) {
			if(searchProductNumber == ProductRepository.getProducts().get(i).getProductNumber()) {
				selectProduct = ProductRepository.getProducts().get(i);
			}
		}
		
		return selectProduct;
		
=======
	}


	//선택상품 삭제
	public boolean deleteProduct(int selectedProductNumber) {

		boolean success = false;

		try{

			ProductRepository.getProducts().remove(selectedProductNumber);
			success = true;

		}catch(Exception e ){

			return success;

		}

		return success;

>>>>>>> choiwj1012/master
	}
}
