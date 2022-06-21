package koreait.day09;

public class C44_ForEachTest {

	public static void main(String[] args) {
		
		int[] itest = {1,2,3,4,5,6};
		String[] stest = {"break", "public", "each", "package", "while"};
		
		//배열을  for문에서 순차적으로 접근할때 인덱스 변수를 사용
		//여기는 int타입
		for(int i=0; i<itest.length; i++)
			System.out.println(i + " = " + itest[i]);

		//temp 변수 사용
		for(int i=0; i<itest.length; i++) {
			int temp = itest[i];
			System.out.println(i + " = " + itest[i]);
		}
		
		
		// 여기는 String 타입
		for (int i = 0;  i< stest.length; i++) 
			System.out.println(i + " = " + stest[i]);
		
		
		
		//코딩 시 효율성을 높이기 위해 향상된 for(for each) 사용 : 단 itest[i], stest[i]만 사용하고 인덱스변수'i' 를 코드에서 사용하지않을때만
		System.out.println("itest 배열값");
		for(int temp: itest)
			System.out.println(temp);
		
		System.out.println("\n stest 배열값");
		for(String temp : stest)
			System.out.println(temp);
	}

}
