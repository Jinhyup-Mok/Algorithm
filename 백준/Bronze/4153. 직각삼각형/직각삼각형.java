import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> answer = new ArrayList<>();
        while(true) {
            int[] num = new int[3];
            for(int i=0; i<num.length;i++){
                num[i] = scan.nextInt();
            }
            if(num[0] == 0 && num[1] == 0 && num[2] == 0) break;

            Arrays.sort(num);
            int A = num[0]*num[0];
            int B = num[1]*num[1];
            int C = num[2]*num[2];

            if(C == A + B) {
                answer.add("right");
            } else answer.add("wrong");
        }
        for(int i=0;i<answer.size();i++){
            System.out.println(answer.get(i));
        }
    }
}