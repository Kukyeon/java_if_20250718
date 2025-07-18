package chapter04;

public class SwitchTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int number = ((int) (Math.random() * 6) + 1);
		
		switch(number) {
			case 1:
				System.out.println("일이 나왔다이.");
				System.out.println("11111111"); break;
			case 2:
				System.out.println("이가 나왔다이.");
				System.out.println("22222222");  break;
			case 3:
				System.out.println("삼이 나왔다이.");
				System.out.println("3333333333");  break;
			case 4:
				System.out.println("4가 나왔다이.");
				System.out.println("4444444444");  break;
			case 5:
				System.out.println("오가 나왔다이.");
				System.out.println("55555555");  break;
			case 6: 
				System.out.println("육이 나왔다이.");
				System.out.println("6666666");
				
				// 모든 값중 다 적합하지않았을때 default를 사용하면 잡을수있음
				// 설정을 1~6으로 해뒀으나 그 외에 값이 나올수도있...나
				default :
				System.out.println("주사위에서 나올 수 없는 숫자가 나왔다이");
		}
		
	}

}
