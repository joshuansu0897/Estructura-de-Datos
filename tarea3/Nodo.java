package tarea3;

class Nodo {
  private int dato;
  private Nodo enlace;

  public Nodo(int valor){
    dato = valor;
    enlace = null;
  }

  public Nodo(int valor, Nodo enlaceP){
    dato = valor;
    enlace = enlaceP;
  }

  public int getValue(){
    return dato;
  }

  public Nodo getEnlace(){
    return enlace;
  }

  public void setEnlace(Nodo enlaceP){
    this.enlace = enlaceP;
  }
}
