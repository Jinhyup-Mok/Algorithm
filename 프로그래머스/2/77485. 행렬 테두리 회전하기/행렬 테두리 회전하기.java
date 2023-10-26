import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
class Solution {
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] result = new int[queries.length];
        int[][] table = new int[rows+1][columns+1];

        int cnt = 1;
        for(int i=1; i<=rows; i++) {
            for(int j=1; j<=columns; j++) {
                table[i][j] = cnt;
                cnt++;
            }
        }

        for(int i=0; i<queries.length; i++) {
            Deque<Integer> rotation = new LinkedList<>();
            int d = 1;
            int a = queries[i][0];
            int b = queries[i][1];
            switch(d) {
                case 1:
                    while(b < queries[i][3]) rotation.add(table[a][b++]);
                    d++;
                case 2:
                    while(a < queries[i][2]) rotation.add(table[a++][b]);
                    d++;
                case 3:
                    while(b > queries[i][1]) rotation.add(table[a][b--]);
                    d++;
                case 4:
                    while(a > queries[i][0]) rotation.add(table[a--][b]);
                    d++;
                default:
                    d = 1;
                    a = queries[i][0];
                    b = queries[i][1];
                    break;
            }
            
            int tmp = rotation.pollLast();
            rotation.addFirst(tmp);

            int idx = 0;
            int[] arr = new int[rotation.size()];
            
            
            switch(d) {
                case 1:
                    while(b < queries[i][3]) {
                        arr[idx] = rotation.peek(); 
                        table[a][b++] = rotation.pollFirst();
                        idx++;
                    } d++;
                case 2:
                    while(a < queries[i][2]) { 
                        arr[idx] = rotation.peek();
                        table[a++][b] = rotation.pollFirst();
                        idx++;
                    } d++;
                case 3:
                    while(b > queries[i][1]) {
                        arr[idx] = rotation.peek();
                        table[a][b--] = rotation.pollFirst();
                        idx++;
                    } d++;
                case 4:
                    while(a > queries[i][0]) {
                        arr[idx] = rotation.peek();
                        table[a--][b] = rotation.pollFirst();
                        idx++;
                    } d++;
                default:
                    break;
            }
            
            Arrays.sort(arr);
            result[i] = arr[0];
        }
        return result;
    }
}