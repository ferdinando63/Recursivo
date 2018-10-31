public class exe6 {

   public int potencia (int k, int n) {

    	if (n == 1) {
    		return k;
    	}

    	return k * potencia (k, n - 1);

   }

}
