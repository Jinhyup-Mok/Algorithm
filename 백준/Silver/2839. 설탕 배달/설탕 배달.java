import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int answer = 0;
        while(n%5 != 0){
            n -= 3;
            answer++;
        }
        if(n < 0){
            System.out.println(-1);
            return;
        }
        answer += n/5;
        System.out.println(answer);
    }
}
