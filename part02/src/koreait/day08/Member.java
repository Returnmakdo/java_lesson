package koreait.day08;
// 작성자 안치영
public class Member {
	private String name;
	private String email;
	private int age;
	private int level;
	
	Member(){
		System.out.println("name, email, age, level 필드는 기본값입니다.");
		System.out.println("name = " + this.name);  // this는 메소드를 실행하는 객체
		System.out.println("age = " + this.age);
	}
	
	public Member(String email, String name){   // 두개를 나누면 : 생성자메소드는 타입과 인자갯수를 가지고 구별이되기때문에 컴파일시 2개가 같은 메소드로인식되서 오류
		this.email = email;
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	public int getLevel() {
		return level;
	}
	
}

