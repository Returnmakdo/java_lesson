package koreait.day08;
// �ۼ��� ��ġ��
public class Member {
	private String name;
	private String email;
	private int age;
	private int level;
	
	Member(){
		System.out.println("name, email, age, level �ʵ�� �⺻���Դϴ�.");
		System.out.println("name = " + this.name);  // this�� �޼ҵ带 �����ϴ� ��ü
		System.out.println("age = " + this.age);
	}
	
	public Member(String email, String name){   // �ΰ��� ������ : �����ڸ޼ҵ�� Ÿ�԰� ���ڰ����� ������ �����̵Ǳ⶧���� �����Ͻ� 2���� ���� �޼ҵ���νĵǼ� ����
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

