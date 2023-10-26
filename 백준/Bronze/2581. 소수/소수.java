import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int M = scan.nextInt(), N = scan.nextInt();
        int sum = 0;
        int prime = 0;
        int[] arr = new int[N];
        for(int i=M; i<=N; i++){
            int cnt = 0;
            for(int j=2; j<=i; j++){
                if(i % j == 0) cnt++;
            }
            if(cnt == 1) {
                arr[prime] = i;
                prime++;
            }
        }
        int min = arr[0];
        for(int i=0; i<prime; i++){
            if(min > arr[i]) {
                min = arr[i];   
            }
            sum += arr[i];
        }
        if(arr[0] == 0) System.out.println(-1);
        else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}