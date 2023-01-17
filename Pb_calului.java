import java.util.Scanner;

public class Pb_calului {

	static int[][] x;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n=");
		int n = sc.nextInt();
		x = new int[n][n];
		back_rec(1, 0, 0);
	}

	public static void back_rec(int k, int l, int c) {
		if (0 <= l && l <= x.length - 1 && 0 <= c && c <= x.length - 1 && x[l][c] == 0) {
			x[l][c] = k;
			if (k == x.length * x.length)
				retineSol();
			else {
				back_rec(k + 1, l - 1, c - 2);
				back_rec(k + 1, l - 2, c - 1);
				back_rec(k + 1, l - 2, c + 1);
				back_rec(k + 1, l - 1, c + 2);
				back_rec(k + 1, l + 1, c + 2);
				back_rec(k + 1, l + 2, c + 1);
				back_rec(k + 1, l + 2, c - 1);
				back_rec(k + 1, l + 1, c - 2);
			}
			x[l][c] = 0;
		}
	}

	public static void retineSol() {
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x.length; j++)
				System.out.print(x[i][j] + " ");
			System.out.println();
		}
		System.out.println();
	}

}
