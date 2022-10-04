package day06.innerclass;
/*
 *  [[ 내부클래스 ( Inner Class ) ]]
 * 
 *  클래스 안에 또 다른 클래스 정의
 * 
 * 
 * 
 * 
 */

public class MainClass01 {
	public static void main(String[] args) {
		new InnerClass().doSomething()
	}
	
	static class InnerClass {
		public void doSomething() {
			System.out.println({"무언가를 해요!");
		}
	}
}
