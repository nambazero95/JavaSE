package interfaceEx.mypac;

public class SmartPhone implements Phone {

	@Override
	public void call() {
		System.out.println("페이스톡을 걸요!");
	}

	@Override
	public void receive() {
		System.out.println("페이스톡을 받아요!");
		
	}
	public void doInternet() {
		System.out.println("인터넷을 해요!");
	}
}
