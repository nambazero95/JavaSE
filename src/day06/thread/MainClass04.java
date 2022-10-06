package day06.thread;

import day06.thread.mypac.Brother;
import day06.thread.mypac.Sister;
import day06.thread.mypac.Wallet;


public class MainClass04 {
 public static void main(String[] args) {
	// Wallet 객체 생성하기
	 Wallet wallet = new Wallet();
	 
	 // Sister = new Sister(wallet);
	 Sister sister = new Sister(wallet);
	 
	 // Brother 스레드 객체 생성
	 Brother brother = new Brother(wallet);
	 
	 // 각각의 객체를 이용해서 두개의 스레드 시작시키기
	 sister.start();
	 brother.start();
	 
	 System.out.println("메인스레드가 종료됩니다.");
}
}
