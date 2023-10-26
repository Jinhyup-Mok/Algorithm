import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int[][] num = new int[T][3];
        int[] answer = new int[T];

        for(int i=0; i<T; i++){
            for(int j=0; j<3; j++){
                num[i][j] = scan.nextInt();   
            }
            answer[i] = room(num[i][1], num[i][0], num[i][2]);
        }
        for(int i=0; i<T; i++){
            System.out.println(answer[i]);
        }
    }
    public static int room(int i, int j, int k){
        int cnt = 0;
        int anw = 0;
        for(int a=0; a<i; a++){
            for(int b=0; b<j; b++){
                cnt += 1;
                if(cnt == k){
                    anw = 100 * (b+1) + (a+1);
                    break;
                }
            }
        }
        return anw;
    }
}
