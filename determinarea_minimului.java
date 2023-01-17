package subprograme;

import java.util.Scanner;

public class determinarea_minimului {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("x=");
		int x = sc.nextInt();
		System.out.print("y=");
		int y = sc.nextInt();
		System.out.print(minim(x, y));
	}

	public static int minim(int a, int b) {
		if(a < b)
			return a;
		return b;
	}
}
