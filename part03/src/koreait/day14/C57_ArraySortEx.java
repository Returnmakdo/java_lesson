package koreait.day14;

import java.util.Arrays;
// �ۼ���  : ��ġ��
public class C57_ArraySortEx {
	// �迭�� ����� �� �����ϱ�. ���� �����ϼ���
	public static void main(String[] args) {
		int[] arr = {34, 77, 19, 56, 45, 9};
		int temp = 0;
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		} 
		System.out.println(Arrays.toString(arr)); 
	}
}