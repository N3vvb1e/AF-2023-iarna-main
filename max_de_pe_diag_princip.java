import java.util.Scanner;

public class max_de_pe_diag_princip {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n=");
		int n = sc.nextInt();
		int[][] a = new int[n][n];
		System.out.println("Matricea: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		int max = a[0][0];
		for (int i = 1; i < n; i++) {
			if(a[i][i] > max)
				max = a[i][i];
		}
		System.out.print("Maximul este: " + max);
	}

}
