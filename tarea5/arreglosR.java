import java.util.Scanner;

class arreglosR{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arreglo[];
    System.out.println("quiere usasr el programa escriba 'si' o 'no'");
    if (sc.next().equals("si")) {
      System.out.println("De que tamaño es el arreglo?");
      arreglo = crearArreglo(sc.nextInt());
      System.out.println("...Arreglo creado...");
      imprimir(arreglo);
      System.out.println("Que desea hacer? (1.suma 2.multiplicacion)");
      int n = sc.nextInt();
      if (n == 1) {
        suma(arreglo, 0);
      }else if(n == 2){
        multiplicacion(arreglo, 0);
      }else{
        System.out.println("Error de numero");
      }
      main(args);
    }
  }

  static int[] crearArreglo(int n){
    int[] arr = new int [n];
    for (int i=0 ; i<arr.length ;i++) {
      arr[i] = (int)(Math.random() *20);
    }
    return arr;
  }

  static void imprimir(int arr[]){
    for (int t: arr ) {
      System.out.print(t+"\t");
    }
    System.out.println();
  }

  static int su = 0;
  static void suma(int arr[], int n){
    if (n == arr.length) {
      System.out.println(su);
    }else{
      su += arr[n];
      suma(arr, n+1);
    }
  }

  static int mul = 1;
  static void multiplicacion(int arr[], int n){
    if (n == arr.length){
      System.out.println(mul);
    }else{
      mul *= arr[n];
      multiplicacion(arr, n+1);
    }
  }
}
