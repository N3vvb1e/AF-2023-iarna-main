import java.util.Scanner;

public class nr_de_elem_poz_neg_nule_diag_sec {

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
		int poz = 0, neg = 0, nul = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (a[i][j] == 0)
					nul++;
				else if (a[i][j] > 0)
					poz++;
				else
					neg++;
			}
		}
		System.out.print(poz + " " + neg + " " + nul);

	}
}
