package koreait.day05;

import java.util.Arrays;
import java.util.Scanner;
  // 작성자 : 안치영
public class C28_IntArrayEx {
	
	/*
	 * 1. int 배열크기 5를 선언. 이름은 nums
	 * 2. 배열요스의 값은 사용자 입력으로 저장한다.
	 * 3. 입력된 값의 합계, 평균을 구한다
	 * 4. 입력된 값의 최대값, 최소값을 구하는 메소드를 만든다.
	 *           ㄴmaxOfArray     ㄴ minOfArray : 인자는 int배열, 반환값 int
	 * 	 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		double avg;
		int number; 
		int[] nums = new int[5];
		
		for(int i = 0; i< nums.length; i++) {
			System.out.print("요소 값 입력 >> ");
			number = sc.nextInt();
			nums[i] = number;
			sum += nums[i];
		}
		avg = (double)sum / nums.length;
		System.out.println(Arrays.toString(nums));
		System.out.println("입력한 요소 합 : " + sum);
		System.out.println("입력한 요소 평균 : " + avg);
		System.out.println();
		
		System.out.println("최종 max : " + maxOfArray(nums));
		System.out.println("최종 min : " + minOfArray(nums));
		/*
		int sum = 0;
		int avg = 0;
		int[] nums = new int[5];
		int max = maxOfArray(nums);
		int min = maxOfArray(nums);
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print((i+1) + "번째 정수를 입력 하세요 >> ");
			nums[i] = sc.nextInt();
			System.out.println("입력된 값은 " + nums[i] + "입니다.");
			sum += nums[i];
			System.out.println("입력된 값의 합계는 : " + sum + "입니다.");
		}
		System.out.println("================================");
		avg = sum / 5;
		System.out.printf("입력된 값의 평균은 : " + avg + "입니다.\n");
		System.out.println("배열 nums 최대값 max = " + max);
		System.out.println("배열 nums 최대값 min = " + min);
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
		
		System.out.printf("최대값은 : %d 최소값은 : %d", max, min);
		*/
		sc.close();
	}
	// max,min 변수를 각각 배열의 0번요소값으로 초기화 한다.
	// 배열요소 1번부터 마지막요소까지 max,min 과 순서대로 비교해서 
	// max가 그 값보다 작으면(min이 그값보다 크면) max(min)값을 배열요소 값으로 변경
	// -> 비교가 끝나면 최종 max,min 결정
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
