import java.util.Scanner;

class alfabeto{

  static boolean mayor;
  static boolean AaZ;
  static String seguir = "si";
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    if (seguir.equals("si")) {
      System.out.println("Escribe 'mayor' si quieres que sean mayusculas o 'menor' si quieres que sean minusculas");
      if (sc.next().equals("mayor")) {
        mayor = true;
      }else{
        mayor = false;
      }
      System.out.println("Escribe 'si' para alfabeto de A a la Z o 'no' para Z a la A");
      if (sc.next().equals("si")) {
        AaZ = true;
      }else{
        AaZ = false;
      }
      int con= 0;
      if (mayor) {
        int n = 65;
        imprimir(AaZ, n, con);
      }else{
        int n = 97;
        imprimir(AaZ, n, con);
      }
      System.out.println("Que quieres hacer mas operaciones? (si no)");
      seguir = sc.next();
      System.out.println();
      main(args);
    }
  }

  static void imprimir(boolean a_z, int num, int con){
    if (a_z && con<26) {
      System.out.println((char)num);
      con++;
      imprimir(a_z, (num+1), con);
    }else if(con<26){
      System.out.println((char)(num+25));
      con++;
      imprimir(a_z, (num-1), con);
    }
  }
}
