package recursivitate;

import java.util.Scanner;

public class sumacif {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("x= ");
		int x = sc.nextInt();
		System.out.print(sum_cif(x));
	}

	public static int sum_cif(int n) {
		if (n == 0)
			return 0;
		return sum_cif(n / 10) + n % 10;
	}
}
