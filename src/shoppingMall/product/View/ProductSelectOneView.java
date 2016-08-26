package shoppingMall.product.View;

import shoppingMall.product.vo.Product;

public class ProductSelectOneView {

	public void selectOneProduct(Product searchProduct) {

		System.out.println("---------------------------------------");
		System.out.println("상품번호\t상품이름\t상품가격\t상품브랜드\t상품색상");

		System.out.print(listAll.get(i).getProductNumber() + "\t"); //상품 번호
		System.out.print(listAll.get(i).getProductName() + "\t"); //상품 이름
		System.out.print(listAll.get(i).getProductPrice() + "\t"); //상품 가격
		System.out.print(listAll.get(i).getProductBrandName() + "\t"); //상품 브랜드
		System.out.println(listAll.get(i).getProductColor()); // 상품 색상
		
		System.out.println("---------------------------------------");
	}

}
