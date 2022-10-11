package day08.util;

import java.util.Iterator;
import java.util.Random;

// 1 ~ 45 의 숫자 중에서 중복되지 않는 수 6객을 뽑아내는 예제
public class LorttoMain {
	public static void main(String[] args) {
		// 정수를 저장할 수 있는 배열 객체 생성하기 45개의 방이 있는 방
		int[] lottoNum = new int[45];

		// 반복문 돌면서 각가의 방에 순서대로 숫자 넣기
		for (int i = 0; i < 45; i++) {
			lottoNum[i] = i + 1;

		}

		// 랜덤한 수를 발생 시키기 위해서 random 객체 생성하기.
		Random ran = new Random();

		// 반복문 돌면서 임의 배열에 저장된 숫자를 섞기(suffle)
		for (int i = 0; i < 45; i++) {
			// 0 ~ 44 사이의 정수중 임의의 수 얻어오기.
			int changeIndex = ran.nextInt(45);

			// 바꿔야 할 인덱스 값과 현재 인덱스의 값 자리 바꾸기
			int tmp = lottoNum[i];
			lottoNum[i] = lottoNum[changeIndex];
			lottoNum[changeIndex] = tmp;
		}

		// 배열에서 0 ~ 5번쨰 인덱스에 저장된 값 출력해 보기
		for (int i = 0; i < 6; i++) {
			System.out.print(lottoNum[i] + " / ");

		}

	}
}
