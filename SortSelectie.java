import java.util.Scanner;

public class SortSelectie {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int min, poz;
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		for (int i = 0; i < n - 1; i++) {
			min = a[i];
			poz = i;
			for (int j = i + 1; j < n; j++)
				if (a[j] < min) {
					min = a[j];
					poz = j;
				}
			int aux = a[i];
			a[i] = a[poz];
			a[poz] = aux;
		}
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
	}

}
