package arbol;

public class ArbolBinario{
  Nodo raiz;

  public ArbolBinario(){
    raiz = null;
  }

  public ArbolBinario(Nodo raiz){
    this.raiz = raiz;
  }

  Nodo getRaiz(){
    return raiz;
  }

  boolean isEmpty(){
    return raiz == null;
  }

  Nodo nuevoArbol(Nodo hijo_izq, Object valor, Nodo hijo_der){
    return new Nodo(hijo_izq, valor, hijo_der);
  }
}
