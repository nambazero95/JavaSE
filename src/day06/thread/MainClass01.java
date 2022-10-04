package day06.thread;

import day06.thread.mypac.MyThread;

/* [[ Thread ]]
 *  메인 메소드가 추가되서 같이 동작한다고 생각하면 됩니다.
 *  병렬 실행
 *  비동기 실행
 * 
 * [[ 새로운 스레드를 시작시키는 방법 ]]
 * 
 * 1. Thread 객체를 생성할 수 있는 클래스를 정의한다.
 * 2. 정의한 클래스를 이용해서 객체를 생성
 * 3. 생성된 객체의 start() 메소드를  호출한다. 
 * 	  run()  메소드 아님
 * 
 * 
 * 
 */

public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("메인 스레드 시작");
		MyThread tread1 = new MyThread();
		tread1.start();
		
		try {
			Thread.sLeep(2000);			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("메인스레드가 종료가 됩니다.");
	}
}
