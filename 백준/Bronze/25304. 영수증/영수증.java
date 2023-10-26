import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x, n, a, b;
        int price = 0;
        x = scan.nextInt();
        n = scan.nextInt();
        for(int i=0; i<n; i++) {
            a = scan.nextInt();
            b = scan.nextInt();
            price += a * b;
        }
        if( x == price) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}