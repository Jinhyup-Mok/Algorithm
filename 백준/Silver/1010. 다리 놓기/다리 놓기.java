import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sr = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(sr.nextToken());
        for(int i=0; i<T; i++){
            StringTokenizer snm = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(snm.nextToken());
            int M = Integer.parseInt(snm.nextToken());
            double A = 1; double B = 1;
            for(int j=0; j<N; j++){
                A *= (M-j);
                B *= (N-j);
            } System.out.println(Math.round(A/B));
        }
    }
}