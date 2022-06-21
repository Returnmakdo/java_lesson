package koreait.day13a;

// 객체의 비교 두번째 방법 : 비교할 수 있는 타입으로 만들기
public class User implements Comparable<User>{
	private String name;
	private int age;
	
	public User(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	// Comparable 인터페이스 추상메소드 구현
	@Override
	public int compareTo(User o) {  // 현재 객체의 age와 인자값 age 비교
		Integer o1 = this.age;            //this. 이 compare 앞에있어야 한다.
		Integer o2 = o.getAge();
		return o1.compareTo(o2);
	}
	
	// Object 클래스 toString() 재정의
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}
