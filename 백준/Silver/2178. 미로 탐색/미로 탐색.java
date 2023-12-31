import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static int[][] miro;
    public static int n, m;
    public static boolean[][] visited;
    public static int[] dx = {-1,1,0,0};
    public static int[] dy = {0,0,-1,1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        miro = new int[n][m];
        
        for(int i=0; i<n; i++) {
            String str = br.readLine();
            for(int j=0; j<m; j++) {
                miro[i][j] = str.charAt(j) - '0';
            }
        }
        visited = new boolean[n][m];
        visited[0][0] = true;

        bfs(0, 0);
        System.out.println(miro[n-1][m-1]);

        br.close();

    }

    public static void bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {x,y});

        while(!q.isEmpty()) {
            int now[] = q.poll();
            int nowX = now[0];
            int nowY = now[1];

            for(int i=0; i<4; i++) {
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];

                if(nextX < 0 || nextY < 0 || nextX >= n || nextY >= m) continue;
                if(visited[nextX][nextY] || miro[nextX][nextY] == 0) continue;

                q.add(new int[] {nextX, nextY});
                miro[nextX][nextY] = miro[nowX][nowY] +1; // 칸 수 누적!!!
                visited[nextX][nextY] = true;
            }
        }
    }
}
