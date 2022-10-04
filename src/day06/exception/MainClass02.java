package day06.exception;

import java.util.Random;

public class MainClass02 {
public static void main(String[] args) {
	int num1 = 10;
	int num2 = 0;
	int result = 10;
	Random ran = null;
	
	try {
		
		ran.nextInt(); // null 에러
		
		result = num1 / num2; // / by zero
		
		System.out.println("-----------------------------");
		
	} catch (Arit)
	
	catch (NullPointException ne) {
		System.out.println("null 포인트에 익셉션이 발생하였습니다.");
	} e.printStackTrace();
	} catch (Exception e) {
		System.out.println("에외가 발생하였습니다.");
	}
}
