/*
 * 	문자열
 * 	 String => 문자열을 저장 => 관리 / 제어
 * 						  저장 방법 메소드
 * 
 * 		1) 저장
 * 			String s = "";
 * 			------------- 일반 변수와 동일하게 사용
 * 			String s = new String(""); => 새로운 메모리를 생성후 저장
 * 			-------------- 저장 문자열은 제한이 없다
 * 		2) 제어 => 자바에서 제공한 메소드
 * 		   	***equals() : 문자열 자체 비교, 대소문자 구분
 * 		   	***length() : 문자열의 갯수
 * 			***indexOf() / lastIndexOf() => 찾기 (위치) => index번호
 * 									  => 없는 경우 -1
 * 			***trim() / strip : 좌우의 공백 제거
 * 					 JDK11
 *유니코드 => 일부 제한 / 더 넓게 지원
 *			toUpperCase() / toLowerCase()
 *			     대문자 변환 / 소문자 변환
 *			concat() : 문자열 결합 (거의 사용 빈도가 없다) => +
 *			***replace() : 문자 / 문자열 변환
 *
 *			***startsWith() : 앞의 문자열이 같은 경우
 *			endsWith() : 뒤의 문자열이 같은 경우
 *			***contains() : 포함
 * 
 * 			***valueOf() : 모든 데이터형을 문자열 변경
 * 			format() : 형식에 맞게 문자열 변환
 * 
 * 			***split() : 지정된 문자를 잘라서 배열에 저장
 * 
 * 			***subString() : 문자열을 자르는 경우에 사용
 * 			subString(int start) : 인덱스 번호가 start부터 나머지 전체
 * 			subString(int start, int end) : 인덱스 번호가 start부터 시작 end -1가지 자른다
 */
public class 문자열_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello Java";
		int aa = s.indexOf("b");
		String ss = "";
		if(aa == -1) {
			System.out.println("찾는 문자열이 없습니다.");
		} else {
			ss = s.substring(s.indexOf("b") + 1);
		} 
		System.out.println(ss);
		
		s = "                       Hello Java ";
		System.out.println(s.trim());
		System.out.println(s.strip());

	}

}
