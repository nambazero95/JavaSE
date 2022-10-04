package day06.thread.mypac;

public class MyThread extends Thread {
	
	@Override
	public void run() {
		System.out.println("MyThread 만의 작업을 해요!!");
		try {
			Thread.sLeep(2000);			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("MyThread 가 종료가 됩니다.");
	}

}
