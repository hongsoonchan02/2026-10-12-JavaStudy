// 열거형은 상수명
enum Day {
	월요일,
	화요일,
	수요일,
	목요일,
	금요일,
	토요일,
	일요일
}
public class 열겨형_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day today = Day.금요일;
		System.out.println(today);
		System.out.println(today == Day.월요일);

	}

} 
