import java.text.DecimalFormat;
import java.util.Scanner;

public class Minimizarea_Timpului_Mediu_de_Asteptare {

	static int []t;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n=");
		int n = sc.nextInt();
		t = new int[n];
		for (int i = 0; i < n; i++) 
			t[i] = sc.nextInt();
		quick(0, n - 1);
		double Tt = 0;
		for (int i = 0; i < n; i++){
			System.out.println("clientul cu timpul " + t[i]);
			Tt = Tt + (n - i) * t[i];
		}
		System.out.printf("%.2f", Tt / n);
		/*DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);
		System.out.println(df.format());*/
		/*float myFloat = 2.001f;
		String formattedString = String.format("%.02f", Tt / n);
		System.out.print(formattedString);*/
		/*double d = Tt/n;
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.print(df.format(d));*/
		/*DecimalFormat df = new DecimalFormat("#.00");
		double number = Tt / n;
		System.out.println(df.format(number));*/
	}

	public static void quick(int p, int u) {
		if (p < u) {
			int m = partitionare(p, u);
			quick(p, m - 1);
			quick(m + 1, u);
		}
	}
	
	public static int partitionare(int p, int u) {
		int pivot = t[u];
		int i = p;
		int aux;
		for (int j = p; j < u; j++) {
			if (t[j] < pivot) {
				aux = t[j];
				t[j] = t[i];
				t[i] = aux;
				i = i + 1;
			}
		}
		aux = t[u];
		t[u] = t[i];
		t[i] = aux;
		return i;
	}
	
}
