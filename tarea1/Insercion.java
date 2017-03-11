public class Insercion {

    public static int[] acendente(int[] arg){
        int p, j;
    	int aux;
    	for (p = 1; p < arg.length; p++){ 
           	aux = arg[p]; 
           	j = p - 1; 
           	while ((j >= 0) && (aux < arg[j])){ 
                arg[j + 1] = arg[j];
              	j--;                   
           	}
    		arg[j + 1] = aux; 
    	}
		return arg;
	}

	public static int[] decendente(int[] arg){
		int p, j;
    	int aux;
    	for (p = 1; p < arg.length; p++){ 
           	aux = arg[p]; 
           	j = p - 1; 
           	while ((j >= 0) && (aux > arg[j])){ 
                arg[j + 1] = arg[j];
              	j--;                   
           	}
    		arg[j + 1] = aux; 
    	}
		return arg;
	} 
}