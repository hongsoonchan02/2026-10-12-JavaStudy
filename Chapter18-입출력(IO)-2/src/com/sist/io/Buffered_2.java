package com.sist.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

/*
 *    1. 최적화 : 속도 (실행)
 *       테스트 : Junit / Playwieght
 *    2. 가독성 : 누구나 쉽게 볼 수 있게 => 유지보수
 *       소스를 간결하게 ... 
 *    3. 견고성 : 비정상 종료 => 예외처리
 *    ------------------------------------
 *    => 트러블 슛팅 => 문제 해결 능력
 *    => 디자인 패턴 / 알고리즘
 *    ------------------------------------
 *    Buffered~ : 속도를 빠르게 만드는 방법
 *    ------ 임시 공간 : 데이터를 모아서 한번에 처리
 *    => 자바 : 문법 / 라이브러리 메소드 
 *    => 간결성 : 메소드 = 반복 제거 / 기능별 나누기 / 재사용
 */
public class Buffered_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
//			FileReader fr = new FileReader("c:\\javaDev\\movie.txt");
//			int i = 0; // 한글자씩 읽어 온다
//			long start = System.currentTimeMillis();
//			while((i = fr.read()) != -1) {
//				System.out.print((char)fr.read());
//			}
//			long end = System.currentTimeMillis();
//			fr.close();
//			System.out.println("총 수행시간 : " + (end - start) + "MS");
			BufferedReader br = 
					new BufferedReader(new InputStreamReader(
							new FileInputStream("c:\\\\javaDev\\\\movie.txt")));
			long start = System.currentTimeMillis();
			while(true) {
				
				String msg = br.readLine();
				if(msg == null) {
					break;
				}
				System.out.println(msg);
			}
			long end = System.currentTimeMillis();
			br.close();
			System.out.println("총 수행시간 : " + (end - start) + "MS");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
