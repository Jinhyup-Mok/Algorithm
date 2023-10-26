import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		int i,j;
		Scanner scan = new Scanner(System.in);
		int M = scan.nextInt();
		int N = scan.nextInt();
		
		int [] arr = new int [N + 1];		
		for(i = 0; i <= N; i++) {
			arr[i] = 0;
		}
		
		arr[1] = 1;
		
		for (i = 2; i < N + 1; i++) {
			if(arr[i] == 0) {
				if((int)Math.pow(i, 2) > 1000000){
					break;
				} else {
					for (j = (int)Math.pow(i,2); j < N + 1; j = j + i) {
						arr[j] = 1; 	
                    }
				}
			}
		}
		for (i = M; i < N + 1; i++) {
			if(arr[i] != 1) {
				System.out.println(i);
			}
		}
	}
}
