package koreait.day07;

import java.util.Scanner;

// C40 번호 생략
public class Score {
	
	int korean;
	int english;
	int science;
	
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 >>> "); this.korean = sc.nextInt();
		System.out.print("영어 >>> "); this.english = sc.nextInt();
		System.out.print("과학 >>> "); this.science = sc.nextInt();
		// sc.close();    완전히 프로그램이 종료될때만 close
	}
	
	int sum() {
		return (korean+english+science);
	}
	
	double average() {
		return (double)sum() / 3;
	}

	@Override
	public String toString() {
		return "[korean=" + korean + ", english=" + english + ", science=" + science + "]";
	}
	
	
}
