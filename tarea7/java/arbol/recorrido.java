package arbol;

class recorrido{
  public static void preorden(Nodo a){
    if(a != null){
      System.out.print(a.getValorNodo()+ " ");
      preorden(a.getSubArbolIzq());
      preorden(a.getSubArbolDer());
    }
  }

  public static void inorden(Nodo a){
    if(a != null){
      inorden(a.getSubArbolIzq());
      System.out.print(a.getValorNodo()+ " ");
      inorden(a.getSubArbolDer());
    }
  }

  public static void postorden(Nodo a){
    if(a != null){
      postorden(a.getSubArbolIzq());
      postorden(a.getSubArbolDer());
      System.out.print(a.getValorNodo()+ " ");
    }
  }
}
