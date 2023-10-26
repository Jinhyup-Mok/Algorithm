import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		int[] answer = new int[T];
		
		for(int i=0; i< T; i++) {
			int x1 = scan.nextInt(), y1 = scan.nextInt(), r1 = scan.nextInt();
			int x2 = scan.nextInt(), y2 = scan.nextInt(), r2 = scan.nextInt();
			double xy = Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2);
			answer[i] = turret(xy, r1, r2);
		}
		for(int i=0; i<T; i++) System.out.println(answer[i]);
	}
	public static int turret(double xy, int r1, int r2) {
		if(xy == 0 && r1 == r2) return -1;
		else if(xy > Math.pow(r1 + r2, 2)) return 0;
		else if(xy < Math.pow(r1 - r2, 2)) return 0;
		else if(xy == Math.pow(r1 - r2, 2) || xy == Math.pow(r1 + r2, 2)) return  1;
		else return 2;
	}
}
