package day04.mypac;

public class MathTest {

	public double getArea(int r) {
		final double PI = 3.14159; // 원주율

		// 원의 넓이
		double area = PI * r * r;

		return area;
	}

	// 매개변수 3개짜리 Sum 메소드
	public int sum(int a, int b, int c) {
		int resultNum = a + b + c;
		return resultNum;
	}

	// 매개변수 2개짜리 문자열 Sum 메소드
	public int sum(int a, int b) {
		int resultNum = a + b;
		return resultNum;
	}

	// 매개변수 2개짜리 문자열 Sum 메소드
	public int sum(String a, String b) {
		int resultNum = Integer.parseInt(a) + Integer.parseInt(b);
		return resultNum;
	}

	public int total(int[] nums) {
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			result += nums[i];
		}
		return result;
	}
}