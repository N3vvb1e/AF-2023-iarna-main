import java.util.Scanner;

public class Verif_nr_ord_cresc {

	public static void main(String[] args) {
		boolean ok = true;
		Scanner sc = new Scanner(System.in);
		System.out.print("n=");
		int n = sc.nextInt();
		System.out.print("a=");
		int a = sc.nextInt();
		int max = a;
		for (int i = 1; i < n; i++) {
			int x = sc.nextInt();
			if(x < max){
				ok = false;
				break;
			}
			max = x;
		}
		if(ok)
			System.out.print("nr sunt in ord crescatoare");
		else 
			System.out.print("nr nu sunt in ord cresc");
	}

}
