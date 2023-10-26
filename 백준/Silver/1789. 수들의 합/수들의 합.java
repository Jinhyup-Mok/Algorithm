import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long S = scan.nextLong();
        long num = 0;
        int cnt = 0;
        for(long i=1; ; i++) {
            if(num > S) break;
            num += i;
            cnt++;
        }
        System.out.println(cnt-1);
    }
}



