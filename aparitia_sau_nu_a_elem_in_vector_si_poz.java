import java.util.Scanner;

public class aparitia_sau_nu_a_elem_in_vector_si_poz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n=");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Elem vectorului: ");
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		System.out.print("y=");
		int y = sc.nextInt();
		boolean gasit = false;
		for (int i = 0; i < n; i++)
			if (a[i] == y) {
				gasit = true;
				System.out.print(i + " ");
			}
		if (!gasit)
			System.out.print("nu se gaseste in vector");
	}

}
