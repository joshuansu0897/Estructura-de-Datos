package tarea3;

class principal{
  public static void main(String[] args) {
    listapila pila = new listapila();
    System.out.println("El tama de la lista es: "+pila.tama());
    for (int i=0; i < 5 ;i++ ) {
      pila.push(i);
    }
    System.out.println("El tama de la lista es: "+pila.tama());
    pila.print_pila();
    for (int i=0; i<5;i++ ) {
      pila.pop();
    }
    pila.pop();
    pila.print_pila();
    pila.pop();
  }
}
