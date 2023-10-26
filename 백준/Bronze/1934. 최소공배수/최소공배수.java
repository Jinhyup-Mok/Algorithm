import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for(int i=0;i<T;i++) {
            int A = scan.nextInt();
            int B = scan.nextInt();
            int G = 1; int L = 0;
            while(A%2==0 && B%2==0){
                A = A / 2;
                B = B / 2;
                G *= 2;
            }
            for(int j=3; j<=Math.min(A,B); j+=2) { 
                while(A%j==0 && B%j==0){
                    A = A / j;
                    B = B / j;
                    G *= j;
                }
            }
            L = A * B * G;
            System.out.println(L);
        }
    }
}
