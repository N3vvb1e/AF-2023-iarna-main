import java.util.Scanner;
import java.lang.Math;

public class Backtracking1 {

	static int[] x;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n=");
		int n = sc.nextInt();
		x = new int[n];
		Backtracking();
	}
	
	public static void Backtracking() {
		for (int i = 0; i < x.length; i++)
			x[i] = -1;
		int k = 0;
		while (k >= 0) {
			if (k == x.length) {
				retineSol();
				k -= 1;
			} else {
				if (x[k] < x.length - 1) {
					x[k] += 1;
					if (continuare(k))
						k += 1;
				} else {
					x[k] = -1;
					k -= 1;
				}
			}
		}
	}
	
	public static boolean continuare(int k) {
		for (int i = 0; i < k; i++)
			if ((x[k] == x[i]) || (Math.abs(x[k] - x[i]) == k - i))
				return false;
		return true;
	}
	
	public static void retineSol() {
		for (int i = 0; i < x.length; i++) {
			System.out.println("dama " + i + " si linia " + i + " coloana " + x[i]);
		}
		for (int i = 0; i < x.length; i++)
		{
			for (int j = 0; j < x.length; j++)
				if(j == x[i])
					System.out.print("x");
				else 
					System.out.print("0");
		System.out.println();	
		}
		System.out.println();
		}
}
