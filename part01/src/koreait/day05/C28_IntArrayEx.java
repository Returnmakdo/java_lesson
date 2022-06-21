package koreait.day05;

import java.util.Arrays;
import java.util.Scanner;
  // �ۼ��� : ��ġ��
public class C28_IntArrayEx {
	
	/*
	 * 1. int �迭ũ�� 5�� ����. �̸��� nums
	 * 2. �迭�佺�� ���� ����� �Է����� �����Ѵ�.
	 * 3. �Էµ� ���� �հ�, ����� ���Ѵ�
	 * 4. �Էµ� ���� �ִ밪, �ּҰ��� ���ϴ� �޼ҵ带 �����.
	 *           ��maxOfArray     �� minOfArray : ���ڴ� int�迭, ��ȯ�� int
	 * 	 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		double avg;
		int number; 
		int[] nums = new int[5];
		
		for(int i = 0; i< nums.length; i++) {
			System.out.print("��� �� �Է� >> ");
			number = sc.nextInt();
			nums[i] = number;
			sum += nums[i];
		}
		avg = (double)sum / nums.length;
		System.out.println(Arrays.toString(nums));
		System.out.println("�Է��� ��� �� : " + sum);
		System.out.println("�Է��� ��� ��� : " + avg);
		System.out.println();
		
		System.out.println("���� max : " + maxOfArray(nums));
		System.out.println("���� min : " + minOfArray(nums));
		/*
		int sum = 0;
		int avg = 0;
		int[] nums = new int[5];
		int max = maxOfArray(nums);
		int min = maxOfArray(nums);
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print((i+1) + "��° ������ �Է� �ϼ��� >> ");
			nums[i] = sc.nextInt();
			System.out.println("�Էµ� ���� " + nums[i] + "�Դϴ�.");
			sum += nums[i];
			System.out.println("�Էµ� ���� �հ�� : " + sum + "�Դϴ�.");
		}
		System.out.println("================================");
		avg = sum / 5;
		System.out.printf("�Էµ� ���� ����� : " + avg + "�Դϴ�.\n");
		System.out.println("�迭 nums �ִ밪 max = " + max);
		System.out.println("�迭 nums �ִ밪 min = " + min);
		int max = nums[0];
		int min = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if(max < nums[i])
				max = nums[i];
		}
		for(int i = 0; i < nums.length; i++) {
			if(min > nums[i])
				min = nums[i];
		}
		
		System.out.printf("�ִ밪�� : %d �ּҰ��� : %d", max, min);
		*/
		sc.close();
	}
	// max,min ������ ���� �迭�� 0����Ұ����� �ʱ�ȭ �Ѵ�.
	// �迭��� 1������ ��������ұ��� max,min �� ������� ���ؼ� 
	// max�� �� ������ ������(min�� �װ����� ũ��) max(min)���� �迭��� ������ ����
	// -> �񱳰� ������ ���� max,min ����
	public static int maxOfArray(int[] array) {
		int max = array[0];
		for(int i = 1; i < array.length; i++) {
			if(max < array[i])
				max = array[i];
		}
		return max;
	}
	
	public static int minOfArray(int[] array) {
		int min = array[0];
		for(int i = 1; i < array.length; i++) {
			if(min > array[i])
				min = array[i];
		}
		return min;
	}
}
