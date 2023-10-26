import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test, A, B;        
        test = scan.nextInt();
        int[] ab2 = new int[test];
        int[] a = new int[test];
        int[] b = new int[test];
        for(int i=0; i<test; i++) {
            A = scan.nextInt();
            a[i] = A;
            B = scan.nextInt();
            b[i] = B;
            ab2[i] = A + B;
        }
        for(int i=0; i<test; i++) {
            System.out.printf("Case #%d: %d + %d = %d\n", i+1, a[i], b[i], ab2[i]);
        }
    }
}