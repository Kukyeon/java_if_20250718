package chapter04;

public class IfTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 점수가 90점 이상이면 수, 80점 이상이면 우...60점 미만이면 가 를 출력하는 프로그램을... if, lese, if 로 가능
		
		// 점수가 70점 이상이면 합격을 출력하는 프로그램을...   ( 결론 if문은 yes or no 만 가능 )
		
		
		int score = 65;
		
		if ( score >= 70 ) {
			System.out.println("합격\n" + "축하합니다.");
		} else {
			System.out.println("불합격\n" + "축하합니다.");  // if식 안에 결과값이 아닐때 else 로 다른 내용 출력
		}
		
		System.out.println("축하합니다.");
		
//		if ( score <= 70 ) {
//			System.out.println("불합격\n"  + "다음기회에");
//		}
	};
	
};
