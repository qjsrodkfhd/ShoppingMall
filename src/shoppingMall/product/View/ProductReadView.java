package shoppingMall.product.View;

import java.util.ArrayList;

import shoppingMall.product.vo.Product;

public class ProductReadView {
	
	public void productRead(ArrayList<Product> listAll) {
		
		//상품번호
		
		//상품이름
		
		//상품가격
		
		//상품 브랜드
		
		//상품 색상
		
		System.out.println("상품번호\t상품이름\t상품가격\t상품브랜드\t상품색상");
		
		for(int i = 0 ; i < listAll.size() ; i++) {
			System.out.print(listAll.get(i).getProductNumber() + "\t"); //상품번호
			System.out.print(listAll.get(i).getProductName() + "\t"); //상품이름
			System.out.print(listAll.get(i).getProductPrice() + "\t"); //상품가격
			System.out.print(listAll.get(i).getProductBrandName() + "\t"); //상품 브랜드
			System.out.print(listAll.get(i).getProductColor()); // 상품색상
		}
		
	}

}
