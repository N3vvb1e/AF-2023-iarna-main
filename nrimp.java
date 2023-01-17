package recursivitate;

import java.util.Scanner;

public class nrimp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("x= ");
		int x = sc.nextInt();
		System.out.print(nr_imp(x));
	}
	
	public static int nr_imp(int n) {
		if (n <= 9)
			return n % 2;
		return nr_imp(n / 10) + n % 2;
	}
}
