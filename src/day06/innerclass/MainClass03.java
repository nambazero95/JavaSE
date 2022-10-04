package day06.innerclass;

import day06.innerclass.mypac.weapon

/*
 * [[ 익명클래스 ( Anonymous Class)]]
 * 
 * 클래스 선언과 객체생성을 동시에 하는 이름없는 클래스
 * 주로 버튼 이벤트 핸들러나, 안드로이드 이벤트에 사용된다.
 * 일회용 클래스 이다.
 * 
 * 
 * 
 * 
 */
public class MainClass03 {
	public static void main(String[] args) {
		
		weapon w = new Weapon() {
			
			
			
			@Override
			public void attack() {
				System.out.println("공격!");
			}
		};
		
		w.attack();
	}

}
