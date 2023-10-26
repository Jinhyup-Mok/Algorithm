import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		int[][] APT = new int[15][15];
        int[] answer = new int[T];
		for(int i = 0; i < 15; i++) {
			APT[i][1] = 1;
			APT[0][i] = i;
		}
		for(int i = 1; i < 15; i ++) {	// 1층부터 14층까지
			for(int j = 2; j < 15; j++) {	// 2호부터 14호까지
				APT[i][j] = APT[i][j - 1] + APT[i - 1][j];
			}
		}
		for(int i = 0; i < T; i++) {
			int k = in.nextInt();
			int n = in.nextInt();
            answer[i] = APT[k][n];
			
		}
        for(int i=0; i<T; i++){
            System.out.println(answer[i]);
        }
    }
}