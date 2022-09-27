package day04.method;

import day04.mypac.MathTest;

public class MainClass02 {
	public static void main(String[] args) {
		
		MathTest mt = new MathTest();
		
		// 원의 넓이 값 변수 선언
		double result = mt.getArea(10);
		
		System.out.println("result : " + result);
	}
}
