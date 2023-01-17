import java.util.Scanner;

public class maximizarea_sumei_produselor {

	static int[] a, b;
	
	public static void quicksort(int[] x, int p, int u) {
		if (p < u) {
			int m = partitionare(x, p, u);
			quicksort(x, p, m - 1);
			quicksort(x, m + 1, u);
		}
	}

	public static int partitionare(int[] x, int p, int u) {
		int pivot = x[u];
		int i = p;
		for (int j = p; j < u; j++)
			if (x[j] < pivot) {
				int aux = x[i];
				x[i] = x[j];
				x[j] = aux;
				i += 1;
			}
		int aux = x[i];
		x[i] = x[u];
		x[u] = aux;
		return i;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n=");
		int n = sc.nextInt();
		a = new int [n];
		b = new int [n];
		for (int i = 0; i < n; i++) 
			a[i] = sc.nextInt();
		for (int i = 0; i < n; i++) 
			b[i] = sc.nextInt();
		quicksort(a, 0, n - 1);
		quicksort(b, 0, n - 1);
		int s = 0;
		for (int i = 0; i < n; i++) {
			s += a[i] * b[i];
			System.out.print(a[i] + " ");
		} 
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		System.out.print(s);
	}

}
