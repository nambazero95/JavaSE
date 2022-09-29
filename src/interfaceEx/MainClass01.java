package interfaceEx;

import interfaceEx.mypac.AKWeapon;
import interfaceEx.mypac.weapon;

/*
 * 
 * [[ 인터페이스 (interface) ]]
 * 
 *  추상 메소드만 있다.
 *  상수선언까지 허용.
 *  
 *  뼈대를 만들어 준다.
 *   사용방법 - class  가 아닌 interface로 선언한다.
 * 
 */
public class MainClass01 {
public static void main(String[] args) {
	AKWeapon ak  = new AKWeapon();
	ak.attack();
	ak.attacksky();
//	ak.NAME = "abcd";
	System.out.println(ak.NAME);
	ak.autoAttack();
	
	// 다형성
	Weapon ak2 = new AkWeapon();
	
	ak2.attack();
	//ak2.autoAttack();
	
	AKWeapon ak3 = (AKWeapon)ak2;
	ak3.autoAttack();
}
}
