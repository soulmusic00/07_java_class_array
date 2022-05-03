package step7_01.classArray;

class Product {
	
	String name;
	int price;
	
}

public class ClassArrayEx01 {

	public static void main(String[] args) {

		// 클래스 배열 생성 형식
		// 클래스명[] 변수명 = new 클래스명[배열의크기];
		
		Product[] productList = new Product[3];
		
		productList[0] = new Product();	// arr[0] = 10;
		productList[1] = new Product(); // arr[1] = 20;
		
		Product product= new Product(); // int data = 30;
		productList[2] = product;		// arr[2] = data;
		
		
		productList[0].name = "기계식키보드";
		productList[0].price = 45000;
		
		productList[1].name = "무소음마우스";
		productList[1].price = 27000;
		
		productList[2].name = "장패드";
		productList[2].price = 10000;
		
		// 엘리먼트 순회
		for (int i = 0; i < productList.length; i++) {
			System.out.println("name : " + productList[i].name);
			System.out.println("price : " + productList[i].price);
			System.out.println();
		}
		
		// [응용] 생각해보기
		Product[] temp1 = productList;			// [주소] or 값
		Product temp2   = productList[1];		// [주소] or 값
		String temp3    = productList[0].name;	// 주소 or [값]
		int temp4       = productList[0].price;	// 주소 or [값]
		
		Product temp = productList[2];
		System.out.println("temp : " + temp);
		System.out.println("productList[2] : " + productList[2]);
		
		System.out.println("temp.name : " + temp.name);
		System.out.println("productList[2].name : " + productList[2].name);
		
		temp.name = "장패드1";
		System.out.println("temp.name : " + temp.name);
		System.out.println("productList[2].name : " + productList[2].name);
		
		productList[2].name = "장패드2";
		System.out.println("temp.name : " + temp.name);
		System.out.println("productList[2].name : " + productList[2].name);
		
		
	}

}
