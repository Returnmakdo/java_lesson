package dictionaryPractice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MyDictionaryPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<DicWord> dw = new ArrayList<>();
		
		String choice, math, science;
		int grade;
		System.out.print("���ñ�� -> 1.�ܾ�����  2.�ܾ�˻�  3.��ü����  4.�����ΰ˻�  5.���α׷� ����");
		boolean run = true;
		
		while(run) {
			System.out.println("��ȣ���� -> ");
			choice = sc.nextLine();
			switch(choice) {
				case "1":
					System.out.print("Math -> ");
					math = sc.nextLine();
					System.out.print("Science -> ");
					science = sc.nextLine();
					System.out.print("��� -> ");
					grade = Integer.parseInt(sc.nextLine());
					DicWord temp = new DicWord(math, science);
					temp.setGrade(grade);
					dw.add(temp);
					break;
					
				case "2":
					System.out.print("�˻��ܾ� Math -> ");
					math = sc.nextLine();
					for(DicWord w : dw)
						if(w.getMath().equals(math))
					System.out.println("�ܾ��� �˻�... ��� -> " + w);
					break;
					
				case "3":
					System.out.println("�ܾ��� ��ü���� : " + dw);
					all(dw);
					break;
					
				case "4":
					System.out.println("�˻��� ��� �Է� (1~3) -> ");
					int no = Integer.parseInt(sc.nextLine());
					grade(dw, no);
					break;
					
				case "5":
					System.out.println("���α׷� ����.");
					run = false;
					break;
			}
		}
		sc.close();
		
	}

	private static void grade(List<DicWord> dw, int no) {
		for(DicWord w : dw)
			if(w.getGrade() == no)
				System.out.println(w);
	}

	private static void all(List<DicWord> dw) {
		dw.sort(new Comparator<DicWord>() {

			@Override
			public int compare(DicWord o1, DicWord o2) {
				return o1.getMath().compareTo(o2.getMath());
			}
			
		});
	}
	
	
}
