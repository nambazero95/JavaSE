package day02.basic;

/*
 * 성적 
 * result = 75  변수선언 
 * 
 * 90점 이상이면 수
 * 90미만 80점 이상이면 우
 * 80미만 70점 이상이면 미
 * 70미만 60점 이상이면 양
 * 나머지 가
 * 
 * 성적 : 미
 */
public class MainClass09 {
	public static void main(String[] args) {
		int score = 75;
		String result = null;
		
		if(score >= 90) {
			result = "수";
		}else if(score >= 80) {
			result = "우";
		}else if(score >= 70) {
			result = "미";
		}else if(score >= 60) {
			result = "양";
		}else {
			result = "가";
		}
		System.out.println("성적 : " + result);
	}

}









