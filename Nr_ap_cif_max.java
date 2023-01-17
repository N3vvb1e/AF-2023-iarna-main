import java.util.Scanner;

public class Nr_ap_cif_max {

	public static void main(String[] args) {
		int cif_max = -1, nr_aparitii = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("n=");
		int n = sc.nextInt();
		while (n > 0) {
			if (n % 10 > cif_max) {
				cif_max = n % 10;
				nr_aparitii = 1;
			} else if (n % 10 == cif_max)
				nr_aparitii++;
			n /= 10;
		}
		System.out.print(cif_max + " " + nr_aparitii);
	}

}