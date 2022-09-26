package day03.var;


/*
 * [[변수(variable)]]
 * 
 * 1. 타입의 따른 변수
 * 		기본형 - 예약어 소문자로 시작하고 값을 가지고 있다.
 * 				ex) 8가지 boolean, byte, short, int, long, char, float, double  
 * 		참조형 - 대문자로 시작을하고 주소 값을 가지고 있다.
 * 				기본형 외 나머지 전부!!!
 * 				ex) String
 * 2. 선언 위치에 따른 변수
 * 		전역변수(global 변수) - 클래스 안에 선언. 
 * 		지역변수 - 메소드 또는 생성자 {} 괄호 안에 선언.
 * 3. 정적(static)/동적 변수
 *   	static - JVM  Static area 에 올라가는 변수.
 *      동적 - static 외 전부!!!
 * 
 */


public class MainClass02 {
	static String str1 = "전역변수";
	
	public static void local() {
		String str2 = "지역변수";
	}
	
	public static void main(String[] args) {
//		System.out.println(str1);
//		System.out.println(str2); 에러!! 다른메소드 지역변수 사용할수 없음.
		

		
	}
}












