import java.util.Scanner;

public class Verif_prim {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("x=");
		int x = sc.nextInt();
		boolean prim = true;
		if (x < 2 || (x > 2 && x % 2 == 0))
			prim = false;
		for (int d = 3; d * d <= x; d += 2)
			if (x % d == 0) {
				prim = false;
				break;
			}
		if (prim)
			System.out.print("numarul este prim");
		else
			System.out.print("numarul nu este prim");
	}

}
