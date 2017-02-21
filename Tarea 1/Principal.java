import java.util.Scanner;

class Principal{

	static int[] TOTAL;
	public static void main(String[] args) {
		if (args.length > 0) {
			siContiene(args);
		}else{
			TOTAL = crearArreglo();
			System.out.println("Arreglo antes de ordenar");
			imprimir(TOTAL);
			trabajar(TOTAL);
		}
	}

	public static void siContiene(String[] args){
		TOTAL = new int[args.length];
		boolean entro = false;
		for (int i = 0; i < args.length; i++) {
    		try {
        		TOTAL[i] = Integer.parseInt(args[i]);
    		} catch (NumberFormatException ex) {
        		System.out.println("Dame numeros porfavor");
        		entro = true;
    		};
		}
		if (entro == false) {
			System.out.println("Arreglo antes de ordenar");
			imprimir(TOTAL);
			trabajar(TOTAL);
		}
	}

	public static int[] crearArreglo(){
		Scanner leer = new Scanner(System.in);
		System.out.println("De que tamaño quieres el arreglo");
		int arreglo[] = new int[leer.nextInt()];
		System.out.println();
		llenar(arreglo);
		return arreglo;
	}

	public static int[] llenar(int[] arr){
		for (int i=0; i < arr.length; i++) {
			arr[i] = (int) (Math.random()*20)+1;
		}
		return arr;
	}

	public static void imprimir(int[] arr){
		for (int i=0; i < arr.length ; i++ ) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println();
	}

	public static void trabajar(int[] arr){
		int hacer;
		Burbuja burbuja = new Burbuja();
		Insercion inserccion = new Insercion();
		Seleccion seleccion = new Seleccion();
		while(true){
			System.out.println("Que quieres hacer? \n1.- Burbuja acendente \n2.- Burbuja decendente \n3.- Seleccion acendente \n4.- Seleccion decendente \n5.- Inserccion acendente \n6.- Inserccion decendente \n7.- Desordenar Arreglo \n8.- Salir");
			System.out.println();
			Scanner leer = new Scanner(System.in);
			hacer = leer.nextInt();
			System.out.println();
			if (hacer == 8) {
				break;
			}else if (hacer == 7){
				arr = llenar(arr);
				System.out.println("Arreglo antes de ordenar");
				imprimir(arr);
			}else if (hacer == 6) {
				imprimir(inserccion.decendente(arr));
			}else if (hacer == 5) {
				imprimir(inserccion.acendente(arr));
			}else if (hacer == 4) {
				imprimir(seleccion.decendente(arr));
			}else if (hacer == 3) {
				imprimir(seleccion.acendente(arr));
			}else if (hacer == 2) {
				imprimir(burbuja.decendente(arr));
			}else if (hacer == 1) {
				imprimir(burbuja.acendente(arr));
			}else{
				System.out.println("Dame un numero valido porfavor");
			}
		}
	}
}
