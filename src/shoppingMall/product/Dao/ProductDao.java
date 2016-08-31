package shoppingMall.product.Dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
<<<<<<< HEAD
<<<<<<< HEAD
=======
import java.util.StringTokenizer;
<<<<<<< HEAD
>>>>>>> parent of 86c1990... update login
=======
import java.util.StringTokenizer;
>>>>>>> parent of 93f7781... Revert "update fileio Order and Product"

import shoppingMall.product.repository.ProductRepository;
=======
<<<<<<< HEAD

=======
>>>>>>> refs/remotes/origin/master
>>>>>>> refs/remotes/origin/pr/16
import shoppingMall.product.vo.Product;

public class ProductDao {

<<<<<<< HEAD
<<<<<<< HEAD
	public ProductDao() {

		new ProductRepository();
=======
	private File file;

	public ProductDao() {

		file = new File("product.txt");

		try{

			boolean newFile = file.createNewFile();

=======
	private File file;
	
	public ProductDao() {

		file = new File("product.txt");
		
		try{
			
			boolean newFile = file.createNewFile();
			
>>>>>>> parent of 93f7781... Revert "update fileio Order and Product"
			if(newFile){
				System.out.println("파일생성");
			} else {
				System.out.println("파일존재");
			}
<<<<<<< HEAD

=======
			
>>>>>>> parent of 93f7781... Revert "update fileio Order and Product"
		} catch (IOException e) {
			System.out.println("실패");
			e.printStackTrace();
		}
<<<<<<< HEAD
>>>>>>> refs/remotes/origin/pr/16
=======
>>>>>>> parent of 93f7781... Revert "update fileio Order and Product"

	}


	// 상품등록
	public boolean registerProduct(Product newProduct) {

		boolean success = false;

<<<<<<< HEAD
<<<<<<< HEAD
		if(newProduct == null) {

			return success;
=======
		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;

		try{

			fileWriter = new FileWriter(file,true);
			bufferedWriter = new BufferedWriter(fileWriter);

			int productNumber = productLastPosition() + 1;
			newProduct.setProductNumber(productNumber);

=======
		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;
		
		try{
			
			fileWriter = new FileWriter(file);
			bufferedWriter = new BufferedWriter(fileWriter);
			
			int productNumber = productLastPosition() + 1;
			newProduct.setProductNumber(productNumber);
			
>>>>>>> parent of 93f7781... Revert "update fileio Order and Product"
			bufferedWriter.write(newProduct.getProductNumber() + ",");
			bufferedWriter.write(newProduct.getProductName() + ",");
			bufferedWriter.write(newProduct.getProductPrice() + ",");
			bufferedWriter.write(newProduct.getProductBrandName() + ",");
			bufferedWriter.write(newProduct.getProductColor() + "\r\n");
<<<<<<< HEAD
>>>>>>> refs/remotes/origin/pr/16

		} else {
=======
>>>>>>> parent of 93f7781... Revert "update fileio Order and Product"

			success = true;

<<<<<<< HEAD
<<<<<<< HEAD
=======
			return success;

=======
			return success;
	
>>>>>>> parent of 93f7781... Revert "update fileio Order and Product"
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
<<<<<<< HEAD

			try{

				bufferedWriter.close();
				fileWriter.close();

			} catch(IOException e){

				e.printStackTrace();

			}

>>>>>>> refs/remotes/origin/pr/16
=======
			
			try{
				
				bufferedWriter.close();
				fileWriter.close();
				
			} catch(IOException e){
				
				e.printStackTrace();
				
			}
			
>>>>>>> parent of 93f7781... Revert "update fileio Order and Product"
		}
		
		return success;

	}


	// 상품전체목록 가져오기
	public ArrayList<Product> productAll() {

<<<<<<< HEAD
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
<<<<<<< HEAD

				StringTokenizer stringTokenizer = new StringTokenizer(productString, ",");

				while(stringTokenizer.hasMoreTokens()){
					int number = Integer.parseInt(stringTokenizer.nextToken());
					String productName = stringTokenizer.nextToken();
					int productPrice = Integer.parseInt(stringTokenizer.nextToken());
					String productBrandName = stringTokenizer.nextToken();
					String productColor = stringTokenizer.nextToken();

					Product product = new Product(number,productName,productPrice,productBrandName,productColor);
					listAll.add(product);
				}	

=======
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
>>>>>>> parent of 93f7781... Revert "update fileio Order and Product"
				
				StringTokenizer stringTokenizer = new StringTokenizer(productString, ",");
				
			
<<<<<<< HEAD
>>>>>>> refs/remotes/origin/master
			}

=======
			}
			
>>>>>>> parent of 93f7781... Revert "update fileio Order and Product"
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
<<<<<<< HEAD

=======
			
>>>>>>> parent of 93f7781... Revert "update fileio Order and Product"
			try{
				bufferedReader.close();
				fileReader.close();
			}catch(IOException e){
				e.printStackTrace();
			}
<<<<<<< HEAD

		}
<<<<<<< HEAD
			
>>>>>>> parent of 86c1990... update login
=======

>>>>>>> refs/remotes/origin/pr/16
=======
			
		}
			
>>>>>>> parent of 93f7781... Revert "update fileio Order and Product"
		return listAll;

	} 


<<<<<<< HEAD
	// 선택상품찾기
	public Product searchProduct(int searchProductNumber) {

		Product selectProduct = null;

		for(int i = 0 ; i < ProductRepository.getProducts().size() ; i++) {
			if(searchProductNumber == ProductRepository.getProducts().get(i).getProductNumber()) {
				selectProduct = ProductRepository.getProducts().get(i);
			}
		}

		return selectProduct;
=======
<<<<<<< HEAD
	// 선택상품찾기
	public Product searchProduct(int searchProductNumber) {

		Product product = null;
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;

		try{

			File file = new File("product.txt");
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);

			while(true){
				String productString = bufferedReader.readLine();

				if(productString == null){
					break;
				}

				StringTokenizer stringTokenizer = new StringTokenizer(productString, ",");

				if(stringTokenizer.hasMoreTokens()){
					int number = Integer.parseInt(stringTokenizer.nextToken());

					if(searchProductNumber == number){
						product = new Product();

						product.setProductNumber(number);
						String productName = stringTokenizer.nextToken();
						product.setProductName(productName);
						int productPrice = Integer.parseInt(stringTokenizer.nextToken());
						product.setProductPrice(productPrice);
						String productBrandName = stringTokenizer.nextToken();
						product.setProductBrandName(productBrandName);
						String productColor = stringTokenizer.nextToken();
						product.setProductColor(productColor);

						break;
					}
				}
			}

		}catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				bufferedReader.close();
				fileReader.close();

			} catch (IOException e) {

			}
		}		

