/*
 * 	1. 반복 제어문
 * 	   반복문 안에서 사용 (제외 : break => switch)
 * 
 * 		break : 반복문을 중단
 * 		continue : 반복문에 제외 => 건너뛴다
 * 
 * 		주의점)
 * 			  break, continue => 밑에는 소스 코딩이 불가능
 * 
 */
public class 반복제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("======== break ========");
		for(int i=1;i<=10;i++) {
			if(i==5) {
				break;
			}
			System.out.print(i + " ");
		}
		System.out.println("\n======== continue ========");
		for(int i=1;i<=10;i++) {
			
			if(i==5) {
				
				continue;
			}
			System.out.print(i + " ");
		}
		// continue => for (증가식) / while, do~while(조건식) => 무한 루프
//		int i=1;
//		while(i<10) {
//			
//			if(i==5) {
//				continue;
//			}
//		System.out.println(i + " ");
//		i++;
//		}
		
		System.out.println("======== continue ========");
		int i=1;
		do {
			
			if(i==5) {
				continue; 
			}
			System.out.print(i + " ");
			i++;
		} while(i<=10);
		
	}
}
