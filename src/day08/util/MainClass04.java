package day08.util;

/*
 *   [[ 래퍼 클래스 (Wrapper Class ]]
 *   8개의 기본 타입에 해당하는 데이터를 객체로 포현하기.
 *   boolean, byte, short, int, long, float, double, char
 * 
 * 
 * 
 * 
 * 
 */
public class MainClass04 {
	public static void main(String[] args) {
		// 기본형 변수
		boolean b = true;
		Boolean wb1 = new Boolean(true);
		Boolean wb2 = new Boolean(false);

		Boolean wb3 = Boolean.valueOf(true);

		Integer number1 = new Integer(10);
		Integer number2 = new Integer(10);
		int number3 = 10;
		
		System.out.println("래퍼클래스 == 기본형 변수 : " + (number1 == number3)); // ture
		System.out.println("래퍼클래스 == 기본형 변수 : " + (number1 == number2)); // false
		
		System.out.println(System.identityHashCode(number1));
		System.out.println(System.identityHashCode(number2));
		
		System.out.println("래퍼클래스,equals(래퍼클래스): " + (number1.equals(number2))); //false
		
		
		// 문자열 값 정수형 변한
		int iNum1 = Integer.parseInt("100");
		int iNum2 = Integer.valueOf("100");
		
		System.out.println(iNum1);
		System.out.println(iNum2);
		
		
		
		
	}
}
