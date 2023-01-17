import java.util.Scanner;

public class toate_pare {

	static int[] a;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n=");
		int n = sc.nextInt();
		a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		if (toatePare(0, n - 1))
			System.out.print("toate pare");
		else
			System.out.print("nu sunt toate pare");
	}

	public static boolean toatePare(int p, int u) {
		if (p == u)
			if (a[p] % 2 == 0)
				return true;
			else
				return false;
		int m = (p + u) / 2;
		return toatePare(p, m) && toatePare(m + 1, u);
	}

}
