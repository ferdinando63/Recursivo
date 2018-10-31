public class exe4 {

   public int somav (int vet[], int n) {

	    if (n == 1) {
	    	return vet[0];
     	}

    	return vet[n - 1] + somav (vet, n - 1);

   }

}
