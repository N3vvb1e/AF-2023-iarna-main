package maxim_2;

import java.util.Scanner;
//maxim a 2 numere nat
public class Maxim_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a=");
		int a = sc.nextInt();
		System.out.print("b=");
		int b = sc.nextInt();
		if (a > b)
			System.out.print("Max este " + a);
		else
			System.out.print("Max este " + b);
	}

}
