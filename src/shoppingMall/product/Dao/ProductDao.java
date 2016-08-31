package shoppingMall.product.Dao;

import java.util.ArrayList;

import shoppingMall.product.repository.ProductRepository;
import shoppingMall.product.vo.Product;

public class ProductDao {

	public ProductDao() {

		new ProductRepository();

	}


	// 상품등록
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


	// 상품전체목록 가져오기
	public ArrayList<Product> readProduct() {

		ArrayList<Product> listAll = ProductRepository.getProducts();
		return listAll;

	} 


	// 선택상품찾기
	public Product searchProduct(int searchProductNumber) {

		Product selectProduct = null;

		for(int i = 0 ; i < ProductRepository.getProducts().size() ; i++) {
			if(searchProductNumber == ProductRepository.getProducts().get(i).getProductNumber()) {
				selectProduct = ProductRepository.getProducts().get(i);
			}
		}

		return selectProduct;

	}


	// 선택상품 수정
	public boolean updateProduct(int selectedProductNumber, Product updateProduct){

		boolean success = false;

		for(int i=0; i<ProductRepository.getProducts().size(); i++){
			if(selectedProductNumber == ProductRepository.getProducts().get(i).getProductNumber()){

				if(updateProduct.getProductName() != null){
					ProductRepository.getProducts().get(i).setProductName(updateProduct.getProductName());
					success = true;
				}

				if(updateProduct.getProductPrice() != 0){
					ProductRepository.getProducts().get(i).setProductPrice(updateProduct.getProductPrice());
					success = true;
				}

				if(updateProduct.getProductBrandName() != null){
					ProductRepository.getProducts().get(i).setProductBrandName(updateProduct.getProductBrandName());	
					success = true;
				}

				if(updateProduct.getProductColor() != null){
					ProductRepository.getProducts().get(i).setProductColor(updateProduct.getProductColor());
					success = true;
				}		

			}

		}


		return success;

	}


	//선택상품 삭제
	public boolean deleteProduct(int selectedProductNumber) {

		boolean success = false;

		try{
			for(int i=0; i<ProductRepository.getProducts().size(); i++){
				if(selectedProductNumber == ProductRepository.getProducts().get(i).getProductNumber()){
					
					ProductRepository.getProducts().remove(i);
					
				}
			}
			
			success = true;

		}catch(Exception e){

			return success;

		}

		return success;

	}

}
