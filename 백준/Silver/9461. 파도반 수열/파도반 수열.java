import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		long[] answer = new long[T];
		for(int i=0; i<T; i++) {
			int num = scan.nextInt();
			long[] n = new long[num+1];
			if(num == 1) {
				n[0] = 1; n[1] = 1;
			} else {
				n[0]=1; n[1]=1; n[2]=1;
				for(int j =3; j<n.length; j++) {
					n[j] = n[j-2] + n[j-3];
				}
			} answer[i] = n[num-1];
		}
		for(int i=0; i<T; i++) {
			System.out.println(answer[i]);
		}
	}
}