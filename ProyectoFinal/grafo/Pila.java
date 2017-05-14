package grafo;

public class Pila {
  Nodo primero;

  public Pila(){
      primero = null;
  }

  public Pila push(int valor){
    Nodo nuevo = new Nodo(valor);
    nuevo.setEnlace(primero);
    primero = nuevo;
    return this;
  }

  public boolean empty(){
    return primero == null;
  }

  public int pop(){
    int n = 0;
    if (!empty()) {
      Nodo indice;
      indice = primero;
      try{
        n = primero.getValue();
        primero = indice.getEnlace();
      }catch(Exception ex){
        n = primero.getValue();
        primero = null;
      }
    }
    return n;
  }

  public int tama(){
    Nodo n;
    n = primero;
    int contador =0;
    while (n != null) {
      System.out.println("Dato: "+n.getValue()+" Enlace: "+ n.getEnlace());
      n = n.getEnlace();
      contador++;
    }
    return contador;
  }

  public int cima(){
    return primero.getValue();
  }

  public void print_pila(){
    Nodo n;

    n = primero;
    while (n != null) {
      System.out.println("Dato: "+n.getValue()+" Enlace: "+ n.getEnlace());
      n = n.getEnlace();
    }
  }
}
