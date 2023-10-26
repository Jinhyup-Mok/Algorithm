import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        try (Scanner scanner = new Scanner(System.in)) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
        }
        int price = 0;
        if(a == b && b == c){
            price = 10000 + a * 1000;
        } 
        if((a == b || b == c || a == c) && (a != b || b != c || a !=c)) {
            if(a == b){
                price = 1000 + a * 100;
            } else if(b == c){
                price = 1000 + b * 100;
            } else if(a == c){
                price = 1000 + c * 100;
            }
        }
        if (a != b && b != c && a != c ){
            if(a > b && a > c){
                price = a * 100;
            } else if(b > c && b > a){
                price = b * 100;
            } else if(c > b && c > a){
                price = c * 100;
            }
        }
        System.out.println(price);
    }
}