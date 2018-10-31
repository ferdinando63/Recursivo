public class exe1 {

   public int fator (int n) {

    	if (n < 2) {
         return 1;
    	}

	    return n * fator (n - 1);

   }

}
