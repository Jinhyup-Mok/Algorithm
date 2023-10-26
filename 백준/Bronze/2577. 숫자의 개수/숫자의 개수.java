import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int a = A * B * C;
        int n = a;
        int num = (int)(Math.log10(a)+1); // int형 자리수 크기 구하기
        int[] b = new int[num];
        int[] cnt = new int[10];
        for(int i=0;i<cnt.length;i++){
            cnt[i] = 0;
        }
        for(int i=0;i<num;i++){
            b[i] = n % 10;
            n = n/10;
            cnt[b[i]]++;
        }
        for(int i=0;i<cnt.length;i++){
            System.out.println(cnt[i]);
        }
    }
}
