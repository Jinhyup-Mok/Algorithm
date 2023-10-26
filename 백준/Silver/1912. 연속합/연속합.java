import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] num = new int[n];
        int[] max = new int[n];
        int anw = 0;
        for(int i=0;i<n;i++) {
            num[i] = scan.nextInt();
        }
        max[0] = num[0];
        anw = max[0];
        for(int j=1;j<n;j++) {
            max[j] = Math.max(max[j-1] + num[j], num[j]);
            anw = Math.max(anw, max[j]);
        }
        System.out.println(anw);
    }
}