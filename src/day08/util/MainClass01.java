package day08.util;

import java.util.Random;
import java.util.Scanner;

/*
 *  [[ scanner ]]
 *  
 * 
 * 
 * 
 * 
 * 
 */
public class MainClass01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("문자열 입력 >>>");
		// 키보드로 문자열 입력받기.
		String str = scan.next();
		
		System.out.println("입력받은 값 : " + str);
		
		Random ran = new Random();
		// 0 ~ 9 사이 정수중 난수 발생 시키기
		int ranNum = ran.nextInt(10);
		
		System.out.println("난수 : " + ranNum);
		
		double result = Math.pow (2, 2);
		
		System.out.println("2의 2제곱 : " + result);
		
		
		
	}
}
