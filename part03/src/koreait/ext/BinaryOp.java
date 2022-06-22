package koreait.ext;

public class BinaryOp {

	public static void main(String[] args) {
		// 2진수의 비트연산 : &, |, ^, ~, >>, << 등등 간단히 테스트
		int data = 0b0101110100100110;
		
		System.out.println("1. ~ (비트반전) 연산 결과");
		System.out.println(String.format("%32s", Integer.toBinaryString(data)));
		System.out.println(String.format("%32s", Integer.toBinaryString(~data)));
		
		System.out.println("2. >>은 오른쪽 쉬프트 연산 / 오른쪽 정수값은 쉬프트 동작 횟수");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data),data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data>>1),data>>1));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data>>2),data>>2));
		// >>1 은 나누기 2한 결과값.
		
		System.out.println("3. <<은 왼쪽 쉬프트 연산 / 왼쪽 정수값은 쉬프트 동작 횟수");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data),data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data<<1),data<<1));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data<<2),data<<2));
		// <<1 은 곱하기 2한 결과값.
		
		data = -2345;
		System.out.println("4. 음수값 >> 오른쪽 쉬프트 연산 / 왼쪽에 추가되는 비트는 무엇?");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data),data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data>>1),data>>1));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data>>2),data>>2));
		// 정수 32비트의 맨왼쪽비트는 부호를 표시. 오른쪽 쉬프트연산에서 왼쪽엣 추가되는 비트는 부호비트와 같다.
		// 참고 : 오른쪽 쉬프트할때 부호와 상관없이 왼쪽에 추가되는 비트를 0으로 해야할때는 >>>연산으로 한다.
		
		System.out.println("5. 오른쪽 >>> 쉬프트 연산");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data),data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data>>>2),data>>>2));
		
		int n = 0xffffffff;
		data = 100;
		// 참고 논리연산 and는 참 and 참일때만 결과가 참, 논리연산 or는 거짓or거짓일때만 결과가 거짓
		//    비트엲산 and는 1&1 일때만 결과가 1, 비트연산 or는 0or0 일때만 결과가 0
		System.out.println("6. &는 bit and 연산");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data),data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(n),n));
		System.out.println("------------------------------------------------");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data&n),data&n)); // 결과값 100
		
		System.out.println("\n7. |는 bit or 연산");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data),data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(n),n));
		System.out.println("------------------------------------------------");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data|n),data|n)); // 결과값 -1
		
		n = 0;
		System.out.println("\n8. &는 bit and 연산");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data),data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(n),n));
		System.out.println("------------------------------------------------");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data&n),data&n)); // 결과값 
		
		System.out.println("\n9. |는 bit or 연산");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data),data));
		System.out.println(String.format("%32s %d", Integer.toBinaryString(n),n));
		System.out.println("------------------------------------------------");
		System.out.println(String.format("%32s %d", Integer.toBinaryString(data|n),data|n));
		
	}

}
