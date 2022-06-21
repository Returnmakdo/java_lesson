package koreait.day17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

import koreait.day16.Word;

public class MyDictionaryV2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner ssc = new Scanner(System.in);
		List<Word> mywords = new ArrayList<>(); 
	
		try {
			System.out.println("���Ͽ��� �о�ñ�� ? (y or n) >>> ");
			if(ssc.nextLine().equals("y"))
				read(mywords, "D:\\cy\\iclass\\���ǿ��ѻ���.txt");
			else
				System.out.println("������ ���� ����ϴ�.");
		} catch (FileNotFoundException e1) {
			System.out.println("���� �о���� ���� ������ �߻��߽��ϴ�. " + e1.getMessage());
		}  // ���Ͽ��� ���� ���� �о���� �� ������ mywords����Ʈ�� ����
		
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
					Word temp = new Word(eng,kor,level); // ����
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
		try {
			System.out.println("���Ͽ� �����ұ�� ? (y or n) >>> ");
			if(ssc.nextLine().equals("y"))
				save(mywords, "D:\\cy\\iclass\\���ǿ��ѻ���.txt");
			else
				System.out.println("������ ������� �ʾҽ��ϴ�.");
		} catch (FileNotFoundException e) {
			System.out.println("���� �����߿� ������ ������ϴ�. " + e.getMessage());
		}
		sc.close();
		ssc.close();
	}
	
	private static void read(List<Word> mywords, String filename) throws FileNotFoundException {
		File file = new File(filename);
		Scanner sc = new Scanner(file);
		StringTokenizer stk = null;
		while(sc.hasNext()) {
			String temp = sc.nextLine();  // ���Ͽ��� 1�� �о�°� ����
			System.out.println(temp.substring(0, temp.indexOf("(")));
//			// ���� ����� ����� StringTokenizer �� Word ��ü ����� mywords ����Ʈ�� �߰��ϱ�
			stk = new StringTokenizer(temp.substring(0, temp.indexOf("(")));
			
			mywords.add(new Word(stk.nextToken(),  // english �ʵ尪 
								 stk.nextToken(),  // korean �ʵ尪
								 Integer.parseInt(stk.nextToken())));  // level �ʵ尪
			}
		sc.close();
		System.out.println("���� �о���� �Ϸ�.");
	}
	
	private static void save(List<Word> mywords, String filename) throws FileNotFoundException {
		// ���Ͽ�����ϱ�
		File file = new File(filename);
		PrintWriter pw = new PrintWriter(file);
		for(Word w : mywords)
			pw.println(w);
		
		pw.close();
		System.out.println("���������� �Ϸ�Ǿ����ϴ�.");
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
		System.out.println(String.format("%-20s %-20s\t %10s", "English", "Korean", "Level"));
		System.out.println("-------------------------------------------------------------");
		for(Word w : mywords) {
			System.out.println(String.format("%-20s %-20s\t %10s", w.getEnglish(), w.getKorean(), w.getLevel()));
		}
	}
	
	
}
