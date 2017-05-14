package grafo;

public class RecorrerGrafo{

  public static int[]recorrerAnchura(GrafoMatriz g, String org){
	   int w, v;
     int [] m;
     v = g.numVertice(org);
     if (v < 0) System.out.println("Vértice origen no existe");
     Cola cola = new Cola();
     m = new int[g.verts.length];
     for (int i = 0; i < g.verts.length; i++){
       m[i] = 5;
     }
     m[v] = 0;
     cola.push(v);
     while (! cola.empty()){
       w = cola.pop();
       System.out.println("Vértice " + g.verts[w] + "visitado");
       for (int u = 0; u < g.verts.length; u++){
         if ((g.matAd[w][u] == 1) && (m[u] == 5)){
           m[u] = m[w] + 1;
           cola.push(u);
         }
       }
    }
    return m;
  }

  static public int[] recorrerProf(GrafoMatriz g, String org){
    int v, w;
    Pila pila = new Pila();
    int [] m;
    m = new int[g.verts.length];
    v = g.numVertice(org);
    if (v < 0) System.out.println("Vértice origen no existe");
    for (int i = 0; i < g.verts.length; i++){
      m[i] = 5;
    }
    m[v] = 0;
    pila.push(v);
    while (! pila.empty()){
      w = pila.pop();
      System.out.println("Vértice " + g.verts[w] + "visitado");
      for (int u = 0; u < g.verts.length; u++){
        if ((g.matAd[w][u] == 1) && (m[u] == 5)){
          m[u] = m[w] + 1;
          pila.push(u);
        }
      }
   }
    return m;
  }
}
