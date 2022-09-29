package day04.constructor;
/*
 * 
 *  DTO ( Data Transfer object) 
 *  VO (Value object)
 * 
 * 
 * 
 * 
 */
public class Member {
 
	// 멤버필드
	// 디폴트값 : 숫자형 0 , 객체형 참조형 null, boolean false
	private int num; // 회원번호
	private String name; // 이름
	private String addr; // 주소
	
	// 디폴트 생성자 - 생성자는 리턴이 없다.  개겣 생성되기 직전 실행.
	public Member() {
		System.out.println("디폴트 생성자가 호출되었습니다.");
	}
	//  생성자 오버로딩
	public Member (int num, String name, String addr) {
		// 멤버필드 초기화
		this.num = num; 
		this.name = name; 
		this.addr = addr; 
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}
	

