package arbol;

//Para arbol binario
public class Nodo{
  Object dato;
  Nodo izq;
  Nodo der;

  public Nodo(Object valor){
    dato = valor;
    izq = null;
    der = null;
  }

  public Nodo(Nodo hijo_izq,Object valor, Nodo hijo_der){
    dato = valor;
    izq = hijo_izq;
    der = hijo_der;
  }

  Object getValorNodo(){
    return dato;
  }

  Nodo getSubArbolIzq(){
    return izq;
  }

  Nodo getSubArbolDer(){
    return der;
  }

  void setValorNodo(Object valor){
    dato = valor;
  }

  void setRamaIzq(Nodo n){
    izq = n;
  }

  void setRamaDer(Nodo n){
    der = n;
  }
}
