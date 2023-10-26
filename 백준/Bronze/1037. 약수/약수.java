import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int[] arr = new int[T];
        for(int i=0; i<T; i++){
            arr[i] = scan.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for(int i=0; i<arr.length; i++) {
            if(max < arr[i]) max = arr[i];
            else if(min > arr[i]) min = arr[i];
        }
        System.out.println(max * min);
    }
}