import java.util.Scanner;

public class Verif_palindrom {

	public static void main(String[] args) {
		int og = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("n=");
		int n = sc.nextInt();
		int x = n;
		while (x != 0) {
			og = og * 10 + x % 10;
			x /= 10;
		}
		if (og == n)
			System.out.print("nr este palindrom");
		else
			System.out.print("nr nu este palindrom");

	}

}
