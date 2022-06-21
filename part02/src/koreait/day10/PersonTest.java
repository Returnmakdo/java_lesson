package koreait.day10;

public class PersonTest {

	public static void main(String[] args) {
		Person sinb = new Person();
		String[] blabla = new String[2];
		blabla[0] = "√„";
		blabla[1] = "≥Î∑°";
		sinb.setName("Ω≈∫Ò");
		sinb.setAge(27);
		sinb.setId_code(3.1);
		sinb.setHobbies(blabla);
		System.out.println(sinb.toString());
		
		Person momo = new Person();
		System.out.println(momo);
		
	}

}
