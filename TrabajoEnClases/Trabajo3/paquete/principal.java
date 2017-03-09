package paquete;

public class principal{
  public static void main(String[] args) {
    Cola cola = new Cola();

    cola.agregar(5);
    cola.agregar(10);
    cola.agregar(3);

    System.out.println(cola.quitar());
    System.out.println(cola.quitar());

    cola.agregar(9);
    cola.agregar(6);

    System.out.println(cola.quitar());
    System.out.println(cola.quitar());

  }
}
