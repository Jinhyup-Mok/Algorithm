import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        int cnt = 0;
        String str = "666";
        while(cnt<n) {
            for (int i = 0; i< 10000000; i++) {
                if(Integer.toString(i).contains(str)) {
                    list.add(i);
                    cnt++;
                }
            }
        }
        System.out.println(list.get(n-1));
    }
}