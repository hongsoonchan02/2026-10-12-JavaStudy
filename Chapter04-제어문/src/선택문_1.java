/*
 * 		선택문 : 다중조건문을 단순화 시킨 제어문
 * 			   = 한개만 수행이 가능
 * 			   = 네트워크에 주로 사용 / 웹 메뉴 처리
 * 		       = 다중 조건문은 범위 이용 / 선택문을 한개의 값을 이용
 * 			   = 형식)
 * 					switch(정수 | 문자 | 문자열)
 * 					{
 * 						1) 정수
 * 						case 1:
 * 							처리문장
 * 							break;
 * 						case 2:
 * 							처리문장
 * 							break;
 * 						2) 문자
 * 						case 'A':
 * 							처리문장
 * 							break;
 * 						3) 문자열
 * 						case "LOGIN":
 * 							처리문장
 * 							break;
 * 						----------------------------
 * 						default: 없는 case가 있는 경우 => else
 * 					}
 * 				
 * 				-------------------------------------------------
 * 				switch(no) { => no = 3
 * 				
 * 				case 1: ===> 레벨이 중복되면 안된다
 * 					문장1
 * 					break;
 * 				case 2:
 * 					문장2
 * 					break;
 * 				case 3:
 * 					문장3
 * 					break;
 * 				case 4:
 * 					문장4
 * 					break;
 * 				case 5: case 6: => if (no == 5 || no == 6)
 * 					문장6
 * 					break;
 * 				default:
 * 					문장5
 * 				}
 * 				---------------------------- JDK 14 (JDK 21)
 * 				switch (no) {
 * 				
 * 				case 1 -> 실행문장
 * 					  --- break를 포함한다
 * 				case 2 -> 실행문장
 * 				case 3 -> 실행문장
 * 				case 4 -> 실행문장
 * 				case 5, 6 -> 실행문장
 * 				default -> 실행문장
 * 				}
 * 
 * 		12 1 2 => 겨울
 * 		3 4 5 => 봄
 * 		6 7 8 => 여름
 * 		9 10 11 => 가을
 */
public class 선택문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = (int)(Math.random() * 12) + 1;
		
//		if (month == 12 || month == 1 || month == 2) {
//			
//			System.out.println(month + "는(은) 겨울입니다.");
//		} else if (month >= 3 && month <= 5) {
//			
//			System.out.println(month + "는(은) 봄입니다.");
//			 
//		} else if (month >= 6 && month <= 8) {
//			
//			System.out.println(month + "는(은) 여름입니다.");
//	
//		} else if (month >=9 && month <= 11) {
//			
//			System.out.println(month + "는(은) 가을입니다.");
//		}
		
//		switch (month) {
//		
//		case 3: case 4: case 5:
//			System.out.println(month + "는(은) 봄입니다.");
//			break;
//		case 6: case 7: case 8:
//			System.out.println(month + "는(은) 여름입니다.");
//			break;
//		case 9: case 10: case 11:
//			System.out.println(month + "는(은) 가을입니다.");
//			break;
//		case 12: case 1: case 2:
//			System.out.println(month + "는(은) 겨울입니다.");
//			break;
//		default:
//			System.out.println("없는 달입니다.");
//			
//		}
		
		switch (month) {
		
		case 12, 1, 2 -> System.out.println(month + "는(은) 겨울입니다.");		
		case 3, 4, 5 -> System.out.println(month + "는(은) 봄입니다.");
		case 6, 7, 8 -> System.out.println(month + "는(은) 여름입니다.");
		case 9, 10, 11 -> System.out.println(month + "는(은) 가을입니다.");
		default -> System.out.println("없는 달입니다.");
		
		}
	}
}
