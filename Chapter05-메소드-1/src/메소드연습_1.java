// 1 ~ 10까지 출력하는 메소드 구현
// 1 ~ 10까지 합을 구하는 메소드
public class 메소드연습_1 {
	static void print() {
		for(int i=1; i<=10; i++) {
			System.out.print(i + " ");
		}
	}
	
	// A ~ Z
	static void printAlpha() {
		for(int i=1; i<=26; i++) {
			System.out.print((char)(i+64) + " ");
		}
	}
	// 1 ~ 10까지의 합을 구한다
	static int sum() {
		int sum = 0;
		for(int i=0; i<=10; i++) {
			sum += i;
		}
		return sum;
	}
	// 1~n까지 합을 구한다
	// 매개변수가 다르면 다른 메소드로 인식한다.
	static int sum(int n) {
		int sum = 0;
		for(int i=0; i<=n; i++) {
			sum += i;
		}
		return sum;
	}
	static char change(char c) {
		return (char)(c + 32);
	}
	// 문자열을 보내고 거꾸로 출력
	static void reverse(String msg) {
		for(int i=msg.length()-1; i>=0; i--) {
			System.out.print(msg.charAt(i));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print();
		System.out.println();
		printAlpha();
		System.out.println();
		int s = sum();
		System.out.println(s);
		System.out.println(sum(100));
		System.out.println(change('A'));
		reverse("Hello Java");
	}

}
