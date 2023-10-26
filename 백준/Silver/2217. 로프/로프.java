import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] rope = new int[N];
        int[] weight = new int[N];
        for(int i=0; i<N; i++){
            rope[i] = scan.nextInt();
        }
        Arrays.sort(rope);
        int idx = 0;
        for(int i=N; i>=1; i--) {
            weight[i-1] = rope[idx] * i;
            idx++;
        }
        Arrays.sort(weight);
        System.out.println(weight[N-1]);
    }
}