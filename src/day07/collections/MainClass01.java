package day07.collections;

import java.util.Stack;

/*
 * [[ Stack Class ]]\
 * 
 * - 스택의 구조 : 선입후출 형태 
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class MainClass01 {
	public static void main(String[] args) {
		// Stack 객체 생성하기
		Stack<String> stack = new Stack<String>();
		

		// 생성한 객체에 자료 저장하기
		stack.push("피카츄");
		stack.push("라이츄");
		stack.push("파이리");
		
		// 현재 저장하고 있는 데이터 갯수를 출력
		System.out.println("데이터의 갯수 : " + stack.size());
		
		// 데이터 하나씩 빼오기
//		System.out.println("1:" +stack.pop());
//		System.out.println("2:" +stack.pop());
//		System.out.println("3:" +stack.pop());
		
		// 가장위에 있는 데이터를 출력하려면
		System.out.println("가장위에 있는 데이터 : " + stack.peek());
		
		while(!stack.empty()) {
			String name = stack.pop();
			System.out.println("pop 한 데이터 : " + name);
		}
		
	}
}
