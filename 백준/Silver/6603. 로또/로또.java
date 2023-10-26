import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringTokenizer st;
    public static int lotto = 6;
    public static int k;
    public static int[] arr = new int[lotto];
    public static int[] S;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true){
            st = new StringTokenizer(br.readLine());
            k = Integer.parseInt(st.nextToken());
            if(k == 0) break;
            S = new int[k];
            for(int i=0; i<k; i++) {
                S[i] = Integer.parseInt(st.nextToken());
            }
            dfs(0, 0);
            System.out.println();
            
        }
    }
    public static void dfs(int d, int cnt) {
        if(d == lotto) {
            for(int i=0; i<lotto; i++) {
                System.out.print(arr[i] + " ");
            } System.out.println();
        } else {
            for(int i=cnt; i<k; i++){
                    arr[d] = S[i];
                    dfs(d+1, i+1);
            }
        }
    }
}