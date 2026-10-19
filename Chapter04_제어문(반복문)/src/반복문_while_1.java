/*
 * 	반복문
 * 		for : 화면 ui (web), 알고리즘(배열, 이차 for)
 * 			  반복 횟수 알고 있는 경우
 * 		while : Back-End
 * 				파일 제어 / 데이터베이스 / 네트워크
 * 				반복 횟수를 알 수 없는 경우
 * 				= 종료 시점 (break)
 * 				= 건너뛰기 (continue)
 * 		do~while : 한번을 반드시 실행이 되야 하는 경우
 * 				   사용 빈도 극히 드물다
 */
public class 반복문_while_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 초기값
		int i = 1;
		
		// 조건문
		while (i < 10) {
			// 반복 실행문장
			System.out.println(i + " ");
			// 증가식
			i++;
		}
		
		System.out.println("============ for ===========");
		
		for (i = 1; i < 10; i++) {
			
			System.out.println(i + " ");
		}
	}

}
