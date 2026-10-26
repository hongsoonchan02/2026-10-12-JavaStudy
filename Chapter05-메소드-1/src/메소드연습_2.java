// 정수를 5개를 보내고 최댓값 가지고 온다
// 정수 5개를 보내고 정렬된 데이터 받기
/*
 * 		데이터형
 * 		  기본형 / 참조형
 * 				배열 => []
 * 				클래스
 * 
 */

import java.util.Arrays;

public class 메소드연습_2 {
	static int max(int[] arr) {
		int max = 0;
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
			
		}
		return max;
	}
	
	static int[] sort(int[] arr) {
		Arrays.sort(arr);
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 20, 30, 40, 50};
		int m = max(arr);
		System.out.println(m);
		System.out.println(Arrays.toString(sort(arr)));

	}

}
