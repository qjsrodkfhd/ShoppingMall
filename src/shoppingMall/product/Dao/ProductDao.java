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
		
	}
	
	
	//선택상품 삭제
	public boolean deleteProduct(int selectedProductNumber) {
		
		boolean success = false;
		
<<<<<<< HEAD
			try {
=======
			try{
>>>>>>> choiwj1012/master
				
				ProductRepository.getProducts().remove(selectedProductNumber);
				success = true;
				
<<<<<<< HEAD
			} catch(Exception e ) {
=======
			}catch(Exception e ){
>>>>>>> choiwj1012/master
				
				return success;
				
			}
			
		return success;
		
	}
}
