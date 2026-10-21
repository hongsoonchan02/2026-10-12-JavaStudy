// 배열 => 몇개가 필요한지 확인
// 배열 => 선언
// 배열 => 초기화
// 배열 => 출력
// 배열 => 저장된 데이터 변경

import java.util.Arrays;

public class 배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[10];
		// 값을 첨부
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = (int)(Math.random()*100) + 1;
		}
		
		// 출력
		System.out.println("========= 일반 for =========");
		for(int i=0; i<arr.length; i++) {
			
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\n============== for-each ==============");
		// 값을 변경할 수 없다 => 출력용으로만 사용
		for(int i : arr) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n============= toString ==============");
		System.out.println(Arrays.toString(arr));
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i : arr) {
			
			if(i>max) {
				max = i;
			}
			if(i<min) {
				min = i;
			}
		}
		
		System.out.println("Max : " + max);
		System.out.println("Min : " + min);
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] == max) {
				System.out.println("Max의 인덱스 : " + (i + 1));
			}
			
			if(arr[i] == min) {
				System.out.println("Min의 인덱스 : " + (i + 1));
			}
		}

	}

}
