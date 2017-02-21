package tarea2;

import java.util.Scanner;

class Principal{

  static Scanner sc = new Scanner(System.in);
  static Lista lista = new Lista();
  public static void main(String[] args) {

    System.out.println("de que tama;o quieres la lista? (se llenan con numeros random)");
    int tam = sc.nextInt();


    //for (int i = 0; i < tam ; i++ ) {
    //  lista.agregar_cabeza_lista((int)(Math.random() * 1000));
    //}
    Azar(tam);
    System.out.println("Antes");
    lista.mostrar_lista();
    System.out.println("decendente Incersion");
    lista.acomodar_acendente_insercion();
    lista.mostrar_lista();
    Azar(tam);
    System.out.println("Antes");
    lista.mostrar_lista();
    System.out.println("decendente Burbuja");
    lista.acomodar_decendente_burbuja();
    lista.mostrar_lista();
    System.out.println("acendente Burbuja");
    lista.acomodar_acedente_burbuja();
    lista.mostrar_lista();
    Azar(tam);
    System.out.println("Antes");
    lista.mostrar_lista();
    System.out.println("acendente Seleccion");
    lista.acomodar_acedente_seleccion();
    lista.mostrar_lista();
    System.out.println("decendente Seleccion");
    lista.acomodar_decendente_seleccion();
    lista.mostrar_lista();
    /*Azar(tam);
    System.out.println("Antes");
    lista.mostrar_lista();
    /*System.out.println("decendente Insercion");
    lista.acomodar_decendente_insercion();
    lista.mostrar_lista();
    System.out.println("acendente Insercion");
    lista.acomodar_acendente_insercion();
    lista.mostrar_lista(); */
  }

  public static void Azar(int tam){
    for (int i = 0; i < tam ; i++ ) {
      lista.agregar_cabeza_lista((int)(Math.random() * 10));
    }
  }

}
