package day05.abstractEx;

import day05.extendsEx.mypac.Woman;

/*
  * 
  * [[추상클래스 (Abstract Class)]]
  * 
  * 구현되지 않은 추상 메소드가 존재한다.
  * 정의만하고 구현 x
  * 
  * 미완성 클래스 
  * 미완성 메소드 가지고있다
  * 반듯이 오버라이딩! 해야한다.
  * 상속받고 반듯이 오버라이딩! 해야한다.
  * 만드는 방법 :  class 예약어 앞에 abstract 를 붙여준다.
  * 
  * 
  * 
  * 
  * 
  */
public class MainClass01 {
	public static void main(String[] args) {
	Woman w = new Woman();
	w.dance();
	w.say();
	}

}
