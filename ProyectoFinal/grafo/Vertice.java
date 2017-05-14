package grafo;

public class Vertice{
  private String nombreVertice;
  private int numVertice;

	public Vertice(String nombreVertice) {
		this.nombreVertice = nombreVertice;
    numVertice = -1;
	}

	public String getNombreVertice() {
		return nombreVertice;
	}

	public void setNombre(String nombreVertice) {
		this.nombreVertice = nombreVertice;
	}

	public int getNumVertice() {
		return numVertice;
	}

	public void setNumVertice(int numVertice) {
		this.numVertice = numVertice;
	}

  public boolean equals(Vertice n){
    return nombreVertice.equals(n.getNombreVertice());
  }

	@Override
	public String toString() {
		return "Vertice [nombreVertice=" + nombreVertice + ", numVertice=" + numVertice + "]";
	}
}
