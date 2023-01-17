import java.util.Scanner;

public class Quicksort {

	static int[] a;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n=");
		int n = sc.nextInt();
		a = new int[n];
		System.out.println("se citeste vectorul:");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		quicksort(0, n - 1);
		System.out.println("vectorul sortat:");
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
	}

	public static void quicksort(int p, int u) {
		if (p < u) {
			int m = partitionare(p, u);
			quicksort(p, m - 1);
			quicksort(m + 1, u);
		}
	}

	public static int partitionare(int p, int u) {
		int pivot = a[u], i = p, aux;
		for (int j = p; j < u; j++) {
			if (a[j] < pivot) {
				aux = a[i];
				a[i] = a[j];
				a[j] = aux;
				i++;
			}
		}
		aux = a[i];
		a[i] = a[u];
		a[u] = aux;
		return i;
	}
}
