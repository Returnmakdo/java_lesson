package koreait.day12;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class C51_TodayMenu {

	public static void main(String[] args) {
		
		System.out.println("오늘의 저녁메뉴 투표합니다.!!!");
		System.out.println("치맥, 떡볶이, 곱창, 불고기, 햄버거, 오징어물회");
		
		//key : 메뉴이름, value : 투표수
		
		// 초기화
		HashMap<String,Integer> map = new HashMap<>();
		map.put("치맥",0);
		map.put("떡볶이",0);
		map.put("곱창",0);
		map.put("불고기",0);
		map.put("햄버거",0);
		map.put("오징어물회",0);
		
		Scanner sc = new Scanner(System.in);
		// 메뉴선택(반복)
		
		while(true) {
			System.out.print("선택메뉴 음식 명 입력하세요.(종료는 end 입력) -> ");
			String menu = sc.nextLine();
			if(menu.equals("end")) break;
			
			if(!map.containsKey(menu)) { // map의 key값에 menu입력문자열이 없으면
				System.out.println("없는메뉴를 입력하셨습니다.");
				continue;
			}
			
			// 입력받은 menu의 value값을 가져오기 -> +1 하기 -> 저장
			int temp = map.get(menu);
//			++temp;
//			map.put(menu, temp);
			map.put(menu, ++temp); // 증가하고 put해야하기때문에 ++이앞임
		}
		
		System.out.println("투표 종료합니다.");
		System.out.println(map);
		System.out.println("최대 득표수 : " + Collections.max(map.values())); // 가장큰 value
		System.out.println("참고 : " + Collections.max(map.keySet())); // 가장큰 key
		// Entry<key,value>를		
		sc.close();
	}

}
