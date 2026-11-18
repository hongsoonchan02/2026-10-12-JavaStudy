package com.sist.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 *    => 문자
 *    : 사용처 = 웹 / 다른 컴퓨터와 연결, 읽거나 쓰기에 데이터량이 많은 경우에 효율적
 *    BufferedWriter : 빠르게 문자 저장
 *      write(String)
 *      newLine()
 *      close()
 *    BufferedReader : 네트워크 (웹) => 메모리 읽기 / 파일 읽기 => 빠르게 문자 읽기
 *                     ----------
 *      read()
 *      readLine() : 한줄씩 읽기
 *      close()
 *    -------------
 *    => 바이트
 *    BufferedInputStream
 *    BufferedOutputStream
 */
public class Buffered_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 키보드 입력값 읽기
		try {
			// BufferedReader => 키보드 / 웹 / 파일
			// ==> byte 단위로 들어온다 => byte => char 변환
			// InputStreamReader
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("입력 : ");
			String msg = br.readLine(); // 무조건 String => 한줄씩 읽을 수 있다.
			System.out.println(msg);
		} catch(Exception e) {
			e.printStackTrace();
		} 
		// 2. 파일 읽기
		// 3. 웹에서 데이터 읽기
	}

}
