import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 스택은 위에 쌓여있는거
// 큐는 앞에 먼저
public class Main {
    public static Queue<Integer> queue = new LinkedList<>(); // 큐는 Queue<타입> 이름 = new LinkedList<>(); 로 선언한다!
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringTokenizer st;
    public static int num;
    public static void main(String[] args) throws IOException {

        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine());
            String ctrl = st.nextToken();
            if(ctrl.equals("push")) push();
            else if(ctrl.equals("pop")) System.out.println(pop());
            else if(ctrl.equals("size")) System.out.println(size());
            else if(ctrl.equals("empty")) System.out.println(empty());
            else if(ctrl.equals("front")) System.out.println(front());
            else if(ctrl.equals("back")) System.out.println(back()); 
        }
    }
    public static void push() {
        int n = Integer.parseInt(st.nextToken());
        queue.offer(n); // add, offer 큐에 값 추가
        num = n; // back가장뒤에 값 출력을위하여 저장
    }
    public static int pop() { 
        if(!queue.isEmpty()) return queue.poll(); // 가장 앞에있는값 제거 후 출력, 첫번째값 제거만 remove
        else return -1; // 큐 초기화 clear
    }
    public static int size() {
        return queue.size(); // 스택과 같이 큐의 사이즈
    }
    public static int empty() {
        if(queue.isEmpty()) return 1;
        else return 0;
    }
    public static int front() {
        if(queue.isEmpty()) return -1;
        else return queue.peek(); // 스택과 같이 큐의 첫번째값 출력
    }
    public static int back() { // 큐에서 가장뒤에있는값 출력 -> offer 할때 저장!, 큐는 앞에서부터 지워지니 마지막에 추가한 값이 남을것이다! 
        if(queue.isEmpty()) return -1;
        else return num; 
    }
}