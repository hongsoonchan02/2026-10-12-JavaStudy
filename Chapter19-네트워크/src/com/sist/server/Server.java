package com.sist.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 *                 Request : 요청
 *   Client   -------------------->   Server
 *            <--------------------
 *                 Response : 응답
 *   1) 서버 실행
 *      ServerSocket ss = new ServerSocket(PORT);
 *      -----------------------------------------
 *       1. bind() => 개통 => 유심 (ip, port)
 *       2. listen() => 접근 대기상태
 *   2) 클라이언트 접근
 *      Socket socket = new Socket(서버IP, 서버 PORT);
 *      
 *   3) 서버가 연결 수락
 *      ss.accept() => 특이한 메소드 : 접속이 된 경우에만 호출
 *           | => 발신자 => Socket
 *      Socket s = ss.accept()
 *      ------ 클라이언트의 IP, PORT => 저장
 *      
 *   4) 데이터 송수신
 *      s.getInputStream() : => 클라이언트 메세지 읽기
 *      s.getOutputStream() : => 클라이언트로 전송
 *      
 *   5) 통신 종료
 *      s.close()
 *      
 *    Socket => 다른 컴퓨터와 연결하는 기기
 *   -----------------------------
 *    ServerSocket
 *    => 서버에서 클라이언트 접속 담당
 *       = 접속을 기다린다
 *       = 특정 포트를 사용
 *       = accept()를 연결 수락
 *   -----------------------------
 *    Socket
 *    => 실제 통신 담당
 *       = 서버와 클라이언트 연결
 *       = 읽기(요청받기)
 *       = 쓰기(요청하기)
 *       = 연결 종료
 *   -----------------------------
 *   웹(서버)                 브라우저
 *   오라클(서버)             자바응용프로그램(JDBC)
 *   서버 역할                클라이언트
 *   접속 대기                서버 접속
 *   연락 수락                데이터 전송
 *   데이터 전달               응답 출력
 *   ---------------------------------
 *   서버    ====> 식당
 *   클라이언트 ===> 손님
 *   IP     ====> 식당 주소
 *   PORT   ====> 식당 입구 번호
 *   Socket ====> 손님 <=> 식당 연결하는 통로
 */
public class Server implements Runnable {
	
	private ServerSocket ss;
	private final int PORT=11111;
	// 1. 서버 => 대기
	// 한 컴퓨터에서 서버는 한번만 수행
	public Server() {
		
		try {
			// bind => ip + port
			// listen => 대기
			ss = new ServerSocket(PORT);
			// 50명 최대
			System.out.println("Server Start...");
		} catch(Exception e) {
			
		}
	}
	// 클라이언트 접속 대기 / 에코 서버
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			
			try {
				// 접속시에 누가 접속했는지 확인 => Socket안에 IP
				Socket s = ss.accept();
				
				System.out.println("Client IP:" + s.getInetAddress().getHostAddress());
				System.out.println("Client PORT:" + s.getPort());
				// 서버는 고정 PORT
				// 클라이언트는 자동 생성 => 중복 X
				
				// 접속자의 메세지 받기
				BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
				// 접속자에게 응답
				OutputStream out = s.getOutputStream();
				
				String msg = in.readLine();
				System.out.println("받은 메세지 : " + msg);
				
				out.write(("서버입니다!! 받은 메세지 : " + msg + "\n").getBytes());
				
				
			} catch(Exception e) {
				
			}
		}
	}
    
	public static void main(String[] args) {
		
		Server server = new Server();
		new Thread(server).start();
	}
}
