import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int C = scan.nextInt();
        double[] answer = new double[C];
        for(int i=0; i<C; i++){
            int cnt = 0, sum = 0, avg = 0;
            int N = scan.nextInt();
            int[] score = new int[N];

            for(int j=0; j<N; j++){
                score[j] = scan.nextInt();
                sum += score[j];
            }
            avg = sum / N;
            for(int j=0; j<N; j++){
                if(score[j] > avg) cnt += 1;
            }
            answer[i] = (double)cnt / (double)N * 100.0;
        }
        for(int i=0;i<C;i++){
            System.out.printf("%.3f%%\n", answer[i]);
        }
    }
}