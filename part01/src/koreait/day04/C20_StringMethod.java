package koreait.day04;

public class C20_StringMethod {
	public static void main(String[] args) {
		
		String message = "hello~";  // java.lang.String (�⺻��Ű�� Ŭ����)
		
		// ���ϰ� ������?
		int len = message.length();
		char temp = message.charAt(3);  // 0���� �����ؼ�3 �����ڰ� �������� ����.
		boolean isState = message.equals("Hello~");
		
		int index = message.indexOf('e');        // int
		int index2 = message.indexOf("lo");
		String ss = message.substring(2);        // String
		String ss2 = message.substring(2, 4);
		String rp = message.replaceAll("ll", "*@"); // String
// �޼ҵ� �����ε�(overloading) : �޼ҵ� �̸��� ���������� ���� ���ڰ��� ������ ������ �ٸ��� ���ǵ� ��.
		   // �� ������ indexOf�� ���� ���� ������ ���� / substring�� ���� �ٸ� ��
		
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
//String Ŭ������ �޼ҵ�� ����. �� �ܿ�� ����ϴ� ���� �ƴϰ� �޼ҵ��� �̸�, ����, ���������� �����ؼ� ���.
//message.length();        //public int length() : ����
//message.charAt(0);       //public char charAt(int index)

//message.equals("Hello~");//public boolean equals(Object anObject), Object�� ��� Ÿ��
					     //message �� String Ÿ���̹Ƿ� Object�� String���� �ؼ�
