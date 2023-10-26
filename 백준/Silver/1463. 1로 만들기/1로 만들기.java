 import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] cnt = new int[1000001];
        cnt[2] = 1;
        cnt[3] = 1;
        for (int i = 4; i <= N ; i++) {
            if (i % 6 == 0) {
                cnt[i] = Math.min(cnt[i/3], Math.min(cnt[i/2], cnt[i-1])) + 1;
            } else if (i % 3 == 0) {
                cnt[i] = Math.min(cnt[i/3], cnt[i-1])+1;
            } else if (i % 2 == 0) {
                cnt[i] = Math.min(cnt[i/2], cnt[i-1]) + 1;
            } else {
                cnt[i] = cnt[i-1] + 1;
            }
        }
        System.out.print(cnt[N]);
    }
}
