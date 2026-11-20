package com.sist.client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 *    서버     클라이언트
 *   Socket   Socket
 *     |        | 서버 정보 (ip, port)
 *  클라이언트 정보 (ip, port)
 *  ------------------------------------ TCP : 신뢰성 좋다 / 속도가 늦다
 *  
 *  = TCP
 *     => 전화기 : 채팅, 이메일, FTP ....
 *  = UDP
 *     => 우편 : 손실 => 동영상, 스트림서버, 게임
 *     
 *  = RTCP : 화상 채팅 / CCTV => JMF
 *     | => WebSocket
 *     
 *  -----------------------------------------
 *   1. 자바에서 지원하는 윈도우창
 *      JFrame => 일반 윈도우창
 *      JWindow => 타이틀바가 없다 : 광고 / 스타트 화면
 *      JDialog => 경고 / 설정 ...
 *      JPanel => 혼자서 화면을 띄울 수 없다
 *                JFrame / JWindow에 첨부
 *                => 컴포넌트 여러개를 묶어서 윈도우에 올릴때 사용
 *   2. 컴포넌트
 *      버튼 : JButton, JCheckBox, JRadioButton
 *            JMenu
 *            => ActionListener
 *      입력 : JTextField / JTextArea (메모장)
 *                         | JTextPane (word pad)
 *                         | JEditPane (브라우저)
 *            | JPasswordField
 *      목록 : JTable / JList / JTree
 *      기타 : JLabel
 */
public class ChatMain extends JFrame implements ActionListener, Runnable {
	
	// 채팅 문자열 출력
	JTextArea ta;
	JTextField tf;
	JButton b1, b2;
	String name;
	JScrollBar bar;
	///////// 네트워크 연결 관련
	Socket s; // 서버와 연결되는 기기
	BufferedReader in; // 서버에서 응답한 값 읽기
	OutputStream out; // 서버로 요청시에 사용
	// => 포함
	/*
	 *    데이터베이스
	 *    --------
	 *    Connection : Socket
	 *    PreparedStatement : BufferedReader / OutputStream
	 *    ResultSet :
	 *    
	 *    => 추상화
	 *    
	 *    HttpServletRequest / HttpServletResponse
	 */
	public ChatMain() {
		
		ta = new JTextArea();
		ta.setEditable(false);
		JScrollPane js = new JScrollPane(ta);
		bar = js.getVerticalScrollBar();
		tf = new JTextField(25);
		b1 = new JButton("접속");
		b2 = new JButton("종료");
		
		JPanel p = new JPanel();
		p.add(tf);
		p.add(b1);
		p.add(b2);
		
		add("Center", js);
		add("South", p);
		
		setSize(450, 400);
//		setVisible(true);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		tf.addActionListener(this); // Enter
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		
		new ChatMain();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == b2) {
			
			dispose(); // 윈도우 메모리 해제
			System.exit(0);
		} else if(e.getSource() == b1) {
			
			name = JOptionPane.showInputDialog("이름 입력 : ");
			try {
				// 서버 연결
				s = new Socket("localhost", 3355);
				// 요청 위치 / 응답 위치
				out = s.getOutputStream();
				// 요청에 대한 응답값을 받는다
				in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			} catch(Exception ex) {
				ex.printStackTrace();
			}
			
			// 서버로부터 값을 읽어 온다
			new Thread(this).start(); // 서버에서 들어오는 값을 받아서 계속 출력
			// run() 호출
			tf.setEnabled(true);
			tf.requestFocus();
			b1.setEnabled(false);
		} else if(e.getSource() == tf) {
			
			String msg = tf.getText(); // 보내는 문자열 읽기
			if(msg.length() < 1) {
				return;
			}
			
			// 서버로 전송
			try {
				out.write(("[" + name + "]" + msg + "\n").getBytes());
				// 한줄 => readLine() => \n까지 읽기
			} catch(Exception ex) {
			}
			
			tf.setText("");
			tf.requestFocus();
		}
		
	}
	// 서버에서 응답한 결과값을 받아서 출력 => Thread
	// 클라이언트 => 본인
	// 서버 => 스레드 ====== 두개가 동시에 처리
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while(true) {
				// 서버로부터 값을 받는다
				String msg = in.readLine();
				// 받은 값을 TextArea에 출력
				ta.append(msg + "\n");
				bar.setValue(bar.getMaximum());
			}
		} catch(Exception e) {
			
			}
	}
}
