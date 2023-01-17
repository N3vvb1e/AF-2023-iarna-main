import java.util.Scanner;

public class nr_elem_strict_poz_tr_est {

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
		int ct_poz = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i < j) && (i + j > n - 1))
					if (a[i][j] > 0)
						ct_poz++;
			}
		}
		System.out.print("numaru de elemente strict poz: " + ct_poz);
	}

}
