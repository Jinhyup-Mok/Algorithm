import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] num = new int[N];
        for(int i=0; i<N; i++) {
            num[i] = scan.nextInt();
        }
        Arrays.sort(num); // 오름차순 정렬
        int M = scan.nextInt();
        int[] num_list = new int[M];
        for(int i=0; i<M; i++) {
            num_list[i] = scan.nextInt();
        }
        for(int i=0; i<M; i++) {
            System.out.println(binary_search(num, num_list[i]));
        }
    }

    public static int binary_search(int[] arr, int num)  {
        int low = 0;
        int high = arr.length-1;
        int mid = 0;
        while(low <= high) {
            mid = (low + high) / 2;
            if(arr[mid] == num) return 1;
            else if(arr[mid]>num) high = mid - 1;
            else if(arr[mid]<num) low = mid + 1;
        }
        return 0;
    }
}