import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        String exp = br.readLine();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));

            if (stack.size() >= exp.length()) {
                boolean isSame = true;
                for (int j = 0; j < exp.length(); j++) {
                    if (stack.get(stack.size() - exp.length() + j) != exp.charAt(j)) {
                        isSame = false;
                        break;
                    }
                }

                if (isSame) {
                    for (int j = 0; j < exp.length(); j++)
                        stack.pop();
                }
            }
        }

        for (char ch : stack)
            sb.append(ch);

        System.out.println(sb.length() > 0 ? sb.toString() : "FRULA");
    }
}