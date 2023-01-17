import java.util.Scanner;

public class nr_elem_poz_vect {

	static int[] a;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n= ");
		int n = sc.nextInt();
		a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		System.out.print(nrpozDI(0, n - 1));
	}

	public static int nrpozDI(int p, int u) {
		if (p == u) {
			if (a[p] > 0)
				return 1;
			else
				return 0;
		}
		int m = (p + u) / 2;
		return nrpozDI(p, m) + nrpozDI(m + 1, u);
	}
}
