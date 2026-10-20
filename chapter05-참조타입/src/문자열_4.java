// 자르기
/* 
 * 	******X100000 String substring(int index) MVC
 * 	String subString(int start, int end)
 * 
 * 	int indexOf(찾는 문자) => 앞에서부터 찾기
 * 	int lastIndexOf(찾는 문자) => 뒤에서부터 찾기
 * 	---------------------- index번호 확인
 */
public class 문자열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "Hello Java!!";
		//            01234567891011
		System.out.println(msg.substring(6));
		System.out.println(msg.substring(0, 5)); // end - 1
		System.out.println(msg.substring(6, 10));
		
		String s = "자바.java";
		System.out.println(s.substring(s.indexOf(".") + 1));
		String path = "c:\\javaDev\\MainClass.java";
		System.out.println(path.substring(path.lastIndexOf("\\") + 1));
		System.out.println(path.lastIndexOf("\\"));
		

	}

}
