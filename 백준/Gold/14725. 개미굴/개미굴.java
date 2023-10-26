import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
 
public class Main {
    static class Node {
        Map<String, Node> child;
 
        public Node() {
            child = new HashMap<>();
        }
    }
 
    static Node root;
    static Node cur;
    static StringBuilder sb;
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
 
        int N = Integer.parseInt(br.readLine());
        sb = new StringBuilder();
 
        root = new Node();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
 
            cur = root;
            for (int j = 0; j < n; j++) {
                insert(st.nextToken());
            }
        }
 
        print(root, 0);
 
        System.out.print(sb.toString());
    }
 
    static void insert(String str) {
        if (cur.child.get(str) == null) {
            cur.child.put(str, new Node());
        }
 
        cur = cur.child.get(str);
    }
 
    static void print(Node cur, int depth) {
        if (cur.child != null) {
            List<String> keyList = new ArrayList<>(cur.child.keySet());
            Collections.sort(keyList);
 
            for (String key : keyList) {
                sb.append(getLine(depth) + key + "\n");
                // System.out.println(depth + ", " + key);
                print(cur.child.get(key), depth + 1);
            }
 
        }
    }
 
    static String getLine(int depth) {
        String line = "";
        for (int i = 0; i < depth * 2; i++) {
            line += "-";
        }
        return line;
    }
}