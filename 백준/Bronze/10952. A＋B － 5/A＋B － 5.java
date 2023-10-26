import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sum = "";
        while(true) {
            int A = scan.nextInt();
            int B = scan.nextInt();
            int S = A + B;
            if(A == 0 && B == 0) break;
            sum += Integer.toString(S) + "\n";
        }
        System.out.println(sum);
    }
}