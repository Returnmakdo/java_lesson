package koreait.day14;

import java.util.Arrays;
// 작성자  : 안치영
public class C58_ArraySortEx2 {
	// 문자열 배열에 저장된 값 정렬하기. 직접 구현하세요
	public static void main(String[] args) {
		String[] names = {"제니", "다현", "나연", "신비", "은하", "모모"};
		
		
		for(int i=0; i<names.length-1; i++) {
			for(int j=i+1; j<names.length; j++) {
				if(names[i].compareTo(names[j]) > 0) {
					String temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				} 
			}
		} 
		System.out.println(Arrays.toString(names)); 
	}
}