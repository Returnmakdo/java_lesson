package koreait.day06;

import java.util.Random;

public class C31_RandomEx {

	public static void main(String[] args) {
		/*
		 * 학생 성적(국어) 분포 보고서 작성
		 * 학생인원수 100명 - 점수는 랜덤값으로 테스트(0<= random <=100)
		 * 
		 * 90~100 : o 명 (소수점1자리 %)  카운트변수 5개 필요함.
		 * 80~89 :          몇명인지 ㄴ counts[5] : counts[0], counts[1] counts[2]...
		 * 70~79 : 
		 * 60~69 : 
		 * 60점 미만 : 
		 * 
		 */
		Random r = new Random();
		int[] koreans = new int[10000];
		int[] counts = new int[5];
		
		for(int i=0; i<koreans.length; i++) {     // 복습하기 !!!!! count[] 증감하는거 개념 익히기
			koreans[i] = r.nextInt(101); // 국어 점수 저장
			if(koreans[i] >= 90) counts[0]++;
			else if(koreans[i] >= 80) counts[1]++;
			else if(koreans[i] >= 70) counts[2]++;
			else if(koreans[i] >= 60) counts[3]++;
			else counts[4]++;
		}
		
		// 점수분포 결과 출력
		System.out.printf("%8s %8s %8s %8s %8s\n ", "90~100","80~89","70~79","60~69","60미만");
		System.out.println("----------------------------------------------");
		for (int i=0; i<counts.length; i++)
			System.out.printf("%8d ", counts[i]);
		
		System.out.println();
		
		for (int i=0; i<counts.length; i++)
			System.out.printf("%8.1f%%", (double)counts[i]/koreans.length*100);
	}

}
