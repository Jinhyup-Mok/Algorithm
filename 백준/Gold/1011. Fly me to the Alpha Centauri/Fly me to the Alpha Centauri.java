import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		for (int i=0; i<T; i++) {
			int X = scan.nextInt();
			int Y = scan.nextInt();
			int move = Y - X;
			int A = (int)Math.sqrt(move); 
			
			if(A*A == move) {
				System.out.println(2*A-1);
			}else if(A*A+A >= move){
				System.out.println(2*A);
			} else {
				System.out.println(2*A+1);
			}
		}

	}
}