package koreait.day01;

public class C02_TwicePrint {

	public static void main(String[] args) {
		System.out.println("Ʈ���̽�");
		System.out.println("�̸�\t�������\t\t����");
		System.out.println("----------------------------");
		System.out.println("�糪\t1996.12.19\t27"); // �Ѱ� ���ڿ� ���
		System.out.println("��ȿ\t1997.02.01\t26");
		System.out.println("�̳�\t1998.03.24\t25");
		//printf() �޼ҵ� ����ؼ� �����������
		//12ĭ ���ڿ�+�ڸ��� �������� ���� ���ڿ�_5ĭ ����
		//%s�� ������ ĭ���� �����ʸ���, -��ȣ�� ���ʸ���.
		System.out.printf("%-8s%s%8d\n","dahyun","1998.05.28",25);
		System.out.printf("%-8s%s%8d\n","momo","1999.04.23",24);
		System.out.printf("%-8s%s%8d\n","nayeon","1997.06.14",27);
		
		//printf �޼ҵ忡�� ���Ĺ��� ������ŭ �ڿ� ������ ������ ������ ��ġ�����ʾ� ���� 
//		System.out.printf("%-8s%s%8d\n","nayeon","1997.06.14");
		
		//printf �޼ҵ忡�� ���Ĺ��ڿ� �ڿ������� ������ ������ ��ġ�����ʾ� ����
//		System.out.printf("%-8s%8d\n","nayeon","1997.06.14");
		
		//���� : System.out.printf("%-8s%s%8d\n","dahyun","1998.05.28",25);
		//  �� ������� "1998.05.28"�� ��������(������)�� ����ϵ��� �����ϱ�.
		System.out.println("///////����///////");
		System.out.printf("%-8s%4d.%02d.%2d%8d\n","dahyun",1998,5,28,25);
		System.out.printf("%-8s%4d.%2d.%2d%8d\n","momo",1999,11,23,24);
		System.out.printf("%-8s%4d.%02d.%2d%8d\n","nayeon",1997,6,14,27);
		//��������� �����͸� ���� ���ͷ��� ǥ���ؼ� ����� ��.
		
		// ���� ���� : ����(�����͸� �����ϰ��ִ� ������ �̸�) ���
		System.out.println("//////�������//////");
		String name = "nayeon";
		int year = 1997;
		int month = 6;
		int day = 14;
		int age = 27;
		System.out.printf("%-8s%4d.%02d.%2d%8d\n",name,year,month,day,age);
	}
/*
 * ��¿� ���Ǵ� ����
 * 
 * \(��������) ����ϴ� �̽������� ����: \n(�ٹٲ�) \t(��)
 * ������������ %��ȣ ��� : %s(���ڿ�) %d(����) �ڸ��� �����ؼ� �� �� �ִ�.
 *                                    �� �����ڸ� 0���� ä�ﶧ���� %03d �̷�������
 */

}
