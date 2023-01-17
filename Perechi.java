import java.util.Scanner;

public class Perechi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ct = 0;
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		for (int i = 0; i < n - 1; i++)
			for (int j = i + 1; j < n; j++)
				if (a[i] + a[j] > 0) {
					ct++;
					System.out.println(a[i] + " " + a[j]);
				}
		System.out.print(ct);
	}

}
