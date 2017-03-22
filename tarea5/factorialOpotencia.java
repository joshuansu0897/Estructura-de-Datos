import java.util.Scanner;

class factorialOpotencia{
  static String seguir = "si";
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    if (seguir.equals("si")) {
      System.out.println("Que quieres hacer?(1.-Factorial 2.-Potencia)");
      int hacer = sc.nextInt();
      if (hacer == 1) {
        System.out.println("Dame el numero al cual se aplicara el Factorial");
        int num = sc.nextInt();
        System.out.println(factorial(num));
      }else{
        System.out.println("Dame el numero al cual se aplicara la potencia");
        int num = sc.nextInt();
        System.out.println("Dame la potencia");
        int pot = sc.nextInt();
        System.out.println(potencia(num,pot));
      }
      System.out.println("Que quieres hacer mas operaciones? (si no)");
      seguir = sc.next();
      System.out.println();
      main(args);
    }
  }

  static int factorial(int n){
    if (n == 1) {
      return n;
    }else{
      return n * factorial(n-1);
    }
  }

  static int tot = 1;
  static int potencia(int n, int p){
    if (p == 0) {
      return tot;
    }else{
      tot *= n;
      return potencia(n,(p-1));
    }
  }
}
