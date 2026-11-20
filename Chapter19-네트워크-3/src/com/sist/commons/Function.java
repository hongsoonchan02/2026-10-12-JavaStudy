package com.sist.commons;
// 내부 프로토콜 => 약속
// 100 => Function.LOGIN
public class Function {
	
	public static final int LOGIN = 100; // 이미 접속자
	public static final int MYLOG = 110; // 본인
	public static final int CHAT = 200;
	public static final int EXIT = 300; // 남아 있는 사람
	public static final int MYEXIT = 310; // 실제 나가는 사람
	public static final int UPDATE = 400;
	// INFO / SEND
	
}
/*
 *     자바 네트워크
 *       서로 다른 컴퓨터에서 실행되는 프로그램 => 네트워크를 통해서 데이터를 주고 받는 기술
 *       1) 클라이언트 역할
 *          서버에 서비스 요청하는 프로그램
 *          => 웹 브라우저, 모바일, 윈도우 창
 *          서버에 접속 요청
 *          => URL 주소
 *          서버에 데이터 전송
 *          서버로부터 데이터 수신
 *          받은 데이터를 화면에 출력
 *          Socket s = new Socket("서버 IP", 서버 PORT)
 *          ------ 서버와 통신할 수 있는 기기 => 핸드폰
 *          => jdbc:oracle:thin:@IP:1521
 *          => SQL을 보내고 실행 결과 => 화면
 *       2) 서버 역할
 *          오라클 : SQL을 보냄 => 실행 결과를 보내주는 역할
 *          웹 서버 : 파일 요청 => 파일 조회 => 브라우저 전송
 *       	클라이언트 요청을 기다린다 / 서비스를 제공 
 *       	클라이언트 접속대기
 *          클라이언트 접속허용
 *          클라이언트 데이터 받기 => 처리된 결과값 보내기
 *          => 저장 / 찾기 / 송신 / 수신 / 요청 기능
 *       3) 스레드 역할
 *          클라이언트가 독립적으로 통신이 가능하게 만든다 / 지연이 없이 만든다
 *          
 *       서버 구동
 *          |
 *       클라이언트 접속 : connection
 *          |
 *       클라이언트 요청 => 이벤트 : actionPerformed
 *          |
 *       서버 수신 => Client : run()
 *          |
 *       서버 처리 => Client : run()
 *          |
 *       서버 응답 => Client : run()
 *          |
 *       클라이언트 출력 => run()
 * 
 */