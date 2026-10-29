/*
 * 		캡슐화 : 데이터 보호할 목적으로 사용
 * 	
 * 		접근 지정어
 * 		1) private : 자신의 클래스
 * 		2) default : 자신의 클래스, 같은 폴더(패키지)
 * 		3) protected : 자신의 클래스, 같은 폴더(패키지), 같은 폴더 + 상속 
 * 		4) public : 자신의 클래스, 같은 폴더(패키지), 같은 폴더 + 상속, 모든 클래스
 * 
 * 		private : 인스턴스 변수
 * 		public : 생성자, 메소드, 클래스
 * 		-------------------------
 * 		public을 사용하는 인스턴스 = 윈도우 button / TextField
 * 
 * 		형식)
 * 			변수
 * 			=> 접근지정어 테이처형 변수명
 * 			   제어어 : static / final
 * 			메소드
 * 			=> 접근지정어 리턴형 메소드명(매개변수)
 * 			   제어어 : static / final / abstract
 * 			생성자
 * 			=> 접근지정어 클래스명()
 * 			클래스
 * 			=> 접근지정어 class ClassName
 * 			   제어어 : final / abstract / static 
 */

import lombok.Data;
@Data
class Sawon {
	
//	@Getter
//	@Setter
	private int sabun;
//	@Getter
//	@Setter
	private String name;
	
	protected String job;
	
	String dept;
	
	public int pay;
	
//	public int getSabun() {
//		return sabun;
//	}
//	public void setSabun(int sabun) {
//		this.sabun = sabun;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
	
	
	 
}
public class 데이터보호_캡슐화 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon s = new Sawon();
		s.job = "과장";
		s.dept = "개발부";
		s.pay = 4500;
		s.setSabun(1);
		s.setName("홍길동");
		
		System.out.println(s.getName());
		System.out.println(s.getSabun());
		System.out.println(s.job);
		System.out.println(s.dept);
		System.out.println(s.pay);

	}

}
