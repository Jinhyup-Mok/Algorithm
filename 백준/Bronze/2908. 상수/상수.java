import java.util.Scanner;

public interface Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt(), B = scan.nextInt();
        int answer;
        
        if(A % 10 == B % 10) {
            if((A%100)/10 != (B%100)/10 && 
            Math.max((A%100)/10, (B%100)/10) == (A%100)/10) answer = A;
            else {
                answer = B;
                if(A/100 != B/100 &&
                    Math.max(A/100, B/100) == (A/100)) answer = A;
                else answer = B;
            }
        } else {
            if(Math.max(A % 10, B % 10) == A % 10) answer = A;
            else answer = B;
        }
        String one = Integer.toString(answer%10);
        String ten = Integer.toString((answer % 100)/10);
        String hundred = Integer.toString(answer/100);
        System.out.println(one + ten + hundred);
    }
}