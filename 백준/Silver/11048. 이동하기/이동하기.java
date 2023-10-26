import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static int[][] miro;
    public static int[][] dp;
    public static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        miro = new int[n+1][m+1];

        for(int i=1; i<=n; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            for(int j=1; j<=m; j++) {
                miro[i][j] = Integer.parseInt(st1.nextToken());
            }
        }
        
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=m; j++) {
                miro[i][j] += Math.max(miro[i-1][j-1], Math.max(miro[i-1][j], miro[i][j-1]));
            }
        }
        System.out.println(miro[n][m]);
    }
}
