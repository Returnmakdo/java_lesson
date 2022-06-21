package koreait.day02;

// (����)�ڹ� ���α׷��־����� Ŭ�����̸��� ���ϸ��� �����ϰ� �մϴ�.
public class C07_CastingTest {
	public static void main(String[] args) {
		// ������� + - * / %
		// ���迬�� ==(����), != (�����ʴ�), > , < , >= , <=
		// ������ &&(and), ||(or), !(not)
		
		// ���������� ������ int
		
		int a = 123, b = 13;
		double c = 10.34;
		
		// ���꿡 ���Ǵ� �ǿ����ڰ� ��� �����̸� ����� ����
		//           �ǿ����ڰ� ����,�Ǽ� ����� ����� �Ǽ�
		//           -> �������� ������ ������ �� ������ ������ ����Ѵ�.
		// ���� : ++, --, +=, -=, /=, /=�� ���� ��࿬���� ���� ����
		int isum;
		double dsum;
		
		isum = a + b;
		dsum = a + c;
		
		System.out.println(isum);
		System.out.println(dsum);
		
//		isum = a + c; // ����� �Ǽ��̹Ƿ� �������� ������ ���� ���Ѵ�. ����
		
//		����ȯ : ���� + �Ǽ� ����� �� ���������� �����ؾ��Ѵٸ� �Ǽ��� �����κ�ȯ�ؼ� �������Ѵ�.
//		      -> ���α׷��Ӱ� �����ؼ� ������ ����ȯ -> ()�ȿ� ��ȯ��ų ����
		
		isum = a + (int)c; // c������ �Ǽ����� ������ ��ȯ (�Ҽ��� ����)
		System.out.println(isum);
		
		b = 10;
		System.out.println("a / b = " + (a/b)); // �������� ������ ��� ����
		System.out.println("a % b = " + (a%b)); // �������� �������� ������
		
		System.out.printf("%d / %d = %d\n", a, b,a/b);
		System.out.printf("%d %% %d = %d\n", a, b,a%b);
		
//		���� ����ȯ(ĳ����) ���� : �������� ������ ����� �Ǽ��� ���ϴ� ó�������� ��
//		          -> ����1���� �Ǽ��� ��ȯ
		System.out.println("���� / ���� = �Ǽ� ���� ������ ���ϱ�.");
		System.out.printf("%d / %d = %f\n", a, b, (double)a/b); // �Ǽ����Ĺ��� %f, �⺻ �Ҽ������� 6�ڸ�
		System.out.printf("%d / %d = %.2f\n", a, b, (double)a/b); // �Ҽ���  n�ڸ������� ǥ��(�ݿø�)
		
		double test = 12.3456123456789;
		System.out.printf("test : %f\n", test);
		System.out.printf("test : %.7f\n", test);
		System.out.printf("test : %.3f\n", test);
		System.out.printf("test : %.15f\n", test);
	}
	

}
