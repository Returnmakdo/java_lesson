package koreait.day12;

import java.util.ArrayList;
import java.util.Arrays;

public class C46_ArrayList {

	public static void main(String[] args) {
		
		int[] datas = {45,23,7,21,19,11,44}; // 배열은 선언 시 배열의 크기를 정한다.
		                                     // 배열은 기본형 데이터 타입은 int,double,long...또는 참조형
		
		ArrayList<Integer> list = new ArrayList<>();
		// ArrayList는 크기가 동적이다.
		// 데이터타입은  참조형타입만 쓸수있다. 기본형은 래퍼클래스를 사용합니다.
		// ** <> 는 제너릭타입이라고 부른다(모든 타입을 리스트에 담을 수 있다)**
		// 리스트에 저장하는 데이터를 요소(Element)라고 부른다.
		// 주요 메소드 : add, get, size, remove 
		
		String[] names = {"쯔위","모모","신비","은하","나나"};
		ArrayList<String> name_list = new ArrayList<>();
		
		// ArrayList에 데이터 추가는 add() 메소드
		list.add(45);
		list.add(7);
		list.add(21); list.add(19); list.add(11); list.add(44);
		
		System.out.println("1.첫번째 ArrayList 출력");
		System.out.println(list);
		System.out.println("참고(배열) : " + Arrays.toString(datas) + ", 배열크기 : "+ datas.length);
		System.out.println("리스트의 크기 : " + list.size());
		
		name_list.add("쯔위"); name_list.add("모모");
		name_list.add("은하"); name_list.add("나나");
		System.out.println("2.두번째 ArrayList<String> 출력");
		System.out.println(name_list);  // 데이터 없을때 []
		System.out.println("리스트의 크기 : " + name_list.size()); // 데이터 없을 때, 0
		
		System.out.println("3.특정위치에 데이터 추가");
		list.add(1, 23);  // (인덱스위치,추가될 값)
		System.out.println("add(1, 23) 결과 : " + list);
		
		name_list.add(2, "신비");
		System.out.println("add(2, \"신비\") 결과 : " + name_list);
		
		System.out.println("4. 배열처럼 index값으로 데이터가져오기");
		System.out.println("get(3) : " + list.get(3));
		System.out.println("get(3) : " + name_list.get(3));
		
		System.out.println("5. 특정위치의 데이터(요소) 제거");
		list.remove(4);
		System.out.println("remove(4) 결과  : " + list);
		name_list.remove(4);
		System.out.println("remove(4) 결과  : " + name_list);
		
		System.out.println("6. 특정값 위치를 알아내기 (신비는 몇번째 인덱스?)");
		System.out.println("배열 : " + Arrays.binarySearch(names, "신비"));
		System.out.println("리스트 : " + name_list.indexOf("신비"));
		
		System.out.println("7. 6번의 실행내용을 for문으로한다면 ?");
		System.out.println("배열");
		int i;
		for(i=0; i<names.length; i++) {
			if(names[i].equals("신비"))
				break;
		}
		System.out.println("신비는 인덱스 :" + i);
		
		System.out.println("리스트");
		for(i=0; i<name_list.size(); i++) {
			if(name_list.get(i).equals("신비"))
				break;
		}
		System.out.println("신비는 인덱스 " + i);
		
		//'신비' 요소가 여러개일때  리스트는 lastIndexOf 메소드로 마지막 일치요소를 찾을 수 있다.
		
		System.out.println("8. contains 메소드 ");
		System.out.println("모모가 리스트에 있는가?" + name_list.contains("모모"));
		System.out.println("다현이 리스트에 있는가?" + name_list.contains("다현"));
		
		
	}

}
/*
 * 배열 : 많은 양의 데이터를 저장하는 방법
 * 
 * 컬렉션(Collections) : 자료구조. 많은양의 데이터를 저장하는 것이고 데이터의 특징에 따라
 *  				       관리(저장,읽기/쓰기)하는 차이가 있다.
 *  		                          데이터를 삽입/삭제 등의 알고리즘의 메소드로 구현되어있다.
 *  ㄴ ArrayList 클래스
 *  ㄴ HashMap   클래스
 *  
 */
