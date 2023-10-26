import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int group_word = 0;
        for(int i=0; i<T; i++) {
            String word = scan.next();
            List<String> group = new ArrayList<>();
            int cnt = 1;
            group.add(Character.toString(word.charAt(0)));
            for(int j=1; j<word.length(); j++) {
                if(word.charAt(j) == word.charAt(j-1)) {
                    group.add(Character.toString(word.charAt(j)));
                    cnt++;
                } else {
                    if(!group.contains(Character.toString(word.charAt(j)))){
                        group.add(Character.toString(word.charAt(j)));
                        cnt++;
                    } else {
                        cnt = 0; break;
                    }
                }
            }
            if(cnt == word.length()) group_word++;
        }
        System.out.println(group_word);
    }
}