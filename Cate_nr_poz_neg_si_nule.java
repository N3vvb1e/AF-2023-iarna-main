import java.util.Scanner;

public class Cate_nr_poz_neg_si_nule {

	public static void main(String[] args) {
		int poz = 0, neg = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("n=");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if (x < 0)
				neg++;
			else if (x > 0)
				poz++;
		}
		System.out.print(poz + " " + neg + " " + (n - (poz + neg)));
	}

}
