import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] fibo = new int[21]; // 11개의 자리 0 ~ 10 번째 칸
        fibo[0] = 0; 
        fibo[1] = 1;
        if(n > 1) {
            for(int i=2; i<n+1; i++) {
                fibo[i] = fibo[i-1] + fibo[i-2]; 
            }
        }
        System.out.println(fibo[n]);
    }
}