package day01.summary;

/*

객체란 
	물리적으로 존재하거나 추상적으로 생각할 수 있는 것 중에서 
	자신과 다른것을 식별 가능한것
	예) 실제 존재하는 - 학생, 회원, 자동차, 휴대폰
		추상적인것 - 생산, 주문, 배송 등
	모두 객체가 될 수 있다.
	
	최소한의 프로그램 단위
	
	객체를 만들기 위해 주형(붕어빵틀) 또는 설계도 같은 Class가 필요하다.


클래스 구조
class 클래스명 {
	생성자()
	변수
	메소드
}
 
객체구성요소
	속성 => 변수
	기능 => 메소드(함수)
	
Ctrl + F11
  */


public class MainClass {
	public static void main(String[] args) {
		
		System.out.println("메인메소드 입니다.");
		
		Car car1 = new Car();
		System.out.println("모델 : " + car1.model);
		System.out.println("color : " + car1.color);
		
		car1.drive();
		car1.autopilot();
	}
}

class Car {
	String model = "테슬라Y";
	String color = "red";
	
	// 드라이브 함수
	public void drive() {
		System.out.println("드라이브를 합니다.");
	}
	
	// 자율주행
	public void autopilot() {
		System.out.println("자율주행을 합니다.");
	}
}











