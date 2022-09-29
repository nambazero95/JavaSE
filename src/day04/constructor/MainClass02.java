package day04.constructor;

public class MainClass02 {
	public static void main(String[] args) {
		// Member mb = new Member();

		Member mb2 = new Member(1, "피카츄", "신촌");
		System.out.println(mb2.getName());
	}
}
