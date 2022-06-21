package koreait.day16;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MyDictionary {

	public static void main(String[] args) {
		// ������ Ŭ����,����Ʈ�� �ٲ㼭 ���蹮������.
		Scanner sc = new Scanner(System.in);
		List<Word> mywords = new ArrayList<>(); // TreeMap�� List�� �ٲ㼭
		
		String choice, eng, kor;
		int level;
		System.out.println("���ñ�� >>> 1.�ܾ�����  2.�ܾ�˻�  3.��ü����  4. ������ �˻� 5.���α׷� ������");
		boolean run = true;
		
		while(run) {                  // while �ݺ��ȿ� switch���������� ���۽�ų�� break;�� ���� -> �������
			System.out.print("���� -> ");
			choice = sc.nextLine();
			switch(choice) {
				case "1":   // if�����δ� sel.eqauls("1")
					System.out.print("English -> ");
					eng = sc.nextLine();
					System.out.print("Korean -> ");
					kor = sc.nextLine();
					System.out.print("���� -> ");
					level = Integer.parseInt(sc.nextLine());
					Word temp = new Word(eng,kor); // ����
					temp.setLevel(level);
					mywords.add(temp);
					//������ 3������ �ص���
					break;
				
				case "2":
					System.out.print("�˻��ܾ� English ->");
					eng = sc.nextLine();
					for(Word w : mywords)
						if(w.getEnglish().equals(eng))
					System.out.print("�ܾ��� �˻��߽��ϴ�. ��� => " + w);
					break;
				
				case "3":
					System.out.println("�ܾ��� ��ü���� : " + mywords);
					all(mywords); // �����ϰ� ����ϱ�
					break;
					
				case "4":
					System.out.println("�˻��� ���� �Է�(1~3) -> ");
					int no = Integer.parseInt(sc.nextLine());
					level(mywords, no);
					break;
				
				case "5":
					System.out.println("���α׷��� �����մϴ�.");
					run = false;
					break;
					
				default:
					System.out.print("���� -> ");
					break;
			}
		
		}
		sc.close();
	}

	private static void level(List<Word> mywords, int no) {
		for(Word w : mywords)  // for-each�� �����ϱ�
			if(w.getLevel()==no)
				System.out.println(w);
	}

	private static void all(List<Word> mywords) { // mywords �� �������� ���޹޾� ������ ��ü�� ����ŵ�ϴ�.
		mywords.sort(new Comparator<Word>() {

			@Override
			public int compare(Word o1, Word o2) {
				return o1.getEnglish().compareTo(o2.getEnglish());
			}
		});
		System.out.println(String.format("%-20s %-20s\t %-40s", "English", "Korean", "Level"));
		System.out.println("-------------------------------------------------------------");
		for(Word w : mywords) {
			System.out.println(String.format("%-20s %-20s\t %-40s", w.getEnglish(), w.getKorean(), w.getLevel()));
		}
	}
	
	
}
