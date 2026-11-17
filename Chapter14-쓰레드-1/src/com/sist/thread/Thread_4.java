package com.sist.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread_4 {
	// 직원 3명 ==> 작업 5개 (음식 요청)
	// 3-3개 ==> 반환 3명 => 2개
	//          ------- 1명 정지
	public static void main(String[] args) {
		// 직원 3명 ==> 4페이지 
		ExecutorService pool = Executors.newFixedThreadPool(3);
		
		// 주문한 음식 제작
		String[] food = {"볶음밥", "짜장면", "울면", "탕수육", "짬뽕"};
		for(int i = 0; i < 5; i++) {
			
			int no = i;
			pool.execute(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					System.out.println(
							Thread.currentThread().getName()
							+ ": 주문" + food[no] + "요리 시작"
							);
					try {
						Thread.sleep(2000);
					} catch(Exception e) {
						// 쓰레드 종료
						Thread.currentThread().interrupt();
					}
					System.out.println("주문" + food[no] + "완료");
				}
			});
			
		}
		// 새로운 주문 중단
		pool.shutdown();
	}
}
