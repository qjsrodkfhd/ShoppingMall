package shoppingMall.product.Dao;

import java.util.ArrayList;
<<<<<<< HEAD
=======
import java.util.StringTokenizer;
>>>>>>> parent of 86c1990... update login

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

<<<<<<< HEAD
		ArrayList<Product> listAll = ProductRepository.getProducts();
=======
		ArrayList<Product> listAll = new ArrayList<Product>();
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		
		try{
			
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			
			while(true){
				
				String productString = bufferedReader.readLine();
				
				if(productString == null){
					break;
				}
				
				StringTokenizer stringTokenizer = new StringTokenizer(productString, ",");
				
			
			}
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			
			try{
				bufferedReader.close();
				fileReader.close();
			}catch(IOException e){
				e.printStackTrace();
			}
			
		}
			
>>>>>>> parent of 86c1990... update login
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
<<<<<<< HEAD
=======
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
	
	public int productLastPosition(){
		
		int lastProductNumber = 0;
		
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		
		try{
			
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			
			while(true){
				
				String productString = bufferedReader.readLine();
				
				if(productString == null){
					break;
>>>>>>> parent of 86c1990... update login
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
