package koreait.day12;

import java.util.ArrayList;
import java.util.Random;

public class C49_LottoTest {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		
		for(int i=0; i<45; i++) {
			numbers.add(i+1);
		}
		System.out.println("numbers");
		System.out.println(numbers);  // toString이 재정의
		
		Random r = new Random();
		
		ArrayList<Integer> lotto = new ArrayList<Integer>();
		
		int k; // 난수로 뽑힐 값 인덱스
		
		for(int cnt=0; cnt<6; cnt++) {
			k = r.nextInt(45-cnt);
			System.out.println("k = " +k + ", number = " + numbers.get(k));
			lotto.add(numbers.get(k));
			numbers.remove(k);   // 뽑힌값 리스트에서 삭제
			System.out.println("남은 공");
			System.out.println(numbers);
		}
		
		System.out.println("최종 선택 숫자 6개");
		System.out.println(lotto);
		
		
	}

}
