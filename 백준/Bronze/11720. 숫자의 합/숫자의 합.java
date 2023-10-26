import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        String str = scan.next();
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += Integer.parseInt(str.substring(i, i+1));
            // str.substring(start, end) 문자열에서 start에서 end까지 잘라서 꺼낸다.
        }
        System.out.println(sum);
    }   
}
