import java.util.Scanner;

public class Verif_toate_cif_pare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n=");
		int n = sc.nextInt();
		boolean nr_bun = true;
		while (n > 0) {
			if (n % 2 == 1) {
				nr_bun = false;
				break;
			}
			n /= 10;
		}
		if (nr_bun)
			System.out.print("numarul are toate cifrele pare");
		else
			System.out.print("numarul nu are toate cif pare");
	}

}
