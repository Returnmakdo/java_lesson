package koreait.day08b;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int max = 10;  // 시도회수
		int[] triallst = new int[max];  // 10개 인덱스를 갖는 배열 생성
		
		System.out.println("숫자 맞추기 게임 시작합니다. 나 컴퓨터는 숫자를 결정했습니다.");
		System.out.println("너, 휴면은 맞춰보세요. (101 ~ 299)");
		int numComputer = r.nextInt(199) + 101; // 101~299 랜덤값 뽑기
		int numHuman;
		int i = 0;
		
		do {
			System.out.print("생각한 숫자 입력 (기회 : " + (max - i) + ") -> "); // max번의 기회에서 한번에 하나씩 기회가 줄어듬
			numHuman = sc.nextInt();
			if (numComputer > numHuman) {  // 컴퓨터의 숫자가 사용자입력값보다 클 경우 triallst배열 인덱스 하나씩 추가
				triallst[i] = numHuman;
				i++;
				System.out.println("아닙니다. 더 큰 값입니다.");
			} else if (numComputer < numHuman) { // 컴퓨터의 숫자가 사용자입력값보다 작을 경우 triallst배열 인덱스 하나씩 추가
				triallst[i] = numHuman;
				i++;
				System.out.println("아닙니다. 더 작은 값입니다.");
			}
			if(i == max) break;  // max번 다하면 탈출(종료)
		}while (numComputer != numHuman); // 사용자입력값이 컴퓨터가정한값이랑 같지 않을동안 계속반복(위에 조건으로 max번의기회)
		
		if(i == max) {
			System.out.println("너 휴면 입력 내용 : " + Arrays.toString(triallst));
			System.out.println("주어진 기회를 다 쓰셨습니다. 게임을 다시 시작하세요.!! [답은 " + numComputer + "]");
		}else {
			System.out.println("딩동댕~ 맞추셨습니다. 성공까지 시도횟수 : " + (i+1));
		}
		
		sc.close();
	}
}
