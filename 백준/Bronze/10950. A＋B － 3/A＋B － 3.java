import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test, A, B;
        test = scan.nextInt();
        int[] plus = new int[test];
        for(int i=0; i<test; i++) {
            A = scan.nextInt();
            B = scan.nextInt();
            plus[i] = A + B;
        }
        for(int i=0; i<plus.length; i++){
            System.out.println(plus[i]);
        }
    }
}