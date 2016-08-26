package shoppingMall.product.Dao;

import java.util.ArrayList;

import shoppingMall.product.repository.ProductRepository;
import shoppingMall.product.vo.Product;

public class ProductDao {
	
	public ProductDao() {
		
		new ProductRepository();
		
	}
	
	public void registerProduct(Product newProduct) {
		
		//상품등록
		ProductRepository.setProductLastposition(ProductRepository.getProductLastposition() + 1);
		ProductRepository.getProducts().add(newProduct);
	
	}
	
	public ArrayList<Product> readProduct() {
		
		//상품목록호출
		ArrayList<Product> listAll = ProductRepository.getProducts();
		return listAll;
		
	}
	
}
