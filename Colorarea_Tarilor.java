import java.util.Scanner;

public class Colorarea_Tarilor {

	static int[] x;
	static String[] culoare;
	static int[][] v;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n=");
		int n = sc.nextInt();
		x = new int[n];
		v = new int [n][n];
		for (int i = 0; i < n - 1; i++) 
			for (int j = i + 1; j < n; j++) {
				v[i][j] = sc.nextInt();
		}
		System.out.print("m=");
		int m = sc.nextInt();
		culoare = new String[m];
		for (int i = 0; i < m; i++)
			culoare[i] = sc.next();
		Backtracking();
	}

	public static void Backtracking() {
		for (int i = 0; i < x.length; i++)
			x[i] = -1;
		int k = 0;
		while (k >= 0) {
			if (k == x.length) {
				retineSol();
				k -= 1;
			} else {
				if (x[k] < culoare.length - 1) {
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
	
	public static boolean continuare(int k) {
		for (int i = 0; i < k; i++)
			if ((x[i] == x[k]) && v[i][k] == 1)
				return false;
		return true;
	}
	
	public static void retineSol() {
		for (int i = 0; i < x.length; i++)
		{
			System.out.print("tara " + i + " cu " + culoare[x[i]]);
		}
		System.out.println();
	}
	
}
