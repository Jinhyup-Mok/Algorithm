import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num = new int[9];
        for(int i=0;i<9;i++) {
            num[i] = scan.nextInt();
        }
        int max = num[0];
        int cnt = 1;
        for(int j=0;j<9;j++) {
            if(num[j] > max) {
                max = num[j];
                cnt = j+1;
            }
        }
        System.out.println(max + "\n" + cnt);
    }
}