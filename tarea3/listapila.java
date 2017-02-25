package tarea3;

public class listapila {
  Nodo primero;

  public listapila(){
      primero = null;
  }

  public listapila push(int valor){
    Nodo nuevo = new Nodo(valor);
    nuevo.setEnlace(primero);
    primero = nuevo;
    return this;
  }

  public boolean empty(){
    return primero == null;
  }

  public void pop(){
    if (!empty()) {
      Nodo indice;
      indice = primero;
      try{
        System.out.println("Se borro: "+primero.getValue());
        primero = indice.getEnlace();
      }catch(Exception ex){
        System.out.println("Se borro: "+primero.getValue());
        primero = null;
      }
    }
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
