package day06.exception;
/*
 *  [[ 익셉션 (Exception) : 예외 ]]
 *  - 프로그램 실행도중 발생되는 에러에 해당된다.
 *  - 예외 처리 ; 예외가 발생되었을 떄 이를 처리하는 것
 *  
 *    처리하는 방법 : 
 *    
 *    try {
 *    		실행문장;
 *    
 *    
 *    }  catch (익셉션 클래스명 변수명) {
 *    해당 예외가 발생했을 경우 실행할 문장;
 *    
 *    }
 * 
 * 
 * 
 * 
 * 
 */

public class MainClass {
	public static void main(String[] args) {
		// 정수값을 저장할 지역변수 초기화 하기
		int num1 = 10;
		int num2 = 0;
		int result = 0;
		
//		result = num1/num2;
		
//		if(num2 !=0) {
//			result = num1/num2;
//			System.out.println("실행결과 : " + result);			
//		} else {
//			System.out.println("어떠한 수를 0으로 나눌 수 없습니다.");
//		}
//		
		try {
			result = num1/num2;
			System.out.println("실행결과 : " + result);
		} catch (Exception ae) {
			System.out.println("어떠한 수를 0으로 나눌 수 없습니다.");
			ae.printStackTrace();
		}
	}
}
