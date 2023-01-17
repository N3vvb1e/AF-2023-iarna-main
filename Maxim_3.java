import java.util.Scanner;

public class Maxim_3 {

	public static void main(String[] args) {
		int max = Integer.MIN_VALUE;
		Scanner sc = new Scanner(System.in);
		System.out.print("a=");
		int a = sc.nextInt();
		System.out.print("b=");
		int b = sc.nextInt();
		System.out.print("c=");
		int c = sc.nextInt();
		if (a > b)
			max = a;
		else
			max = b;
		if (c > max)
			max = c;
		System.out.print(max);
	}

}
