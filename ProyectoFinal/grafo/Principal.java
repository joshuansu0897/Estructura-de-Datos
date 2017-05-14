package grafo;

public class Principal{
  public static void main(String[] args) {
    GrafoMatriz g = new GrafoMatriz(7);

    g.nuevoVertice("a");
    g.nuevoVertice("e");
    g.nuevoVertice("i");
    g.nuevoVertice("o");
    g.nuevoVertice("u");
    g.nuevoVertice("k");
    g.nuevoVertice("l");

    System.out.println(" ----- creacion Vertices ------- ");

    g.nuevoArcoNom("u","i");
    g.nuevoArcoNom("i","o");
    g.nuevoArcoNom("o","a");
    g.nuevoArcoNom("a","k");
    g.nuevoArcoNom("o","l");
    g.nuevoArcoNom("l","k");
    g.nuevoArcoNom("k","e");
    g.nuevoArcoNom("e","i");
    g.nuevoArcoNom("e","o");

    System.out.println(" ----- creacion Arcos ------- ");

    System.out.println(" ----- iniciando recorrido anchura ------- ");
    int grafoAnc[] = RecorrerGrafo.recorrerAnchura(g,"u");
    for (int i : grafoAnc) {
      System.out.print(i+"\t");
    }
    System.out.println();
    System.out.println(" ----- iniciando recorrido Prof ------- ");
    int grafoPro[] = RecorrerGrafo.recorrerProf(g,"u");

    for (int i : grafoPro) {
      System.out.print(i+"\t");
    }
    System.out.println();
  }
}
