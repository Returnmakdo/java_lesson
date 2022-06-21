package koreait.day06;

import java.util.Arrays;
import java.util.Random;

public class C33_LottoEx {
// �ۼ��� ��ġ��
	public static void main(String[] args) {
		Random r = new Random();    // ���� ����Ʈ
		int[] numbers = new int[45]; // 45�������� �ε����� ������ numbers�迭 ����
		
		for(int i=0; i<45; i++)  // �ε����� ���� 0���� 44���� -> ������ ������ ��
			numbers[i] = i + 1;  // �� ���� 1���� 45����          -> �ζǹ迭�� ����Ǵ� ��
		
		System.out.println("numbers �迭 �ʱⰪ--------------------");
		System.out.println(Arrays.toString(numbers)); // ���� for������ ���� �� �� ���
		System.out.println("-----------------------------------");
		
		int[] lotto = new int[6];      // 6���� �ε����� ������  lotto �迭 ����
		int k;                    	   // �������� �޾� ������ ����
		for(int cnt=0; cnt<6; cnt++) { // �ζ� ��ȣ 6���� ���ϱ� ���� for�� 
			
			k = r.nextInt(45-cnt);     //  cnt=0,1,2,3,4,5�� ���� ������ bound���� 45,44,43,42,41,40 -> �ߺ�����(Ȯ������ ������ ����)
			// k�� ��������? 0~44, 0~43, 0~42, 0~41, 0~40, 0~39
			System.out.println("k = " + k + ",number = " + numbers[k]); // k�� �ε����� �� ����̰� numbers[k]�� �ش� k�� �ε����� �ִ� �� ���
			
			lotto[cnt] = numbers[k];   // numbers[k]�� �޾ƿ� ���� lotto�迭�� 0~6��°(cnt) �ε������� ���� �������� �־��ش�.
			
			// k��ġ�� �� ���� : �ε��� k+1���� ��������ұ��� �������� ����
			for(int i=k; i<numbers.length-1; i++) // �������� �޾� ������ ������ k�� �ε����� �ִ� ���� �ϳ��� ��������� ->�ߺ�����
				numbers[i] = numbers[i+1];
			System.out.println(Arrays.toString(numbers)); // �ǽð����� �������� numbers�迭 Ȯ��
		}
		System.out.println("���� ���� ���� : ");
		System.out.println(Arrays.toString(lotto));  // ���� ���ڵ��� ������ lotto�ε��� 0~6������ ���� �־��� �͵��� ���
		
		Arrays.sort(lotto);  // lotto �迭���� ũ�� ������� ��ġ ����
		System.out.println(Arrays.toString(lotto));  // ��������(����������) ���
	}

}
