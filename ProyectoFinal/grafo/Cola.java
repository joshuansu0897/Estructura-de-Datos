package grafo;

public class Cola {
  Nodo primero;

  public Cola(){
      primero = null;
  }

  public Cola push(int valor){
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
        while(indice.getEnlace().getEnlace() != null){
          indice = indice.getEnlace();
        }
        n = indice.getEnlace().getValue();
        indice.setEnlace(null);
      }catch(Exception ex){
        n = indice.getValue();
        primero = null;
      }
    }else{
      System.out.println("Esta vacia la pila, no puedes borrar");
    }
    return n;
  }

  public int tama(){
    Nodo n;
    n = primero;
    int contador = 0;
    while (n != null) {
      n = n.getEnlace();
      contador++;
    }
    return contador;
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
