import java.util.Scanner;

public class daca_diag_sec_sortata_cresc {

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
		int elem = a[0][n - 1];
		boolean sortat = true;
		for (int i = 1; i < n; i++)
		{
			if (elem > a[i][n - i - 1]) {
				sortat = false;
				break;
			}
			else 
				elem = a[i][n - i - 1];
		}
		if (sortat)
			System.out.print("este sortata");
		else
			System.out.print("nu este sortata");

	}

}
