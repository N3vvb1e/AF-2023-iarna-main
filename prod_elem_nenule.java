import java.util.Scanner;

public class prod_elem_nenule {

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
		int p = 1;
		boolean nenul = false;
		for (int i = 0; i < n; i++) {
			if (a[i][i] != 0) {
				p *= a[i][i];
				nenul = true;
			}
		}
		if (nenul)
			System.out.print("Produsul este: " + p);
		else
			System.out.print("nu avem elemente nenule");
	}

}
