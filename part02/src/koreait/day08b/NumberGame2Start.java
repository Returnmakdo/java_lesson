package koreait.day08b;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGame2Start {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int max = 10;  // �õ�ȸ��
		int[] triallst = new int[max];  // 10�� �ε����� ���� �迭 ����
		GameValue[] history = new GameValue[10]; // �ִ� 10�� ����� �����ϱ�
		int k = 0;  // history �迭�� �ε���
		
		System.out.println("���� ���߱� ���� �����մϴ�.");
		System.out.print("������ �����Ϸ��� �� �޸��� �̸��� ���ÿ� >>> ");
		String gamer =sc.nextLine();
		int rmin =11, rmax = 29;
		
		do {
			GameValue temp = new GameValue(gamer);
			System.out.println("���� �����մϴ�. �� ��ǻ�ʹ� ���ڸ� �����߽��ϴ�.");
			System.out.println(String.format("��, �޸��� ���纸����. (%d ~ %d)", rmin, rmax));
			int numComputer = GameValue.makeNumber(rmin, rmax); // rmin~rmax ������ �̱�
			int numHuman;
			int i = 0;
			
			do {
				System.out.print("������ ���� �Է� (��ȸ : " + (max - i) + ") -> "); // max���� ��ȸ���� �ѹ��� �ϳ��� ��ȸ�� �پ��
				numHuman = sc.nextInt();
				if (numComputer > numHuman) {  // ��ǻ���� ���ڰ� ������Է°����� Ŭ ��� triallst�迭 �ε��� �ϳ��� �߰�
					triallst[i] = numHuman;
					i++;
					System.out.println("�ƴմϴ�. �� ū ���Դϴ�.");
				} else if (numComputer < numHuman) { // ��ǻ���� ���ڰ� ������Է°����� ���� ��� triallst�迭 �ε��� �ϳ��� �߰�
					triallst[i] = numHuman;
					i++;
					System.out.println("�ƴմϴ�. �� ���� ���Դϴ�.");
				}
				if(i == max) break;  // max�� ���ϸ� Ż��(����)
			}while (numComputer != numHuman); // ������Է°��� ��ǻ�Ͱ����Ѱ��̶� ���� �������� ��ӹݺ�(���� �������� max���Ǳ�ȸ)
			
			if(i == max) {
				System.out.println("�� �޸� �Է� ���� : " + Arrays.toString(triallst));
				System.out.println("�־��� ��ȸ�� �� ���̽��ϴ�. ������ �ٽ� �����ϼ���.!! [���� " + numComputer + "]");
				temp.setCount(max);
			}else {
				System.out.println("������~ ���߼̽��ϴ�. �������� �õ�Ƚ�� : " + (i+1));
				temp.setCount(i+1);
				temp.setSuccess(true);
			}
			
			// ���� ���Ӱ���� history �迭�� ����
			history[k] = temp;
			k++;  // �����ε����� ,ī��Ʈ ���� (���� �� Ƚ��)
			
			System.out.println("������ ����Ͻðڽ��ϱ�? ����Ϸ���  0 �Է� >>> ");
		}while(sc.nextInt() == 0);
		
		System.out.println("::::::::::���� ���ھ�::::::::::");
		for(int j=0; j<k; j++)
			history[j].print();
		
		
		System.out.println("::::::::::The END::::::::::");
		
		
		
		
		
		sc.close();
	}
}
