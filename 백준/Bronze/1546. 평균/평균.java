import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double[] score = new double[n];
        double avr = 0;
        double answer = 0;
        for(int i=0;i<score.length;i++){
            score[i] = scan.nextDouble();
        }
        double m = score[0];
        for(int i=0;i<score.length;i++){
            if(m < score[i]) m = score[i];
        }
        for(int i=0;i<score.length;i++){
            score[i] = score[i] / m * 100;
            avr += score[i];
        }
        answer = avr / n;
        System.out.println(answer);
    }
}