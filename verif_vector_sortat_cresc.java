package subprograme;

import java.util.Scanner;

public class verif_vector_sortat_cresc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n=");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("elem vector: ");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		if (sortat(a, n))
			System.out.print("este sortat");
		else
			System.out.print("nu este sortat");
	}

	public static boolean sortat(int a[], int n) {
		for (int i = 0; i < n - 1; i++)
			if (a[i] > a[i + 1])
				return false;
		return true;
	}
}
