package koreait.day05;

public class C22_AssignTest {
	public static void main(String[] args) {
		
		// ���� : ����������, ��࿬����
		int i = 10, sum =0;
		i = i + 1;
		i += 1;
		i++;  // ��ġ
		++i;  // ��ġ
		
		System.out.println("i++ ?" + i++); //  ����� 14, i���� 15
		System.out.println("++i ?" + (++i)); // ���16 �� 16
		sum = sum + i;
		sum += i;
		System.out.println("sum ?" + sum);  // 32
		
		//
		i--;
		--i;
		sum = sum - 10;
		sum -= 10;
	}
}
