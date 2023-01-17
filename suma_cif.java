package subprograme;

import java.util.Scanner;

public class suma_cif {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n=");
		int n = sc.nextInt();
		System.out.print(suma(n));
	}
	
	public static int suma(int n) {
		int s = 0;
		while(n > 0) {
			s += (n % 10);
			n /= 10;
		}
		return s;
	}

}
