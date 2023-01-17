import java.util.Scanner;

public class Oglinditul {

	public static void main(String[] args) {
		int og = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("n=");
		int n = sc.nextInt();
		while (n != 0) {
			og = og * 10 + n % 10;
			n /= 10;
		}
		System.out.print(og);
	}

}
