package day03.var;
/*
 * [[변수 (variable)]]
 * 
 * 1. 타입의 따른 변수
 *    기본형 - 예약어 소문자로 시작하고 값을 가지고 있다.
 *    		8가지 -int , char , long , byte , float , double , boolean , short
 *    참조형 - 대문자로 시작을 하고 주소 값을 가지고 있다.
 *    		기본형 외 나머지 전부!!!
 *    		ex) String
 * 2. 선언 위치에 따른 변수
 * 		전역변수(global 변수) - 클래스 안에 선언 포함.
 * 		지역변수 - 메소드 또는 생성자{} 괄호 안에 선언.
 * 3. 정적/동적 변수
 * 
 * 
 */
public class MainClass01 {
	
	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println(car1.color);
		car1.drive();
	}
}

class Car {
	// 전역 변수
	String color = "red";
	
	public void drive() {
		int speed = 80;
		System.out.println(speed + "속도로 달려요!");
	}
		public void autopilot() {
			drive();
			System.out.println(color + "색 차가" );
			System.out.println("자율주행을 해요!");
		}
		
	}
	
