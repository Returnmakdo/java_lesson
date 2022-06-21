package koreait.day02;
// 안치영
public class C08_Test {
	public static void main(String[] args) {
		System.out.println("-----사각형 도형의 넓이 구하기-----");
		
		int width = 23;
		int height = 19;
		System.out.println("가로 : " + width + "㎝");
		System.out.println("세로 : " + height + "㎝");
		System.out.println("넓이를 구했습니다 : " + (width*height) + "㎠");
		
		System.out.println("============================");
		
		System.out.println("-----원 도형의 넓이와 둘레 구하기-----");
		
		double half = 23.230;
		double round = 2 * 3.14 * half;
		double area = 3.14 * half * half;
		System.out.printf("반지름 : %.3f㎝ \n", half);
		System.out.printf("둘레를 구했습니다 : %.3f㎠ \n", round);
		System.out.printf("넓이를 구했습니다 : %.3f㎠ \n",area);
		
		// final 테스트
		// 변수선언 앞에 final 키워드를 붙이면 값을 변경하지 못한다.
		
		final int test = 123;   // 값을 변경 못하는 상수 static이없어서 반만 상수임 나중에 클래스할때 할거
		System.out.println(test);
//		test = 456;
		final double PI = 3.14;
	}

}
