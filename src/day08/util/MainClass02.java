package day08.util;
/*
 * [[ Calendar Class ]] 
 * 
 * 
 * 
 * 
 */

import java.util.Calendar;

public class MainClass02 {
public static void main(String[] args) {
	// Calendar calNow = Calendar.getInstance();
	
	int year = calNow.get(Calendar.YEAR); // 년
	
	System.out.println("올 해:" + year);
	
	int month = canNow.get(Calendar.MONTH) + 1; // 0월 부터라 +1 해줘야 한다.
	
	System.out.println("월 : " month);
	
	int day = calNow.get(Calendar.DAY_OF_MONTH); // 일
	System.out.println("일 : " + day);
	
	int hour = calNow.get(Calendar.HOUR);
	int hour = calNow.get(Calendar.MINUTE);
	int hour = calNow.get(Calendar.SECOND);
	
	System.out.println(hour + " : " + min + " : " + sec);
	
}
}
