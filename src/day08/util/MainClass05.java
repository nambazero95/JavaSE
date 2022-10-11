package day08.util;
/*
 *  [[ String 불변의 객체 ]]
 *  
 *  1. 메모리 절약 
 *  2. Security
 *  3. Thread Safe
 *  
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class MainClass05 {
	public static void main(String[] args) {
		String str1= "abc"; // 불변
		String str2= "abc"; // 불변
		String str3= new String("abc"); // 새로운 메모리
		
		

		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		
		
		
	}
	
}
