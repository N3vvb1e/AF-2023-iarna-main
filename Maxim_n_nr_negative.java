import java.util.Scanner;

public class Maxim_n_nr_negative {

	public static void main(String[] args) {
		int max = Integer.MIN_VALUE;
		Scanner sc = new Scanner(System.in);
		System.out.print("n=");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if (x > max && x < 0)
				max = x;
		}
		if (max == Integer.MIN_VALUE)
			System.out.print("nu exista nr  negative");
		else
			System.out.print(max);
	}

}
