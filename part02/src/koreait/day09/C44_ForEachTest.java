package koreait.day09;

public class C44_ForEachTest {

	public static void main(String[] args) {
		
		int[] itest = {1,2,3,4,5,6};
		String[] stest = {"break", "public", "each", "package", "while"};
		
		//�迭��  for������ ���������� �����Ҷ� �ε��� ������ ���
		//����� intŸ��
		for(int i=0; i<itest.length; i++)
			System.out.println(i + " = " + itest[i]);

		//temp ���� ���
		for(int i=0; i<itest.length; i++) {
			int temp = itest[i];
			System.out.println(i + " = " + itest[i]);
		}
		
		
		// ����� String Ÿ��
		for (int i = 0;  i< stest.length; i++) 
			System.out.println(i + " = " + stest[i]);
		
		
		
		//�ڵ� �� ȿ������ ���̱� ���� ���� for(for each) ��� : �� itest[i], stest[i]�� ����ϰ� �ε�������'i' �� �ڵ忡�� ���������������
		System.out.println("itest �迭��");
		for(int temp: itest)
			System.out.println(temp);
		
		System.out.println("\n stest �迭��");
		for(String temp : stest)
			System.out.println(temp);
	}

}
