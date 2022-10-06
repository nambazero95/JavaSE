package day07.collections;

import java.util.Vector;

/*
 *  [[ Vector Class ]]
 *  
 *  - ArrayList 와 동일하다.
 *  - 스레드 동기화를 지원한다.
 *  - ArrayList 보다 무겁다.
 * 
 * 
 * 
 * 
 * 
 */
public class MainClass03 {
	public static void main(String[] args) {
	// Vecter 객체 생성하기
	 Vector<String> vec = new Vector<>();
	 
	 // 생성한 객체에 값 저장하기
	 vec.add("피카츄");
	 vec.add("라이츄");
	 vec.add("파이리");
	 
	 for (String name : vec) {
		 System.out.println("name : " + name);
		 
	 }
	 String name1 = vec.get(0);
	 System.out.println(name1);
}
}
