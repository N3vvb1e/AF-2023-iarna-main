import java.util.Scanner;

public class sortat_cresc {

	static int[] a;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n=");
		int n = sc.nextInt();
		a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		if (esteSortat(0, n - 1))
			System.out.print("vect este sortat");
		else
			System.out.print("vect nu este sortat");
	}

	public static boolean esteSortat(int p, int u) {
		if (p == u)
			return true;
		else {
			int m = (p + u) / 2;
			return esteSortat(p, m) && esteSortat(m + 1, u) && a[m] <= a[m + 1];
		}
	}
	
}
