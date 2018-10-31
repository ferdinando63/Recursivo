public class exe9 {

   public int repete (int n, int m, int i) {

    	if (n % 10 == m) {
	    	i++;
    	}

    	if (n % 10 == n) {
     		return i;
    	}

    	repete (n / 10, m, i);

   }

}
