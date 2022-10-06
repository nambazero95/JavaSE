package day06.thread;

import day06.thread.mypac.InterThread;

public class MainClass05 {
public static void main(String[] args) {
	//  Runnable 인터페이스를 구현한 객체를 생성한다.
	Runnable iThread = new InterThread();
	// 생성 객체를 Thread 객체를 생성하여 인자로 전달한다.
	Thread thread = new Thread(iThread);
	// Thread 객체의 start () 메소드를 호출하면 새로운 스레드가 시작된다.
	thread.start();
	System.out.println("메인 스레드가 종료 됩니다.");
}
}
