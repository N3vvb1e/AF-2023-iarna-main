import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileReader(".//src/matrix.txt"));
		int n = sc.nextInt(), m = sc.nextInt();
		int[][] a = new int[n][m];

		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				a[i][j] = sc.nextInt();

		int exits = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (a[i][j] == 0) {
					if (i == 0 || i == n - 1 || j == 0 || j == m - 1) {
						exits++;
						System.out.println("Exit found at position (" + i + ", " + j + ")");
					}
				}
			}
		}
		System.out.println("Number of exits: " + exits);
		sc.close();
	}

}
