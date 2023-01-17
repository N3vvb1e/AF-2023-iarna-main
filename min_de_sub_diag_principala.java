import java.util.Scanner;

public class min_de_sub_diag_principala {

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
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (a[i][j] < min)
					min = a[i][j];
			}
		}
		System.out.print("Minimul: " + min);
		
	}

}
