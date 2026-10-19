// 알파벳 => 난수 => 대문자 / 소문자
public class 선택조건문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int type = (int)(Math.random() * 2);
		char c = ' ';
		if(type == 0) {
			c = (char)((Math.random()*26) + 65);
		} else {
			c = (char)((Math.random()*26) + 97);
		}
//		System.out.println(c);
		if (c >= 'A' && c <= 'Z') {
			System.out.println(c + "는(은) 대문자입니다.");
		} else {
			System.out.println(c + "는(은) 소문자입니다.");
		}
	}

}
