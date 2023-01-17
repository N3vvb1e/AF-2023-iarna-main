import java.util.Scanner;

public class Turnurile_Hanoi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n=");
		int n = sc.nextInt();	
		Hanoi(n, 1, 3);
	}

	public static void Hanoi(int n, int i, int j) {
		if (n > 0) {
			Hanoi(n - 1, i, 6 - i - j);
			System.out.println("muta un disc de pe " + i + " pe " + j);
			Hanoi(n - 1, 6 - i - j, j);
		}	
	}
}
