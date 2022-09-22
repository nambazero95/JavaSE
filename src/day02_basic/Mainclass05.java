package day02_basic;
/*
 * 대입 연산자
 *  =, *=, /=, -=, %=
 * 
 * 
 */
public class Mainclass05 {
  
	public static void main(String[] args) {
		int num = 10;
		
		num = num + 10;
		System.out.println(num);
		
		num += 10; // num = num + 10; 같다 
		System.out.println(num);
		
		num = num - 10;
		num -= 10;
		
		System.out.println(num);
		
		
	}
}
