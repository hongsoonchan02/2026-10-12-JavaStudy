
public class 배열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alpha = new char[10]; // 선언
		for(int i=0; i<alpha.length; i++) {
			
			alpha[i] = (char)((Math.random()*26) + 65);
			
			for(int j=0; j<i; j++) {
				
				if(alpha[j] == alpha[i]) {
					
					i--;
					break;
				}
			}
			
		}
		
		for(char c : alpha) {
			
			System.out.print(c + " ");
			
		}

	}

}
