import java.util.Scanner;

public class CautareBinara {

	static int[] a;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("x=");
		int x = sc.nextInt();
		System.out.print("n=");
		int n = sc.nextInt();
		a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int poz = cautare(0, n - 1, x);
		if (poz == -1)
			System.out.print("nu exista");
		else
			System.out.print(poz);
	}

	public static int cautare(int p, int u, int x) {
		if (p <= u) {
			int m = (p + u) / 2;
			if (x == a[m])
				return m;
			else {
				if (x < a[m])
					return cautare(p, m - 1, x);
				else
					return cautare(m + 1, u, x);
			}
		} else
			return -1;
	}
}
