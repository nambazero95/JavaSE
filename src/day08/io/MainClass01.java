package day08.io;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
 * [[ I/O - Input / Output ]]
 * 
 *  입력 / 출력 패키지
 *  
 *  
 * 
 * 
 * 
 * 
 */
public class MainClass01 {
public static void main(String[] args) {
	// File 객체 생성
	File f = new File ("C:\\");
	
	// c 드라이브 하위에 있는 모든 디렉토리 및 파일을 반환한다.
	String[] list = f.list();
	
	// Caledar 객체를 현재 시스템 날짜로 생성한다.
	Calendar c = Calendar.getInstance();
	
	for(String temp : list) {
		// c 드라이브의 하위 디렉토리 및 파일을 File 객체로 생성한ㄷ.
		File f2 = new File(f, temp);
		// 1970년  1월 1일 부터 현재 수정한 날짜를 밀리세컨드로 반환
		long lastMod = f2.lastModified();
		
		// 현재 파일 또는 디렉토리의 마지막 수정한 날짜를 Calnedar 
		// 객체로 다시 설정한ㄷ.
		c.setTimeInMillis(lastMod);
		
		// SimpleDateFormat 객체를 활용해서 날짜를 포맷을 정한다.
		SimpleDateFormat s = new SimpleDateFormat("yyyy년MM월dd일 a hh:mm");
		
		//  format (Date d) : string
		// Calendar 객체를 Date 객체로 변환하는 메소드 getTime()
		String today1 = s.format(c.getTime());
		
		if(f2.isDirectory()) {
			System.out.println(f2.getName() + "(디렉토리) - ");
			System.out.println(today1);
		} else {
			System.out.println(f2.getName() + "(파일)-");
			System.out.println(today1);
			
		}
	
	}
}
}
