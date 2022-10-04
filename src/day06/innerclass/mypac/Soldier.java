package day06.innerclass.mypac;

public class Soldier {
	private Weapon w;
	
	public Soldier (weapon w) {
		this.w = w;
		w.attack();
	}
}
