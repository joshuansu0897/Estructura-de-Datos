package tarea4;

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
        while(indice.getEnlace().getEnlace() != null){
          indice = indice.getEnlace();
        }
        System.out.println("Se borro: "+indice.getEnlace().getValue());
        indice.setEnlace(null);
      }catch(Exception ex){
        System.out.println("Se borro: "+indice.getValue());
        indice.setValue(0);
        indice = null;
      }
    }else{
      System.out.println("Esta vacia la pila, no puedes borrar");
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

  public void print_pila(){
    Nodo n;

    n = primero;
    while (n != null) {
      System.out.println("Dato: "+n.getValue()+" Enlace: "+ n.getEnlace());
      n = n.getEnlace();
    }
  }
}
