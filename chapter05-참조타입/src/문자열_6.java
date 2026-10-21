import javax.swing.JFrame;
import javax.swing.JTextField;

public class 문자열_6 extends JFrame {
	
	JTextField tf = new JTextField();
	public 문자열_6() {
		
		add("North", tf);
		tf.setText(String.valueOf(100));
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 문자열_6();
	}

}
