import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int zero = 0;
        while(N / 5 > 0) {
            zero += N/5;
            N = N / 5;
        }
        System.out.println(zero);
    }
}