package day02.basic;

/*
 * 여러가지 형태의 if문 사용하기
 * 
 */
public class MainClass08 {
	public static void main(String[] args) {
		int num = 4;
		// 어떤 수를 3으로 나눈 나머지를 출력하기
		if(num%3==0) {
			System.out.println("나머지가 0 입니다.");
		}else if(num%3==1) {
			System.out.println("나머지가 1 입니다.");
		}else {
			System.out.println("나머지가 2 입니다.");
		}
	}

}
