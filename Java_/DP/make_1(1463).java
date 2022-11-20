import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
 
		int N = in.nextInt();
		System.out.println(make_1(N, 0));
	}
 
	public static int make_1(int N, int count) {
		if (N < 2) {
			return count;
		}
		return Math.min(make_1(N / 2, count + 1 + (N % 2)), make_1(N / 3, count + 1 + (N % 3)));
	}
}