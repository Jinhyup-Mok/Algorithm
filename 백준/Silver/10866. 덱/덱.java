import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

// 스택은 위에 쌓여있는거
// 큐는 앞에 먼저
// 덱은 앞뒤 둘다 다룰수 있다.
public class Main {
    public static Deque<Integer> deque = new LinkedList<>(); // 덱, 큐는 deque<타입> 이름 = new LinkedList<>(); 로 선언한다!
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringTokenizer st;
    public static int num;
    public static void main(String[] args) throws IOException {

        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine());
            String ctrl = st.nextToken();
            if(ctrl.equals("push_front")) push_front();
            else if(ctrl.equals("push_back")) push_back();
            else if(ctrl.equals("pop_front")) System.out.println(pop_front());
            else if(ctrl.equals("pop_back")) System.out.println(pop_back());
            else if(ctrl.equals("size")) System.out.println(size());
            else if(ctrl.equals("empty")) System.out.println(empty());
            else if(ctrl.equals("front")) System.out.println(front());
            else if(ctrl.equals("back")) System.out.println(back()); 
        }
    }
    
    public static void push_front() {
        int n = Integer.parseInt(st.nextToken());
        deque.offerFirst(n); // addFirst, offerFirst 덱의 가장 앞에 값 추가
        num = n; // back가장뒤에 값 출력을위하여 저장
    } // add, offer : First, Last 없이 그냥 썼을때는 맨 마지막에 추가
    public static void push_back() {
        int n = Integer.parseInt(st.nextToken());
        deque.offerLast(n); // addLast, offerLast 덱의 가장 뒤에 값 추가
    }
    public static int pop_front() { 
        if(!deque.isEmpty()) return deque.pollFirst(); // 가장 앞에있는값 제거 후 출력, 첫번째값 제거만 removeFirst
        else return -1; // 덱 초기화 clear
    } // poll : First, Last 없이 그냥 썼을때는 맨 앞에꺼 해당
    public static int pop_back() { 
        if(!deque.isEmpty()) return deque.pollLast(); // 가장 뒤에있는값 제거 후 출력, 마지막값 제거만 removeLast
        else return -1; // 큐 초기화 clear
    }
    public static int size() {
        return deque.size(); // 스택과 같이 큐의 사이즈
    }
    public static int empty() {
        if(deque.isEmpty()) return 1;
        else return 0;
    }
    public static int front() {
        if(deque.isEmpty()) return -1;
        else return deque.peekFirst(); // getFirst(), peekFirst() 로 맨 앞의 값 출력
    }
    public static int back() { // getLast(), peekLast() 로 맨 뒤에 값도 출력 가능(큐, 스택과 다른점)
        if(deque.isEmpty()) return -1;
        else return deque.peekLast(); 
    }
}
