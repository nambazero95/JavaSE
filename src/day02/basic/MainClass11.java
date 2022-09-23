package day02.basic;

/*
 * switch ~ case 
 * 
 */

public class MainClass11 {
	public static void main(String[] args) {
		
		char ch = 'w';
		
		switch(ch){
		case 'a':
			System.out.println("좌측으로 이동!");
			break;
		case 's':
			System.out.println("아래로 이동!");
			break;
		case 'w':
			System.out.println("위로 이동!");
			break;
		case 'd':
			System.out.println("우측으로 이동!");
			break;
		default :
			System.out.println("공격!!!!!!");
			break;
		}
		
	}

}