		return product;
>>>>>>> refs/remotes/origin/pr/16

	}


	// 선택상품 수정
	public boolean updateProduct(int selectedProductNumber, Product updateProduct){

		boolean success = false;

<<<<<<< HEAD
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
<<<<<<< HEAD
=======
		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;
		ArrayList<Product> products = productAll();

		for(int i =0; i<products.size(); i++){
			if(selectedProductNumber == products.get(i).getProductNumber()){
			
				
			
				products.get(i).setProductName(updateProduct.getProductBrandName());
				products.get(i).setProductPrice(updateProduct.getProductPrice());
				products.get(i).setProductBrandName(updateProduct.getProductBrandName());
				products.get(i).setProductColor(updateProduct.getProductColor());
				
				success = true;
				
			}
		}

		this.productToFile(products);
		return success;

		}


		//선택상품 삭제
		public boolean deleteProduct(int selectedProductNumber) {

			boolean success = false;
			ArrayList<Product> products = productAll();

	
				for(int i=0; i<products.size(); i++){
					if( selectedProductNumber== products.get(i).getProductNumber()){

						products.remove(i);
						success = true;
						break;

					}
				}

				this.productToFile(products);

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
=======
//	// 선택상품찾기
//	public Product searchProduct(int searchProductNumber) {
//
//		Product selectProduct = null;
//
//		for(int i = 0 ; i < ProductRepository.getProducts().size() ; i++) {
//			if(searchProductNumber == ProductRepository.getProducts().get(i).getProductNumber()) {
//				selectProduct = ProductRepository.getProducts().get(i);
//			}
//		}
//
//		return selectProduct;
//
//	}
//
//
//	// 선택상품 수정
//	public boolean updateProduct(int selectedProductNumber, Product updateProduct){
//
//		boolean success = false;
//
//		for(int i=0; i<ProductRepository.getProducts().size(); i++){
//			if(selectedProductNumber == ProductRepository.getProducts().get(i).getProductNumber()){
//
//				if(updateProduct.getProductName() != null){
//					ProductRepository.getProducts().get(i).setProductName(updateProduct.getProductName());
//					success = true;
//				}
//
//				if(updateProduct.getProductPrice() != 0){
//					ProductRepository.getProducts().get(i).setProductPrice(updateProduct.getProductPrice());
//					success = true;
//				}
//
//				if(updateProduct.getProductBrandName() != null){
//					ProductRepository.getProducts().get(i).setProductBrandName(updateProduct.getProductBrandName());	
//					success = true;
//				}
//
//				if(updateProduct.getProductColor() != null){
//					ProductRepository.getProducts().get(i).setProductColor(updateProduct.getProductColor());
//					success = true;
//				}		
//
//			}
//
//		}
//
//
//		return success;
//
//	}
//
//
//	//선택상품 삭제
//	public boolean deleteProduct(int selectedProductNumber) {
//
//		boolean success = false;
//
//		try{
//			for(int i=0; i<ProductRepository.getProducts().size(); i++){
//				if(selectedProductNumber == ProductRepository.getProducts().get(i).getProductNumber()){
//					
//					ProductRepository.getProducts().remove(i);
//					
//				}
//			}
//			
//			success = true;
//
//		}catch(Exception e){
//
//			return success;
//
//		}
//
//		return success;
//
//	}
>>>>>>> refs/remotes/origin/pr/16
=======
>>>>>>> parent of 93f7781... Revert "update fileio Order and Product"
	
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
<<<<<<< HEAD
<<<<<<< HEAD
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

=======
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
		
>>>>>>> parent of 93f7781... Revert "update fileio Order and Product"
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

=======
>>>>>>> refs/remotes/origin/master
				}

			}

			return lastProductNumber;

		}

		private void productToFile(ArrayList<Product> products) {

			FileWriter fileWriter = null;
			BufferedWriter bufferedWriter = null;

			try {
				File file = new File("product.txt");
				fileWriter = new FileWriter(file);
				bufferedWriter = new BufferedWriter(fileWriter);

				for(int i = 0 ; i < products.size() ; i++) {
					bufferedWriter.write(products.get(i).getProductNumber()+ ",");
					bufferedWriter.write(products.get(i).getProductName()+ ",");
					bufferedWriter.write(products.get(i).getProductPrice() + ",");
					bufferedWriter.write(products.get(i).getProductBrandName() + ",");
					bufferedWriter.write(products.get(i).getProductColor() + "\r\n");
					
				}

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					bufferedWriter.close();
					fileWriter.close();
				} catch(IOException e) {}
			}

		}
	
		
>>>>>>> refs/remotes/origin/pr/16
	}
