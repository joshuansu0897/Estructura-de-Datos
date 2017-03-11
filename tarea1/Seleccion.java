public class Seleccion {

	public static int[] acendente(int[] arg){
		for (int i = 0; i<arg.length-1 ; i++) {
			int posi = i;
			for (int j = i+1; j <= arg.length-1 ; j++) {
				if (arg[j] < arg[posi]) {
					posi = j;
				}
			}

			if (posi != i) {
				int temporal = arg[posi];
				arg[posi] = arg[i];
				arg[i] = temporal;
			}
		}
		return  arg;
	}

	public static int[] decendente(int[] arg){
		for (int i = 0; i<arg.length-1 ; i++) {
			int posi = i;
			for (int j = i+1; j <= arg.length-1 ; j++) {
				if (arg[j] > arg[posi]) {
					posi = j;
				}
			}

			if (posi != i) {
				int temporal = arg[posi];
				arg[posi] = arg[i];
				arg[i] = temporal;
			}
		}
		return  arg;
	}	
}	