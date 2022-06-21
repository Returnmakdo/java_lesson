package koreait.day06;

import java.util.Arrays;
import java.util.Random;

public class C33_LottoEx {
// 작성자 안치영
	public static void main(String[] args) {
		Random r = new Random();    // 랜덤 임포트
		int[] numbers = new int[45]; // 45번까지의 인덱스를 가지는 numbers배열 생성
		
		for(int i=0; i<45; i++)  // 인덱스의 범위 0부터 44까지 -> 난수로 뽑히는 값
			numbers[i] = i + 1;  // 값 범위 1부터 45까지          -> 로또배열에 저장되는 값
		
		System.out.println("numbers 배열 초기값--------------------");
		System.out.println(Arrays.toString(numbers)); // 위의 for문으로 인해 들어간 값 출력
		System.out.println("-----------------------------------");
		
		int[] lotto = new int[6];      // 6개의 인덱스를 가지는  lotto 배열 생성
		int k;                    	   // 랜덤값을 받아 저장할 변수
		for(int cnt=0; cnt<6; cnt++) { // 로또 번호 6개를 구하기 위한 for문 
			
			k = r.nextInt(45-cnt);     //  cnt=0,1,2,3,4,5에 대해 난수의 bound값은 45,44,43,42,41,40 -> 중복방지(확률적인 범위를 줄임)
			// k의 난수범위? 0~44, 0~43, 0~42, 0~41, 0~40, 0~39
			System.out.println("k = " + k + ",number = " + numbers[k]); // k는 인덱스의 값 출력이고 numbers[k]는 해당 k의 인덱스에 있는 값 출력
			
			lotto[cnt] = numbers[k];   // numbers[k]로 받아온 값을 lotto배열에 0~6번째(cnt) 인덱스까지 값을 차례차례 넣어준다.
			
			// k위치의 값 제거 : 인덱스 k+1부터 마지막요소까지 왼쪽으로 당기기
			for(int i=k; i<numbers.length-1; i++) // 랜덤값을 받아 저장한 변수인 k의 인덱스에 있는 값을 하나씩 지우기위함 ->중복방지
				numbers[i] = numbers[i+1];
			System.out.println(Arrays.toString(numbers)); // 실시간으로 지워지는 numbers배열 확인
		}
		System.out.println("최종 선택 숫자 : ");
		System.out.println(Arrays.toString(lotto));  // 뽑은 숫자들을 위에서 lotto인덱스 0~6까지의 값을 넣어준 것들을 출력
		
		Arrays.sort(lotto);  // lotto 배열값의 크기 순서대로 위치 변경
		System.out.println(Arrays.toString(lotto));  // 오름차순(작은수부터) 출력
	}

}
