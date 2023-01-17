public class TestListe {
	public static void main(String [] args) {
		ListeLiniare l = new ListeLiniare (3);
		try {
			l.adSfarsit(5);
			l.adSfarsit(3);
			l.adSfarsit(6);
			l.adSfarsit(4);
		}
		catch (Exception e) {
			System.out.print (e);
		}
		System.out.print(l);
	}
}
