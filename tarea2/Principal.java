package tarea2;

import java.util.Scanner;

class Principal{

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Lista lista = new Lista();
    System.out.println("de que tama;o quieres la lista? (se llenan con numeros random)");
    int tam = sc.nextInt();

    for (int i = 0; i < tam ; i++ ) {
      lista.agregar_cabeza_lista((int)(Math.random() * 10));
    }
    lista.mostrar_lista();
    System.out.println("decendente Burbuja");
    lista.acomodar_decendente_burbuja();
    lista.mostrar_lista();
    System.out.println("acendente Burbuja");
    lista.acomodar_acedente_burbuja();
    lista.mostrar_lista();
    System.out.println("acendente Seleccion");
    lista.acomodar_acedente_seleccion();
    lista.mostrar_lista();
    System.out.println("decendente Seleccion");
    lista.acomodar_decendente_seleccion();
    lista.mostrar_lista();
  }

}
