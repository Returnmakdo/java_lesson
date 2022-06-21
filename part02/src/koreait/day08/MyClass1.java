package koreait.day08;

public class MyClass1 {
	private int age;     // 자바의 특성 : 은닉성(기밀성)은 클래스의 필드값을 다른 클래스에 직접 접근하지 못하도록 한다
	String name;
	public double point;
	
	// private 필드는 setter,getter 가 있어야 다른클래스에서 접근 할 수 있다.
	void setAge(int age) {
		if(age > 1 && age <= 150)  // age필드값의 검사
		this.age = age;            // age필드는 현재 클래스에서만 접근
		else
			System.out.println("잘못된 값입니다.");
	}
	
	int getAge() {
		return age;
	}
}


/*
 *  private int age;			//private  : 다른 클래스에서 사용 못합니다. 나(현재 클래스)만 사용한다.
	String name;				//default(package)  : 다른 패키지에서 사용 못합니다. 이웃이면 같이쓰자.
	public double point;			//public   : 어디서나 사용합니다.공공의,공용의... 다같이 쓰자.

 *  private , default, protected(상속), public은 
 *  변수(필드),메소드,생성자, 클래스 등에 사용되는 접근한정자 입니다.(클래스는 접근한정자 default,public 만 사용합니다.)
 */
