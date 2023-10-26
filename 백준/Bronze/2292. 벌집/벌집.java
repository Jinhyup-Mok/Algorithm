import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int cnt = 0, answer;
        int bee = 1;
        while(true){
            if(N > bee){
                cnt += 1;
                bee = bee + 6*cnt;
            } else {
                answer = cnt + 1;
                break;
            }
        }
        System.out.println(answer);
    }
}