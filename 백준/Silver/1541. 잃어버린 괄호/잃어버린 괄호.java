import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String num = scan.next();
        String[] str = new String[num.length()];
        int answer = 0;
        str = num.split("\\-");
        if(str.length > 1) {
            answer = plus(str[0]);
            for(int i=1; i<str.length; i++) {
                answer -= plus(str[i]);
            }
        } else {
            for(int i=0; i<str.length; i++) {
                answer = plus(str[i]);
            }
        }
        System.out.println(answer);
    }
    public static int plus(String str) {
        String[] add = new String[str.length()];
        int[]  add_int = new int[str.length()];
        int sum = 0;
        add = str.split("\\+");
        for(int i=0; i<add.length; i++) {
            add_int[i] = Integer.parseInt(add[i]);
            sum += add_int[i];
        }
        return sum;
    }
}