package interfaceEx.mypac;

public class HandPhone implements Phone{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		   System.out.println("전화를 걸어요!");
	}

	@Override
	public void receive() {
		// TODO Auto-generated method stub
		System.out.println("전화를 받아요!");
	}
		public void sendMsg() {
			System.out.println("문자를 보내요!");
		}
}
