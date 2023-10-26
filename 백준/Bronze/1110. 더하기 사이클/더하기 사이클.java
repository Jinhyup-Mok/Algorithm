import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int n1 = N;
        int cnt = 0;

        while(true) {
            int a = n1 / 10;
            int b = n1 % 10;
            int c = a + b;

            n1 = b*10 + c%10; // b를 10의 자리로, c를 1의 자리로(10나눔)
            cnt += 1;
            if(n1 == N) break;
        }
        System.out.println(cnt);
    }
}
