package koreait.day15;

import java.io.File;  // io�� input,output�� ���� - ����� ���õ� ��ɵ��� Ŭ����
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class C66_FileReadTest {

	public static void main(String[] args) {
		
		String filename = "C:\\Users\\ITCS\\Desktop\\cy\\�ڹ��׽�Ʈ.txt";
//		String filename = "C:\\Users\\ITCS\\Desktop\\cy\\�ڹ��׽�Ʈ2.txt";
		
		File file = new File(filename);
		Scanner sc = null;
		// Scanner : �Է� ����� ���� Ŭ����
		// Unhandled exception type FileNotFoundException : ������ ���ɼ��� �����Ƿ� try/catch�� ���.
		try {
			sc = new Scanner(file); // System.in : ǥ�� �Է�(�ܼ� �Է�)
//			System.out.println("���Ͽ��� ���� ���� : " + sc.nextLine());
//			System.out.println("���Ͽ��� ���� ���� : " + sc.nextLine());
//			System.out.println("���Ͽ��� ���� ���� : " + sc.nextLine());
			while(sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
			System.out.println("���� �бⰡ �Ϸ�Ǿ����ϴ�."); 
	
		} catch (FileNotFoundException e) {
			// �Է±�ɿ��� ������ ������ Exception�� �߻��Ѵ�.
			System.out.println("����� ���� �߻� : " + e.getMessage());
			
		} finally {
			if(sc!=null)
			sc.close();
		}
		
		// try ~ catch �ڿ����� ����� finally => java7�������� �ٸ� ���� ������ �����մϴ�.
		
		
		
		
		
	}

}
