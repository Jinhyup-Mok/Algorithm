import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for(int i=0;i<T;i++){
            int n = scan.nextInt();
            String str = scan.next();
            String answer = "";
            for(int j=0; j<str.length(); j++){
                for(int k=0;k<n;k++) {
                    answer += Character.toString(str.charAt(j));
                }
            } System.out.println(answer);
        }
    }
}