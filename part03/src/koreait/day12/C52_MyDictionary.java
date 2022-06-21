package koreait.day12;

import java.util.Scanner;
import java.util.TreeMap;

public class C52_MyDictionary {

	public static void main(String[] args) {
		System.out.println("���ñ�� >>> 1.�ܾ�����  2.�ܾ�˻�  3.�ܾ��庸��  4.���α׷� ������");
//		HashMap<String, String> map = new HashMap<>(); �ܾ��� ������ �ڷᱸ��
		TreeMap<String, String> map = new TreeMap<String, String>();
		// ������ Ŭ����,����Ʈ�� �ٲ㼭 ���蹮������.
		String choice, eng, kor;
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� -> ");
		while(run) {                  // while �ݺ��ȿ� switch���������� ���۽�ų�� break;�� ���� -> �������
			choice = sc.nextLine();
			switch(choice) {
				case "1":   // if�����δ� sel.eqauls("1")
					System.out.print("English -> ");
					eng = sc.next();
					System.out.print("Korean -> ");
					kor = sc.next();
					map.put(eng, kor);  // ����
					break;
				
				case "2":
					System.out.print("�˻��ܾ� English ->");
					eng = sc.nextLine();
					System.out.print("�ܾ��� �˻��߽��ϴ�.");
					if(!map.containsKey(eng))
						System.out.println("��� => null");
					else if(map.containsKey(eng))
						System.out.println("��� => " + map.get(eng));
					break;
				
				case "3":
					System.out.println("�ܾ��� ��ü���� : " + map);
					break;
				
				case "4":
					System.out.println("���α׷��� �����մϴ�.");
					run = false;
					break;
					
				default:
					System.out.print("���� -> ");
					break;
			}
		
		}
		sc.close();
		// ���� : ���������� �Է��� �޾ƾ��Ѵٸ� ���ڿ� nextLine()���� �޾Ƽ� ������ ��ȯ. 
		// int score = Integer.parseInt(sc.nextLine());
		// ���� : nextInt()�� ���͸� ó������ �ʾƼ� ������������ nextLine()���� ���޵Ǿ� �Է��帧�� ���ذ��ȴ�.
	}

}
