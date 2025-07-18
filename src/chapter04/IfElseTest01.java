package chapter04;

public class IfElseTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 점수가 90점 이상이면 수, 80점 이상 90점 미만이면 우, 70점 이상80점 미만이면 미 를 출력하는 프로그램을... if, lese, if 로 가능
		// 60점 이상 70점 미만이면 양 , 60점 미만이면 가 를 출력하는 코드
		
		int score = 60;
		
		if(score >= 90) {
			System.out.println("수");
		} else if( score >= 80 ) {
			System.out.println("우");
		}  else if( score >= 70 ) {
			System.out.println("미");
		}  else if( score >= 60 ) {
			System.out.println("양");
		}  else if( score <= 60 ) {  // 마지막은 결국 남은 값이기에 if 를 제외해도 무방
			System.out.println("가");
		}
		
		System.out.println("수고하셨습니다.");
		
		
		
		// value 값이 10이상 20미만이면 통과를 출력하시오
		int value = 15;
		
		if(value >= 10 & value < 20) {
			System.out.println("통과");
		}
		
	};

};
