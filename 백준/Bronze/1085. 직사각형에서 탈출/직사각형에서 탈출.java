import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int w = scan.nextInt();
        int h = scan.nextInt();
        int a = 0;
        int b = 0;
        if(w-x > x) a = x;
        else a = w-x;

        if(h-y > y) b = y;
        else b = h-y;

        System.out.println(Math.min(a,b));
        
    }
}