package chapter04_2;

public class ForTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 중첩 for 문 보통 2중 for문 까지만 사용하고 3중부턴 안함..
//		for(int i = 1 ; i <= 4 ; i++) {
//			System.out.println("안녕하시옵니까");
//		for(int j = 1 ; j <= 5 ; j++ ) {
//			System.out.println("강녕하시옵니까");
//		for(int k = 1 ; k <= 3 ; k++ ) {
//			System.out.println("식사하시옵니까");
//			}		
//}				
//}
	System.out.println("---------------------------------------------");
		
		//별찍기;;
		for(int a = 1 ; a <= 5 ; a++) {
			System.out.println();
			System.out.print(" * ");
			for(int b = 1 ; b <= 4 ; b++) {
			System.out.print(" * ");	
			
			}
		}
}
}
