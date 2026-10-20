import java.util.Scanner;

public class 반복제어문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor = 0, eng = 0, math = 0;
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("국어 입력 : ");
			kor = scan.nextInt();
			if(kor<0 || kor>100) {
				System.out.println("잘못된 입력입니다!!");
				continue;
			}
			break;
		}
		
		while(true) {
			System.out.print("수학 입력 : ");
			math = scan.nextInt();
			if(math<0 || math>100) {
				System.out.println("잘못된 입력입니다!!");
				continue; // 처음부터 다시 수행
			}
			break; // 종료한다
		}
		
		while(true) {
			System.out.print("영어 입력 : ");
			eng = scan.nextInt();
			if(eng<0 || eng>100) {
				System.out.println("잘못된 입력입니다!!");
				continue; // 처음부터 다시 수행
			}
			break; // 종료한다
		}
		
		System.out.println("======== 결과값 =========");
		System.out.println("국어 점수 : " + kor);
		System.out.println("수학 점수 : " + math);
		System.out.println("영어 점수 : " + eng);
		System.out.println("총점 : " + (kor + eng + math));
		System.out.printf("평균 : %.2f\n", (kor + eng + math) / 3.0);
		
		int avg = (kor + eng + math) / 3;
		char score = 'A';
		switch(avg / 10) {
		
		case 10, 9 -> score = 'A';
		case 8 -> score = 'B';
		case 7 -> score = 'c';
		case 6 -> score = 'D';
		default -> score = 'F';
		}
		System.out.println("학점 : " + score + "학점");
		
		

	}

}
