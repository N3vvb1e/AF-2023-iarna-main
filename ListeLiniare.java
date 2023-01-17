public class ListeLiniare {
	int []x; 
	int n, dim_max = 8;	
	
	ListeLiniare() {
	x = new int [dim_max];
	n = 0;
	}
		
	ListeLiniare (int dim) {
	dim_max = dim;
	x = new int [dim];
	n = 0;
	}

	void adSfarsit (int elem) throws Exception {
		if (n == dim_max)
			throw new Exception ("depasit");
		else
			x[n++] = elem;
	}
	
	public String toString() {
		String s = new String ("[");
		if (n > 0) {
			for (int i = 0; i < n; i++)
 				s += x[i] + ", ";
		}
		s += "]";
		return s;
	}
}
