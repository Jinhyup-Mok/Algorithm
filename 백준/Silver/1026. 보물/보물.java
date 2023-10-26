import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for(int i=0; i<N; i++) {
            A[i] = scan.nextInt();
        }
        for(int i=0; i<N; i++) {
            B[i] = scan.nextInt();
        }
        Arrays.sort(A);
        Arrays.sort(B);
        int[] B_ = new int[N];
        int sum = 0;
        int j = 0;
        for(int i=B.length-1;i>=0; i--){
            B_[j] = B[i];
            j++;
        }
        for(int i=0; i<A.length; i++){
            sum += B_[i] * A[i];
        } 
        System.out.println(sum);
    }
}