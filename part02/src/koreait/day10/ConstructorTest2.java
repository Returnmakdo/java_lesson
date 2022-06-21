package koreait.day10;

public class ConstructorTest2 {

	public static void main(String[] args) {
		
	}

}

class Product2{
	int price;
	
	//부모 클래스의 디폴트 생성자 정의해서 자식클래스가 사용할 수 있도록한다.
	public Product2(){
		
	}
	
	public Product2(int price) {
		this.price = price;
	}
}

class Food2 extends Product2{            
	//부모 클래스 Product2 디폴트 생성자(super())가 호출
	// Food2 디폴트 생성자는 자동으로 동작

}

class Electronics2 extends Product2{
	
	public Electronics2(int price) {
		super(price);  // 부모 클래스커스텀생성자 실행
	}
}



