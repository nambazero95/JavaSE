package day04.method;

import day04.mypac.MathTest;

/*
 * 오버 로딩 ( over loading )
 * 
 * 중복 메소드에 매개변수를 달리하여 중복 (동일메소드명) 선언할수 있다.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

public class MainClass03 {
	public static void main(String[] args) {

		MathTest mt = new MathTest();

		int result = mt.sum(5, 3, 2);
		System.out.println("합계 :" + result);

		int[] nums = { 5, 3, 2, 6 };
		int result2 = mt.total(nums);

		System.out.println("총 합계 : " + result2);

		int result3 = mt.sum(1, 2);
		System.out.println("result3 : " + result3);

		int result4 = mt.sum("7", "3");
		System.out.println("result4 : " + result4);

	}
}