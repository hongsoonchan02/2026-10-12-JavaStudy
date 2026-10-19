import java.io.FileReader;

public class 반복문_while_실무_1 {
	
	public static void main(String[] args) throws Exception{
		
		FileReader fr = new 
				FileReader("C:\\javaDev\\javaStudy\\Chapter04_제어문(반복문)\\src\\반복문_while_6.java");
		
		int i = 0; // 읽은 글자 => 정수로 읽는다
		while((i = fr.read()) != -1) // -1 END OF FILE / EOF
		{
			
			System.out.print((char)i);
		}
	}

}
