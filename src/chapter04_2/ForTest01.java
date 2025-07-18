package chapter04_2;

public class ForTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//반복문 교육 
		System.out.println("---------------------------------------------");
		
//		for(;;) {  } for문의 기본 양식 , 초기값-조건식(비교연산자)-증강식
		
		int a = 0;  //초기화식
		
		for(int i = 0 ; i <= 5 ; i++) { // for(초.조.증)
			System.out.println("안녕하세요");
			System.out.println("i값 :"+ i );
		}
		System.out.println("---------------------------------------------");
		//0부터100사이의 짝수만 출력 하시오
		for(int i = 0 ; i <= 100 ; i=i+2) {
			System.out.println("i값 : "+ i );
		}
		System.out.println("---------------------------------------------");
		//1부터100사이의 짝수만 출력 하시오
		for(int i = 1 ; i <= 100 ; i=i+2) {
			System.out.println("i값 : "+ i );
		}System.out.println("---------------------------------------------");
		
		
		int total = 0;
		int kor = 95;
		int eng = 80;
		int math = 70;
		// 누적식 
		total = total + kor; // total=95
		total = total + eng; // total=175
		
		
		//1부터 100까지의 모든 수의 합을 구하시오.
		
		int sum = 0;
		for(int i = 1 ; i <= 100 ; i++ ) {
			sum += i;     // sum = sum + i;
		}
		System.out.println("sum의 값 : " + sum);
		System.out.println("---------------------------------------------");
		
		// 1~100까지의 짝수만 출력

		for(int i = 1 ; i <=100 ; i++){
			if( i % 2 == 0 ) {
				System.out.println("i값 : "+ i );
			}
		}			
			// 1~100까지의 홀수만 출력
		for(int i = 1 ; i <=100 ; i++){
			if( i % 2 != 0 ) {
				System.out.println("i값 : "+ i );
			}
		}
		
//		System.out.println("---------------------------------------------");
//		// 5 에서 0 까지 1씪 줄어드는 증강식
//		for( int i = 5; i >= 0 ; i-- ) {
//			System.out.println("i 값 : " + i );
//		}

			// 위와 같은 형식에 중간에 멈추는법
		for( int i = 5; i >= 10 ; i-- ) {
			if( i == -1 ) {
			break; // for문이나 while문 같은 반복문을 강제종료;
			}
			System.out.println("i 값 : " + i );
		} 

}
}
