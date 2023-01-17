import java.util.Scanner;

public class maxim_pe_col {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n=");
		int n = sc.nextInt();
		System.out.print("m=");
		int m = sc.nextInt();
		int[][] a = new int[n][m];
		System.out.println("Matricea: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for (int j = 0; j < m; j++) {
			int max = Integer.MIN_VALUE;
			for (int i = 0; i < n; i++) {
				if (a[i][j] > max)
					max = a[i][j];
			}
			System.out.println("Max de pe col " + "este: " + max);
		}
	}

}
