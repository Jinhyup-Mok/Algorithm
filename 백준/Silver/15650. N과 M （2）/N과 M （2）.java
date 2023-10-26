import java.util.Scanner;

public class Main {
	
	private static int N, M;
	private static int[] arr;
	private static boolean[] visit;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		N = scan.nextInt();
		M = scan.nextInt();
		
		visit = new boolean[N+1];
		arr = new int[M];
		dfs(0, 0);	
    }
	private static void dfs(int d, int idx) {
		if (d == M) {
			for (int i=0; i<M; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		} else {
			for (int i=idx+1; i<=N; i++) {
				if (visit[i] == false) {
					visit[i] = true;
					arr[d] = i;
					//재귀
					dfs(d+1, i);
					//백트래킹
					visit[i] = false;
				}
			}
		}
	}
}