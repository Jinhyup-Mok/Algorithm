import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num = new int[8];
        int cnt = 0;
        String answer = "";
        for(int i=0; i<num.length; i++){
            num[i] = scan.nextInt();
        }
        for(int i=0; i<num.length-1; i++){
            if(num[i] < num[i+1]) cnt++;
            if(num[i] > num[i+1]) cnt--;
        }
        if(cnt == 7) answer = "ascending";
        else if(cnt == -7) answer = "descending";
        else answer = "mixed";
        System.out.println(answer);

    }
}
