package koreait.day06;

import java.util.Random;

public class C31_RandomEx {

	public static void main(String[] args) {
		/*
		 * �л� ����(����) ���� ���� �ۼ�
		 * �л��ο��� 100�� - ������ ���������� �׽�Ʈ(0<= random <=100)
		 * 
		 * 90~100 : o �� (�Ҽ���1�ڸ� %)  ī��Ʈ���� 5�� �ʿ���.
		 * 80~89 :          ������� �� counts[5] : counts[0], counts[1] counts[2]...
		 * 70~79 : 
		 * 60~69 : 
		 * 60�� �̸� : 
		 * 
		 */
		Random r = new Random();
		int[] koreans = new int[10000];
		int[] counts = new int[5];
		
		for(int i=0; i<koreans.length; i++) {     // �����ϱ� !!!!! count[] �����ϴ°� ���� ������
			koreans[i] = r.nextInt(101); // ���� ���� ����
			if(koreans[i] >= 90) counts[0]++;
			else if(koreans[i] >= 80) counts[1]++;
			else if(koreans[i] >= 70) counts[2]++;
			else if(koreans[i] >= 60) counts[3]++;
			else counts[4]++;
		}
		
		// �������� ��� ���
		System.out.printf("%8s %8s %8s %8s %8s\n ", "90~100","80~89","70~79","60~69","60�̸�");
		System.out.println("----------------------------------------------");
		for (int i=0; i<counts.length; i++)
			System.out.printf("%8d ", counts[i]);
		
		System.out.println();
		
		for (int i=0; i<counts.length; i++)
			System.out.printf("%8.1f%%", (double)counts[i]/koreans.length*100);
	}

}
