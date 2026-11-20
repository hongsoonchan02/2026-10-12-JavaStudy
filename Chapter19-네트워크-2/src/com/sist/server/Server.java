package com.sist.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class Server implements Runnable {

	private Vector<Client> waitVc = new Vector<Client>();
	private ServerSocket ss;
	private final int PORT = 3355;
	
	// 1. 서버 구동
	public Server() {
		
		try {
			ss = new ServerSocket(PORT); // bind => ip / port
			// 대기 => listen
			System.out.println("Server Start...");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// 접속시 처리
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while(true) {
				Socket s = ss.accept(); // 클라이언트 접속시에만 호출
				Client client = new Client(s);
				waitVc.add(client); // 등록
				// 각자 접속자마다 통신 시작
				client.start();
			}
		} catch(Exception e) {
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server server = new Server(); // 서버 구동
		new Thread(server).start(); // 접속시 승락
	}
	// 서버 ====== 클라이언트
	//      연결
	//      통신
	// 오라클 서버 / 웹 서버 / Redis / Kafka => 서버
	// 접속자 마다 통신이 가능
	class Client extends Thread {

		// 독립적인 통신 => 접속자 IP => Socket
		Socket s;
		OutputStream out;
		BufferedReader in;
		
		public Client(Socket s) {
			try {
				this.s = s;
				out = s.getOutputStream(); // 응답하는 통로 => 송신
				in = new BufferedReader(
						new InputStreamReader(s.getInputStream())); // 요청 받는 통로 => 수신
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		 
		// 접속자마다 통신이 가능하게 ..
		public void run() {
			try {
				while(true) {
					// 접속자의 요청을 받는다.
					String msg = in.readLine();
					// 모든 사람에게 전송한다
					for(Client c : waitVc) {
						// c => 접속한 모든 사람
						c.out.write((msg + "\n").getBytes());
					}
				}
			} catch(Exception e) {
				
			}
			
		}
	}

}
