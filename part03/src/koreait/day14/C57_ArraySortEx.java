package koreait.day14;

import java.util.Arrays;
// 작성자  : 안치영
public class C57_ArraySortEx {
	// 배열에 저장된 값 정렬하기. 직접 구현하세요
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