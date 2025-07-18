package chapter04;



public class IfTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//주사위를 굴립니다. 3이 나오면 한글로 "삼이 나왔습니다." 를 출력하는 프로그램
		
		// System.out.println ((int) (Math.random() * 6) + 1);  // System.out.println(number);  
		// math.random 은 0~1 사이에 소수점 16자리까지 가진 수를 랜덤으로 추출해주는 라이브러리
		
		int number = ((int) (Math.random() * 6) + 1);
		
		if (number == 1 ) {
			System.out.println("일이 나왔다."); 
		}else if(number == 2) {
			System.out.println("이가 나왔다."); 
		}else if(number == 3) {
			System.out.println("삼이 나왔다."); 
		}else if(number == 4) {
			System.out.println("사가 나왔다."); 
		}else if(number == 5) {
			System.out.println("오가 나왔다."); 
		}else {
			System.out.println("육이 나왔다."); 
		}
		
		
	}

}
