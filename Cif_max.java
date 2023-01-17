import java.util.Scanner;

public class Cif_max {

	public static void main(String[] args) {
		int cif_max = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("n=");
		int n = sc.nextInt();
		while (n > 0) {
			if (n % 10 > cif_max)
				cif_max = n % 10;
			n /= 10;
		}
		System.out.print(cif_max);
	}

}
