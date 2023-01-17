/*
package recursivitate;

import java.util.Scanner;

public class suma_elem_vect {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("x= ");
		int x = sc.nextInt();
		int []v = new int[x];
		for (int i = 0; i < x; i++)
			v[i] = sc.nextInt();
		System.out.print(suma(0, x, v));
	}
	
	public static int suma(int i, int n, int []v) {
		if(i == n - 1)
			return v[i];
		return suma(i + 1, n, v) + v[i];
	}
}
*/

package recursivitate;

import java.util.Scanner;

public class suma_elem_vect {

	static int []v;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("x= ");
		int x = sc.nextInt();
		v = new int[x];
		for (int i = 0; i < x; i++)
			v[i] = sc.nextInt();
		System.out.print(suma(0));
	}
	
	public static int suma(int i) {
		if(i == v.length - 1)
			return v[i];
		return suma(i + 1) + v[i];
	}
}

