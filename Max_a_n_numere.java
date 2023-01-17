import java.util.Scanner;

public class Max_a_n_numere {

	public static void main(String[] args) {
		int max = Integer.MIN_VALUE;
		Scanner sc = new Scanner(System.in);
		System.out.print("n=");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if (x > max)
				max = x;
		}
		System.out.print(max);
	}

}
