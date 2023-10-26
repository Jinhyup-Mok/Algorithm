import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N ; i++) {
            arr[i] = scan.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for(int j=0; j<arr.length; j++) {
            if(arr[j] > max) max = arr[j];
            if(arr[j] < min) min = arr[j];
        }
        System.out.println(min + " " + max);
    }
}