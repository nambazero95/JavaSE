package day02.basic;

/*
 * [[연산자]]
 * 1.산술연산자
 * 	+, -, *, /, %
 * 
 */

public class MainClass01 {
	
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		
		// 두수의 합을 구해서 sum 이라는 int 형 변수에 대입하기
		int sum = num1 + num2;
		System.out.println("num1+num2="+sum);
		
		//두수의 곱을 구해서 multiply 라는 변수에 대입하기
		int multiply = num1*num2;
		System.out.println("num1*num2="+multiply);
		
		// 9를 5로 나눈 나머지를 result라는 변수에 담기
		int result= 9%5;
		System.out.println("9%5=" + result);
		
		// 나누기
		int divide = 10/3;
		System.out.println("10/3=" +divide);
		
		double doubleNum = 10/3.0;
		System.out.println("10/3.0="+doubleNum);
	}

}














