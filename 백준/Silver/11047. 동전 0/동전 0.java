import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();
        int[] coin = new int[N];
        int anw = 0;
        for(int i=0;i<coin.length;i++) {
            coin[i] = scan.nextInt();
        }
        for(int j=N-1;j>=0;j--) {
            if(K/coin[j] > 0) {
                anw += K/coin[j];
                K = K%coin[j];
            }
        }
        System.out.println(anw);
    }
}