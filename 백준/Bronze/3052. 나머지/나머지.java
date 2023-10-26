import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num = new int[10];
        int[] cnt = new int[42];
        int count = 0;
        for(int i=0;i<num.length;i++){
            num[i] = scan.nextInt();
        }
        for(int i=0;i<cnt.length;i++){
            cnt[i] = 0;
        }
        for(int i=0;i<num.length;i++){
            cnt[num[i]%42]++;
        }
        
        for(int i=0;i<cnt.length;i++){
            if(cnt[i] >= 1) count += 1;
        }
        System.out.println(count);
    }
}