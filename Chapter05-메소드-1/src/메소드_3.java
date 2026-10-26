/* 메소드 호출 => 생명주기

 메소드는 반드시 종료후에 원상 복귀한다
	=> 메소드는 한개 기능만 수행하게 만든다
	=> 반복을 제거한다
	=> 구조적인 프로그램이 가능
*/
public class 메소드_3 {
	
	static void display() {
		System.out.println("display() 진입...");
		System.out.println("사용자 요청 처리...");
		System.out.println("사용자 요청에 대한 결과값을 넘겨준다");
	}
	
	static void process() {
		System.out.println("process() 진입...");
		System.out.println("사용자 요청 처리...");
		display();
		System.out.println("사용자 요청에 대한 결과값을 넘겨준다");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main 시작...");
		process(); // 메소드는 {} 종료 => 원상복귀한다 (호출한 위치로 다시 돌아온다)
		System.out.println("main 종료...");
		// main => 프로그램 시작 / 프로그램 종료

	}

}
