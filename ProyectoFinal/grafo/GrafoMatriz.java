package grafo;

public class GrafoMatriz{
  int numVerts;
  Vertice[] verts;
  int[][] matAd;
  static int maxVerts = 20;

  public GrafoMatriz(){
    this(maxVerts);
  }

  public GrafoMatriz(int num){
    matAd = new int [num][num];
    verts = new Vertice[num];
    for (int i = 0; i < num; i++){
      for (int j = 0; i < num; i++){
        matAd[i][j] = 0;
      }
      numVerts = 0;
    }
  }

  public void nuevoVertice (String nom){
    boolean esta = numVertice(nom) >= 0;
    if (!esta){
      Vertice v = new Vertice(nom);
      v.setNumVertice(numVerts);
      verts[numVerts++] = v;
    }
  }

  public int numVertice(String vs){
    Vertice v = new Vertice(vs);
    boolean encontrado = false;
    int i = 0;
	  for (; (i < numVerts) && !encontrado;i++){
		   encontrado = verts[i].equals(v);

		   if (encontrado) break;
	  }
    return i < numVerts ? i : -1;
  }

  public void nuevoArcoNom(String a, String b){
    int va, vb;
    va = numVertice(a);
	  vb = numVertice(b);
	  if (va < 0 || vb < 0)System.out.println("Vértice no existe");
	  matAd[va][vb] = 1;
  }

  public void nuevoArcoNum(int va, int vb){
    if (va < 0 || vb < 0)System.out.println("Vértice no existe");
    matAd[va][vb] = 1;
  }

  public boolean adyacenteNom(String a, String b){
    int va, vb;
    va = numVertice(a);
	  vb = numVertice(b);
	  if (va < 0 || vb < 0)System.out.println("Vértice no existe");
	  return matAd[va][vb] == 1;
  }

  public boolean adyacenteNum(int va, int vb){
    if (va < 0 || vb < 0)System.out.println("Vértice no existe");
    return matAd[va][vb] == 1;
  }
}
