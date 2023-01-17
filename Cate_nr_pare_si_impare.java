import java.util.Scanner;

public class Cate_nr_pare_si_impare {

	public static void main(String[] args) {
		int ct_nr_pare = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("n=");
		int n = sc.nextInt();
		for (int i = 0; i < n; i ++) {
			int x = sc.nextInt();
			if (x % 2 == 0)
				ct_nr_pare ++;
		}
		System.out.print(ct_nr_pare + " " + (n - ct_nr_pare));
	}

}
