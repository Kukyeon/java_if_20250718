package chapter04_2;

public class ForStarPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//별찍기;; 
	System.out.println("---------------------------------------------");
		
		for(int i = 1 ; i <= 5 ; i++) {
			System.out.print(" * ");
			
			for(int j = 1 ; j <= 4 ; j++) {
			System.out.print(" * ");	
		}
			System.out.println();
	}
	System.out.println("---------------------------------------------");	
	
	
	for(int i = 4 ; i > 0  ; i--) {
		for(int j = 0 ; j<i  ; j++) {
			System.out.print("*");
		}System.out.println();
	}
	for (int i = 1; i <= 5; i++) {
        for (int space = 1; space <= 5 - i; space++) {
            System.out.print(" ");
        }
        for (int star = 1; star <= (2 * i - 1); star++) {
            System.out.print("*");
        }
        System.out.println();
    }
		
}

}
