package recursivitate;

import java.util.Scanner;

public class prodcif {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("x= ");
		int x = sc.nextInt();
		System.out.print(prod_cif(x));
	}

	public static int prod_cif(int n) {
		if (n <= 9)
			return n;
		return prod_cif(n / 10) * (n % 10);
	}
}
