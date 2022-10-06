package day07.accessmodifier;

import day07.accessmodifier.mypac.Phone;

/*
 *  [[ 접근 제어자 ]]
 *  
 *  piblic - 모든 클래스에서 접근 가능
 *  protected - 같은 패키지 또는 상속 관계에서 접근가능.
 *  default - 같은 패키지 접근가능
 *  private - 같은 클래스 안에서만 접근가능
 *  
 * 
 * 
 * 
 * 
 */
public class MainClass01 {
	public int num = 10;
	
	 public static void main(String[] args) {
		Phone p1= new Phone();
		
		p1.setName("일반 무선전화기");
		
		String name = p1.getName();
		System.out.println(name);
	}
}
