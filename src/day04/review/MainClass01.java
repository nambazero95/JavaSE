package day04.review;

public class MainClass01 {
	public static void main(String[] args) {

		MainClass01.hello(); // static 클래스명, 메소드명() 호출한다.
		hello(); // 같은 클래스 안이면 바로 호출 가능

		printName("피카츄");

		printName("피카츄", 25);

		String name = getName("꼬부기");

		String evName = getEvolution("꼬부기");
		System.out.println("evName : " + evName);

		String[] names = { "피카츄", "라이츄", "파이리", "꼬부기" };
		names = getNames(names);

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}

// 인자 x 리턴 x 실행하고 끝내는 메소드
	public static void hello() {
		System.out.println("Hello");
	}

	// 인자(매개변수) O 리턴 x 메소드
	public static void printName(String name) {
		System.out.println("이름 : " + name);

	}

	// 오버로딩 인자 o 리턴 x 메소드
	public static void printName(String name, int age) {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}

	// 오버로딩 인자 o 리턴 o 메소드
	public static String getName(String name) {
		System.out.println("이름 : " + name);
		return name;
	}

//오버로딩 인자 o 리턴 o 메소드
	public static String getEvolution(String name) {
		if (name.equals("꼬부기")) {
			name = "어니부기";
		}
		return name;
	}

	// 가변인자 o 리턴 o 메소드
	public static String[] getNames(String[] names) {
		names[0] = "잠만보";
		return names;
	}

}
