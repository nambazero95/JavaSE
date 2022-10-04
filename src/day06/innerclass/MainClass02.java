package day06.innerclass;

import day06.innerclass.mypac.MyUtil;

public class MainClass02 {
	public static void main(String[] args) {
		// MyUtil 클래스 안에 있는 HelloPrinter  클래스 객체 생성
		MyUtil.HelloPrinter p = new MyUtil().new HelloPrinter();
		
//		MyUtil u = new MyUtil();
//		MyUtil.HelloPrinter p = u.new HelloPrinter();
				
		p.printHello();
		
		MyUtil.Calculator c = new MyUtil.Calculator();		
		
		c.calc(10, 20);
	}
}
