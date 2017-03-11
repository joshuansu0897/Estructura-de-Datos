package tarea4;

class principal{
  public static void main(String[] args) {
    listapila pila = new listapila();

    pila.push(4);
    pila.push(8);
    pila.push(10);
    pila.push(11);
    pila.push(34);
    pila.push(100); 

    pila.print_pila();

    pila.pop();
    pila.pop();
    pila.pop();
    pila.pop();
    pila.pop();

    pila.print_pila();
    pila.pop();
    pila.print_pila();
    pila.pop();
    pila.print_pila();

  }
}
