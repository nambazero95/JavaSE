package day07.collections;

import java.util.ArrayList;

/*
 *  [[ ArrayList Class ]]
 *  - 가변 배열이다.
 *  - 인덱스 값이 있다.
 * 
 *  <> 제네릭
 * 
 * 
 */
public class MainClass02 {
	public static void main(String[] args) {
		// ArrayList 객체 생성하기
		ArrayList<String> list = new ArrayList<String>();
		
		// 데이터 저장하기
		list.add("피카추"); // 0 (index)
		list.add("라이츄"); // 1
		list.add("파이리"); // 2
		
		// 저장된 데이터의 특정 인덱스 값 얻어오기
		String str = list.get(0);
		System.out.println("str : " + str);
		
		// 저장된 데이터에서 특정 인덱스 내용 삭제하기
		list.remove(2);
		
		int num = list.size();
		System.out.println("저장된 데이터의 갯수:" + num);
		
		for(String name : list) {
			System.out.println("name : " + name);
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println("list["+i+"] : " + list.get(i));
		}
	}
}
