import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String[] cro_alphabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		for(String s : cro_alphabet) { // for(변수 : 배열)
			input = input.replace(s, "0");
		}
		System.out.println(input.length());
	}
}