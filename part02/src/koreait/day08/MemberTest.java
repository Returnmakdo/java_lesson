package koreait.day08;

public class MemberTest {

	public static void main(String[] args) {
		Member mb2 = new Member();
		Member mb = new Member("cldud970@naver.com", "¾ÈÄ¡¿µ");
		System.out.println(mb.getEmail());
		System.out.println(mb.getName());
		mb.setAge(26);
		System.out.println(mb.getAge());
		mb.setLevel(3);
		System.out.println(mb.getLevel());
	}

}
