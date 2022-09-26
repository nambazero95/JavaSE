package day03.array;

/*
 * 2중배열
 * 
 *  1  2  3  4  5  6  7
 *  8  9  10 11 12 13 14
 *  15 16 17 18 19 20 21
 *  22 23 24 25 26 27 28
 *  29 30 31 32 33 34 35
 *  36 37 38 39 40 41 42
 *  43 44 45 46 47 48 49
 *  
 *  1. 2중배열선언하고 
 *  2. for 문으로 값을 1~49까지 위모양으로 넣으세요
 *  3. 출력은 지그재그 
 *  출력순서는 1 8 2 3 9 15 22 16 10 4 5 11 17 23 29 36 37 43 44 38 32 ... 48 42 49
 *  
 */

public class MainClass04 {
	public static void main(String[] args) {
		int[][] nums = new int[4][3];
		int n=nums.length;
		System.out.println(n);
		nums[0][0]=1;
		nums[0][1]=2;
		nums[0][2]=3;
		nums[1][0]=4;
		nums[1][1]=5;
		nums[1][2]=6;
		nums[2][0]=7;
		nums[2][1]=8;
		nums[2][2]=9;
		nums[3][0]=10;
		nums[3][1]=11;
		nums[3][2]=12;
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(nums[i][j]+"  ");
			}
			System.out.println();
		}
		
	}
	
	

}
