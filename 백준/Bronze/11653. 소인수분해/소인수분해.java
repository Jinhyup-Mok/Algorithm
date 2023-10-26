import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] G = new int[N];
        int cnt = 0;
        while(N % 2 == 0) {
            N = N /2;
            G[cnt] = 2;
            cnt++;
        }
        for(int i=3; i<=N; i+=2){
            while(N % i == 0){
                N = N / i;
                G[cnt] = i;
                cnt++;
            }
        }
        for(int i=0; i<cnt; i++){
            System.out.println(G[i]);  
        }
    }
}