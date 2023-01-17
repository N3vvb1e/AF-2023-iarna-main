import java.util.Scanner;

public class intersectia {

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
		boolean vida = true;
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				if (a[i] == b[j]) {
					System.out.print(a[i] + " ");
					vida = false;
					break;
				}
		if (vida)
			System.out.print("multimea vida");
	}

}
