package shoppingMall.product.Dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

import shoppingMall.product.repository.ProductRepository;
import shoppingMall.product.vo.Product;

public class ProductDao {

	private File file;
	
	public ProductDao() {

		file = new File("product.txt");
		
		try{
			
			boolean newFile = file.createNewFile();
			
			if(newFile){
				System.out.println("파일생성");
			} else {
				System.out.println("파일존재");
			}
			
		} catch (IOException e) {
			System.out.println("실패");
			e.printStackTrace();
		}

	}


	// 상품등록
	public boolean registerProduct(Product newProduct) {

		boolean success = false;

		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;
		
		try{
			
			fileWriter = new FileWriter(file);
			bufferedWriter = new BufferedWriter(fileWriter);
			
			int productNumber = productLastPosition() + 1;
			newProduct.setProductNumber(productNumber);
			
			bufferedWriter.write(newProduct.getProductNumber() + ",");
			bufferedWriter.write(newProduct.getProductName() + ",");
			bufferedWriter.write(newProduct.getProductPrice() + ",");
			bufferedWriter.write(newProduct.getProductBrandName() + ",");
			bufferedWriter.write(newProduct.getProductColor() + "\r\n");

			success = true;

			return success;
	
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			
			try{
				
				bufferedWriter.close();
				fileWriter.close();
				
			} catch(IOException e){
				
				e.printStackTrace();
				
			}
			
		}
		
		return success;

	}


	// 상품전체목록 가져오기
	public ArrayList<Product> readProduct() {

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
				}
				
				StringTokenizer stringTokenizer = new StringTokenizer(productString, ",");
				
				if(stringTokenizer.hasMoreTokens()){
					lastProductNumber = Integer.parseInt(stringTokenizer.nextToken());
					stringTokenizer.nextToken();
					stringTokenizer.nextToken();
					stringTokenizer.nextToken();
					stringTokenizer.nextToken();
				}	
				
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
		
		return lastProductNumber;
		
	}

}
