import java.util.Scanner;

public class Backtracking {

	static int[] a, x;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n=");
		int n = sc.nextInt();
		a = new int[n];
		x = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		backtracking();
	}

	public static void backtracking() {
		for (int i = 0; i < a.length; i++)
			x[i] = -1;
		int k = 0;
		while (k >= 0) {
			if (k == a.length) {
				retineSol();
				k -= 1;
			} else {
				if (x[k] < a.length - 1) {
					x[k] += 1;
					if (continuare(k))
						k += 1;
				} else {
					x[k] = -1;
					k -= 1;
				}
			}
		}
	}

	public static void retineSol() {
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[x[i]] + " ");
		}
		System.out.println();
	}

	public static boolean continuare(int k) {
		for (int i = 0; i < k; i++)
			if (x[k] == x[i])
				return false;
		return true;
	}
}
