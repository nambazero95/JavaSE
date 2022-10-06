package day06.thread.mypac;

public class InterThread implements Runnable {

	@Override
	public void run() {
		System.out.println("InterThread 가 시작되었습니다.");
		
		 try {
			 Thread.sleep(2000); // 2초쉰다
			 
		 } catch (Exception e) {}
		 System.out.println("InterThread 가 종료됩니다..");
		
	}

}
