/*
 * 	전체 => for / while 주력
 * 		   do~while 형식 / 실행 순서
 */
public class 반복문_do_while_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("========== for ==========");
		// 화면 UI / 배열 처리 / 컬렉션 처리
		//          ----------------- 여러개 데이터를 한번에 저장하는 공간
		// 갯수를 아는 경우에 주로 사용
		for(int i=1;i<=10;i++) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n========== while ==========");
		int i = 1;
		// 갯수를 모르는 경우 (가변)
		// ***파일 입출력 / ***데이터베이스 / 네트워크 서버
		while(i<=10) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println("\n========== do~while ==========");
		i = 1;
		// 게임 / 로그인 처리 => while
		// 반드시 1번 이상 수행 
		do {
			System.out.print(i + " ");
			i++;
		} while (i<=10);
	}

}
