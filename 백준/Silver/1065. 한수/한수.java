import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int cnt = 0;
        for(int i=1; i<=N; i++){
            if(i < 100) {
                cnt++;
            } else {
                if((i/100)-((i%100)/10) == ((i%100)/10)-((i%100)%10)) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}