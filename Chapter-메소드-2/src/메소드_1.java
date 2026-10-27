/*
 * 	메소드는 사용자 요청을 처리하기 위한 명령문의 집합
 * 		  ------------ 특정 작업 ---- = ;
 * 	=> 코드 재사용 / 기능 분리 (분업 처리)
 * 	=> 개발 (X) => 유지보수 목적
 * 	---------------------------------------------
 * 	매개변수 : 사용자가 요청한 값
 * 	리턴형 : 요청처리 결과값
 * 	----- 권장(동일) => 클 수도 있다
 * 	결과값을 넘겨주는 경우 : return 값
 * 							---
 * 	=> 정수 10개 => 합을 구해서 반환
 * 	   -------
 * 		매개변수 : int[]
 * 		리턴형 : int
 * 		return 합계값
 * 
 */

import java.util.Arrays;

public class 메소드_1 {
	// 합
	static int hap(int[] arr) {
		int sum = 0;
		for(int i : arr) {
			sum += i;
		}
		return sum;
	}
	// 최댓값
	static int max(int[] arr) {
		int max = 0;
		for(int i : arr) {
			if(max < i) {
				max = i;
			}
		}
		return max;
	}
	// 최솟값
	static int min(int[] arr) {
		int min = 100;
		for(int i : arr) {
			if(min > i) {
				min = i;
			}
		}
		return min;
	}
	// 평균
	static double avg(int[] arr) {
		
		return (double)hap(arr) / arr.length;
	}
	// 짝수의 갯수
	static int even(int[] arr) {
		int count = 0;
		for(int i : arr) {
			if(i % 2 == 0) {
				count++;
			}
		}
		return count;
	}
	// 홀수의 갯수
	static int odd(int[] arr) {
		int count = 0;
		for(int i : arr) {
			if(i % 2 == 1) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100) + 1; // 1~100
			// 배열 초기화
		}
		
		int sum = hap(arr);
		int max = max(arr);
		int min = min(arr);
		double avg = avg(arr);
		int even = even(arr);
		int odd = odd(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("합 : " + sum);
		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);
		System.out.println("평균 : " + avg);
		System.out.println("짝수의 갯수 : " + even);
		System.out.println("홀수의 갯수 : " + odd);
	}

}
