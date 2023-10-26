import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static Stack<Integer> stack = new Stack<>(); // 정적 변수로 선언!
    public static int num;
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringTokenizer st;
    public static void main(String[] args) throws IOException {

        int T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine());
            String ctrl = st.nextToken();
            if(ctrl.equals("push")) push();
            else if(ctrl.equals("pop")) System.out.println(pop());
            else if(ctrl.equals("size")) System.out.println(size());
            else if(ctrl.equals("empty")) System.out.println(empty());
            else if(ctrl.equals("top")) System.out.println(top()); 
        }
    }
    public static void push() {
        int n = Integer.parseInt(st.nextToken());
        stack.push(n);
    }
    public static int pop() { 
        if(!stack.isEmpty()) return stack.pop(); // 가장 위에 있는 값 삭제와 동시에 출력 
        else return -1;
    }
    public static int size() {
        return stack.size();
    }
    public static int empty() {
        if(stack.isEmpty()) return 1;
        else return 0;
    }
    public static int top() {
        if(stack.isEmpty()) return -1;
        else return stack.peek();
    }
}