import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int sum = 64;
        int ans = 0;
        List<Integer> num = new ArrayList<>();
        num.add(64);
        while(sum > x){
            Collections.sort(num); // 오름차순 정렬
            if(sum > x) {
                if(sum - (num.get(0)/2) >= x) {
                    num.set(0, num.get(0)/2);
                } else {
                    num.add(num.get(0)/2);
                    num.set(0, num.get(0)/2);
                }
            }
            sum = 0;
            for(int i=0; i<num.size(); i++) {
                sum += num.get(i);
            }
        }
        ans = num.size();
        System.out.println(ans);
    }
}