package day06.thread;

import day06.thread.mypac.CountTread;

public class MainClass04 {
	public static void main(String[] args) {
		CountTread cThread = new CountTread();
		
		cThread.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i*100);
			try {
				Thread.sLeep(1000);
			} catch (InterruptedException e) {
				
			}
		}
		System.out.println("메인스레드가 종료가 됩니다.");
	}

}
