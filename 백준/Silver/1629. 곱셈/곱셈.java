import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static long A, B, C;

	public static void main(String[] args) throws Exception {
		st = new StringTokenizer(br.readLine());
		A = Long.parseLong(st.nextToken());
		B = Long.parseLong(st.nextToken());
		C = Long.parseLong(st.nextToken());

		System.out.println(multiple(B));
	}

	private static long multiple(long b) {
		if (b == 1)
			return A % C;

		long value = multiple(b/2) % C;
		if (b % 2 == 1) {
			return value * value % C * A % C;
		} else {
			return value * value % C;
		}
	}
}