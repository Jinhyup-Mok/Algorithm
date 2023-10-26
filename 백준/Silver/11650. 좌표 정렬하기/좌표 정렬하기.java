import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
 
public class Main {
	public static void main(String[] args) {		
 
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int[][] arr = new int[N][2];
		 
		for(int i = 0; i < N; i++) {
			arr[i][0] = in.nextInt();	// x
			arr[i][1] = in.nextInt();	// y
		}

		Arrays.sort(arr, new Comparator<int[]>() {
			public int compare(int[] s1, int[] s2) {
				return s1[0] != s2[0] ? s1[0] - s2[0] : s1[1] - s2[1];
			}
		});
        // x좌표, y좌표 오름차순 정렬된 상태
        
		for(int i = 0; i < N; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
	}
}