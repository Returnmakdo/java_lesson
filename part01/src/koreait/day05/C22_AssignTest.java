package koreait.day05;

public class C22_AssignTest {
	public static void main(String[] args) {
		
		// 참고 : 증가연산자, 축약연산자
		int i = 10, sum =0;
		i = i + 1;
		i += 1;
		i++;  // 후치
		++i;  // 전치
		
		System.out.println("i++ ?" + i++); //  출력은 14, i값은 15
		System.out.println("++i ?" + (++i)); // 출력16 값 16
		sum = sum + i;
		sum += i;
		System.out.println("sum ?" + sum);  // 32
		
		//
		i--;
		--i;
		sum = sum - 10;
		sum -= 10;
	}
}
