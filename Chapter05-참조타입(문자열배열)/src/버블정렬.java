// 인접한 수끼리 비교 => 마지막부터 고정 

import java.util.Arrays;

public class 버블정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		// 초기화
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100) + 1;
		}
		
		System.out.println("정렬전 : " + Arrays.toString(arr));
		
		Arrays.sort(arr);

//		for(int i=0; i<arr.length-1; i++) {
//			for(int j=0; j<arr.length-1-i; j++) {
//				if(arr[j]>arr[j+1]) {
//					int temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//				}
//			}
//		}
		System.out.println("정렬후 : " + Arrays.toString(arr)); 
	}

}
