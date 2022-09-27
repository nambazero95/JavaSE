package day03.basic;
/*
 * 
 * 
 * 미완성
 * 
 * 
 */
public class MainClass03 {
	public static void main(String[] args) {
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				if (i < 4) { //위에 * 모양
					if (j + i < 7 / 2) {
						System.out.println(" ");						
						} else if (j - i > 7 / 2) {
							System.out.println(" ");						
						} else { 
							System.out.println("*");
						}
						
					} else {  // 아래* 모양
						if(j < i-3) {
							System.out.println(" ");
						}else if (i+j > 9) {
							System.out.println(" ");
						}else {
							System.out.println("*");
						}
					}
				}
			System.out.println();
			}
		}
	}

