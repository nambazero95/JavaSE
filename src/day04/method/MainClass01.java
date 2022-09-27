package day04.method;

import day04.mypac.Car;

/*
 * [[메소드 (method)]]
 * 	어떤 특정 작업을 수행하기 위한 명령문의 집합.
 * 
 *  접근제어 (정적) 반환타입 메소드 이름 ( 매개 변수 ) [ // 선언부
 *  	명령문 // 구현부
 *  	return 반환값
 *  }
 * 
 */
public class MainClass01 {
 public static void main(String[] args) {
	// Car 객체 생성하기
	 Car car1 = new Car();
	 Car car2 = new Car();
	 
	 car1.drive();
	 car1.startEngine();
	 
	 car1.drive();
	 
	 System.out.println("car2 입니다");
	 car2.drive();
	 car2.startEngine();
	 car2.drive();
	 
	 boolean result = car2.getIsEngineStarted();
	 System.out.println("result : " + result);
	 
	 int resultNum = car2.sum(10,5);
	 System.out.println("resultNum : "+ resultNum);
}
}
