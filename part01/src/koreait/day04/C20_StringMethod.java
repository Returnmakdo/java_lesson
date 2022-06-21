package koreait.day04;

public class C20_StringMethod {
	public static void main(String[] args) {
		
		String message = "hello~";  // java.lang.String (기본패키지 클래스)
		
		// 리턴값 형식은?
		int len = message.length();
		char temp = message.charAt(3);  // 0부터 시작해서3 번문자가 무엇인지 리턴.
		boolean isState = message.equals("Hello~");
		
		int index = message.indexOf('e');        // int
		int index2 = message.indexOf("lo");
		String ss = message.substring(2);        // String
		String ss2 = message.substring(2, 4);
		String rp = message.replaceAll("ll", "*@"); // String
// 메소드 오버로딩(overloading) : 메소드 이름과 리턴형식은 같고 인자값의 갯수와 형식이 다르게 정의된 것.
		   // ㄴ 위에서 indexOf의 인자 값의 형식의 차이 / substring의 갯수 다른 것
		
		System.out.println("length() = " + len);
		System.out.println("charAt(3) = " + temp);
		System.out.println("equals(\"Hello\") = " + isState);
		
		System.out.println("indexOf('e') = " + index);
		System.out.println("indexOf(\"lo\") = " + index2);
		System.out.println("indexOf(\"lo\") = " + message.indexOf("ol"));
		
		String test = "hello~hello";		
		System.out.println("temp.indexOf(\"lo\") = " + test.indexOf("lo"));
		System.out.println("temp.lastIndexOf(\"lo\") = " + test.lastIndexOf("lo"));
		
		System.out.println("substring(2) = " + ss);
		System.out.println("substring(2, 4) = " + ss2);
		System.out.println("replaeAll(\"ll\", \"*@\") = " + rp);
		System.out.println("startWith(\"H\")" + message.startsWith("H"));
		System.out.println("endWith(\"~\")" + message.endsWith("~"));
	}
	
}
//String 클래스의 메소드는 많다. 다 외우고 사용하는 것이 아니고 메소드의 이름, 인자, 리턴형식을 참조해서 사용.
//message.length();        //public int length() : 길이
//message.charAt(0);       //public char charAt(int index)

//message.equals("Hello~");//public boolean equals(Object anObject), Object는 모든 타입
					     //message 가 String 타입이므로 Object는 String으로 해석
