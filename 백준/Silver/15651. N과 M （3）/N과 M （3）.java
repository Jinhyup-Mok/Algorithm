import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static int N, M;
	public static int[] arr;
    public static StringBuilder str = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[M];
		dfs(0);	
        System.out.println(str);
    }
	private static void dfs(int d) {
		if (d == M) {
			for (int i=0; i<M; i++) {
				str.append(arr[i] + " ");
			}
			str.append("\n");
            return;
		} else {
			for (int i=1; i<=N; i++) {
				arr[d] = i;
				//재귀
				dfs(d+1);
				//백트래킹
			}
		}
	}
}