import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt(), B = scan.nextInt(), C = scan.nextInt();
        int answer;
        if(B >= C) answer = -1;
        else answer = A/(C-B) + 1;
        System.out.println(answer);
    }
}