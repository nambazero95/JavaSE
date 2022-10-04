package day06.exception;
/*
 *  finㅁlly - 예외가 발생해도 반듯이 실행보장되는 블럭
 *  
 * 
 * 
 * 
 * 
 * 
 * 
 */

import java.util.Random;

public class MainClass03 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		try {
			System.out.println("DB를 연결합니다.");
			System.out.println("ran.nextInt()/0");
			System.out.println("DB 관련 작업을 합니다.");
			
		} catch (Exception e) {
			System.out.println("예외가 발생했습니다.");
		} finally { // 반듯이 실행이 보장되는 블럭
			System.out.println("DB 연결을 해제합니다.");
		}
	}
}
