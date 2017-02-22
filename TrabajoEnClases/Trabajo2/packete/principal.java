package packete;

class principal{
  public static void main(String[] args) {
    pila p = new pila();
    pila p2 = new pila(3);

    p.push(30);
    p.push(20);
    p.push(25);

    p2.push(30);
    p2.push(20);
    p2.push(25);

    System.out.println("Pila "+String.valueOf(p2)+" esta llena?: "+p2.full());

    System.out.println("cima "+p.cima_value_pila());
    System.out.println("borrando "+p.pop());
    System.out.println();

    System.out.println("cima "+p.cima_value_pila());
    System.out.println("borrando "+p.pop());
    System.out.println();

    System.out.println("cima "+p.cima_value_pila());
    System.out.println("borrando "+p.pop());

  }
}
