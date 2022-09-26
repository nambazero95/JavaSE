package day03.array;

/*
 * 배열 출력 연습!
 */

public class MainClass03 {
	public static void main(String[] args) {
		String[] names = { "피카츄", "라이츄", "나옹", "울먹이", "질퍽이" };
		// 배열의 내용 출력해보기
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		// 확장 for 문
		for (String tmp : names) {
			System.out.println(tmp);
		}
	}
}
