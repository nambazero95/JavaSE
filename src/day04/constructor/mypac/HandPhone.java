package day04.constructor.mypac;

public class HandPhone {
	public String model;

	// 디폴트 생성자
	public HandPhone() {
		this.model = "갤럭시";
	//System.out.println("디폴트 생성자가 호출되어씁니다.");
	}
	// 오버로딩 생성장
	public HandPhone (String name) {
		this.model = name ;
	//	System.out.println("생성자로"+ "name +"이 전달되었습니다.");
		
	
	}
	}
