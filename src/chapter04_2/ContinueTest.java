package chapter04_2;

public class ContinueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int i = 1 ; i <= 10 ; i++) {
			if ( i % 2 == 0){
				continue;
			}   // continue 반복문 중 특정조건에 부합한 경우에만 실행 아닐땐 직전문장으로 되돌아가기
				// i를 2로 나누었을때 0이 되면 T로 continue에서 거르고 
				// ==0이 되지않는 숫자만 실행
			System.out.println(i);
		}
	}

}
