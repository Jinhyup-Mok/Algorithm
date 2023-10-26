import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[][] num = new int[31][31];
        for(int i=0; i<31; i++) {
            num[i][0] = 1;
        }
        for(int i=1; i<31; i++) {
            for(int j=1; j<=i; j++) {
                num[i][j] = num[i-1][j-1] + num[i-1][j];
            }        
        }
        System.out.println(num[n-1][k-1]);
    }
}
