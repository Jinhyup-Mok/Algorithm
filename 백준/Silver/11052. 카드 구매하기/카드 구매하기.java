import java.util.Scanner;

public class Main {
    public static int[] dp;
    public static int[] p;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        p = new int[N+1];
        dp = new int[N+1];

        p[0]=0;
        for(int i=1; i<=N; i++){
            p[i] = sc.nextInt();
        }
        dp[0] = 0;
        dp[1] = p[1];

        for(int i=2; i<=N; i++) {
            for(int j=1; j<=i; j++){
                dp[i] = Math.max(dp[i], dp[i-j]+p[j]);
            }
        }
        System.out.println(dp[N]);

        sc.close();

    }
}
