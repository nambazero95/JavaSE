package day06.innerclass;

import day06.innerclass.mypac.Soldier;
import day06.innerclass.mypac.weapon;

public class MainClass04 {

	public static void main(String[] args) {
		Soldier s = Soldier(new weapon() { // 일회용 익명클래스

			@Override
			public void attack() {
				System.out.println(" 솔져 공격!");

			}

		});
	}

}
