import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        String ox;
        for(int i=0;i<t;i++){
            ox = scan.next();
            int sum = 0;
            int answer = 0;
            for(int j=0; j<ox.length(); j++) {
                if(ox.charAt(j) == 'O') { // 인덱스 주의 !
                    sum++;
                    answer += sum;
                } else {
                    sum = 0;
                }
            } 
            System.out.println(answer);
        }
    }
}