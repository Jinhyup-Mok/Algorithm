import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
            int num = scan.nextInt();
            if(num == 0) break;
            boolean a = true;
            String pelin = Integer.toString(num);
            for(int i=0; i<pelin.length(); i++) {
                if(pelin.charAt(i) == pelin.charAt((pelin.length()-1)-i)) {
                    a = true; 
                } else {
                    a = false;
                    break;
                }
            }
            if(a) System.out.println("yes");
            else System.out.println("no");
            
        }
    }
}
