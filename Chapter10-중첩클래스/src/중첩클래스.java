/*
 * 
 * 		중첩 클래스
 * 		
 * 		=> 장점
 * 			: 다른 클래스와 연결해서 사용하기 쉽다 
 * 			: 코드의 복잡성을 줄일 수 있다.
 * 
 * 		=> 단점
 * 			: 객체 생성이 어렵다
 * 
 * 		종류
 * 			***1. 멤버 클래스
 * 					쓰레드 + 윈도우 / 서버 (서버 + 통신)
 * 					서버
 * 						= 교환
 * 						= 통신 ==> Thread
 * 			***2. 익명의 클래스 : 상속없이 오버라이딩을 수행
 * 			3. 지역 클래스 : CallBack => 사용빈도는 거의 없다.
 * 
 * 
 */

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class 중첩클래스 extends JFrame {
	
	JTable table;
	DefaultTableModel model;
	
	public 중첩클래스() {
		
		String[] col = {"아이디", "이름", "성별"};
		String[][] row = new String[0][3];
		
		model = new DefaultTableModel(row, col) {

			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
			
		};
		table = new JTable(model);
		
		JScrollPane js = new JScrollPane(table);
		
		add("Center", js);
		
		setSize(350, 300);
		setVisible(true);
		
		String[] arr = {"admin", "홍길동", "남자"};
		model.addRow(arr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 중첩클래스();
		
	}

}
