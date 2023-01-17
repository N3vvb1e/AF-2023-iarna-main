import java.util.Scanner;

public class reuniunea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n=");
		int n = sc.nextInt();
		System.out.print("m=");
		int m = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Elem vectorului a: ");
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		int[] b = new int[m];
		System.out.println("Elem vectorului b: ");
		for (int i = 0; i < m; i++)
			b[i] = sc.nextInt();
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
		for (int i = 0; i < m; i++) {
			boolean gasit = false;
			for (int j = 0; j < n; j++)
				if (b[i] == a[j]) {
					gasit = true;
					break;
				}
			if (!gasit)
				System.out.print(b[i] + " ");
		}
	}

}
