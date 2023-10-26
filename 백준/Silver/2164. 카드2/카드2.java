import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Queue<Integer> card = new LinkedList<>();
        int n = scan.nextInt();
        for(int i=1; i<=n; i++) {
            card.add(i);
        }
        while(card.size() > 1) {
            card.remove();
            card.add(card.poll());
        }
        System.out.println(card.poll());
    }
}

