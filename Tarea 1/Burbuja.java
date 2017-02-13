public class Burbuja{

	public static int[] acendente(int[] arg){
		int temporal;
		for (int i=0; i < arg.length ; i++) {
			for (int j=0; j<i ; j++) {
				if (arg[i] < arg[j]) {
					temporal = arg[j];
					arg[j] = arg[i];
					arg[i] = temporal;
				}
			}
		}
		return arg;
	}

	public static int[] decendente(int[] arg){
		int temporal;
		for (int i = 0; i < arg.length ; i++) {
			for (int j=0; j<i ; j++) {
				if (arg[i] > arg[j]) {
					temporal = arg[j];
					arg[j] = arg[i];
					arg[i] = temporal;
				}
			}
		}
			return arg;
	}
}