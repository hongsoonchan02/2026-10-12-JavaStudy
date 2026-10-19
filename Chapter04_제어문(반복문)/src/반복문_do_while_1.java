// => 데이터베이스 / 파일 입출력 => while
// => 나머지 => for
// => if / if~else
// float = Spring AI

/*
 * do ~ while
 * 1) 한번 이상을 반드시 수행 할때 사용 => 거의 사용 빈도가 없다
 * 2) 형식
 * 		초기값 ----------------1
 * 		do
 * 		{
 * 			실행문장 -----------2
 * 			증감식 ------------3
 * 		}while(조건문); --------4
 */
public class 반복문_do_while_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c = 'A';
		do {
			System.out.print(c + " ");
			c++;
		} while (c <= 'Z');

		System.out.println("\n====== 뒤에서 부터 출력 =======");
		c = 'Z';
		do {
			System.out.print(c + " ");
			c--;
		} while (c >= 'A');
	}

}
