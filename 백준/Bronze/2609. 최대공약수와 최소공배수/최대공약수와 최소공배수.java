import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt(), B = scan.nextInt();
        int G = 1;
        int L = A * B;
        while(A % 2 == 0 && B % 2 == 0){
            A = A / 2;
            B = B / 2;
            G *= 2;
        }
        for(int i=3; i<10000; i+=2){ // 2씩 증가
            while(A % i == 0 && B % i == 0) {
                A = A / i;
                B = B / i;
                G *= i;
            }
        }
        L = G * A * B;
        System.out.println(G);
        System.out.println(L);
    }
}