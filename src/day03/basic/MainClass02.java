package day03.basic;

/*
 * for 반복문 연습 
 * 
 * [주말숙제 !!]
 * 
 * 
1번
      *
     **
    ***
   ****
  *****

2번
   *
  ***
 *****
*******

3번
    
   *
  ***
 *****
*******
 *****
  ***
   *





 * 
 * 
 * 
 */

public class MainClass02 {

	public static void main(String[] args) {
		for (int i = 0; i < 7; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}			
			System.out.println();
		}
	}
}
