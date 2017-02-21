package tarea2;
class Lista{

    static Nodo primero;

    public Lista(){
        primero = null;
    }

    public Lista agregar_cabeza_lista(int valor){
      Nodo nuevo = new Nodo(valor);
      nuevo.setEnlace(primero);
      primero = nuevo;
      return this;
    }

    public Lista agregar_en_medio(int valor, int nuevoValor){
      Nodo nuevo, anterior;
      anterior = buscar_elemento(valor);
      if (anterior != null) {
        nuevo = new Nodo(nuevoValor);
        nuevo.setEnlace(anterior.getEnlace());
        anterior.setEnlace(nuevo);
      }
      return this;
    }

    public void acomodar_decendente_burbuja(){
      Nodo indice, segundo;
      for (indice = primero; indice != null ; indice = indice.getEnlace()) {
        for (segundo = primero ; segundo != indice ; segundo = segundo.getEnlace()) {
          if (indice.getValue() < segundo.getValue()) {
            int num = segundo.getValue();
            int num2 = indice.getValue();
            indice.setValue(num);
            segundo.setValue(num2);
          }
        }
      }
    }

    public void acomodar_acedente_burbuja(){
      Nodo indice, segundo;
      for (indice = primero; indice != null ; indice = indice.getEnlace()) {
        for (segundo = primero ; segundo != indice ; segundo = segundo.getEnlace()) {
          if (indice.getValue() > segundo.getValue()) {
            int num = segundo.getValue();
            int num2 = indice.getValue();
            indice.setValue(num);
            segundo.setValue(num2);
          }
        }
      }
    }

    public void acomodar_acedente_seleccion(){
      Nodo indice, segundo;
      for (indice = primero; indice != null ; indice = indice.getEnlace()) {
        for (segundo = indice ; segundo != null ; segundo = segundo.getEnlace()) {
          if (indice.getValue() < segundo.getValue()) {
            int num = segundo.getValue();
            int num2 = indice.getValue();
            indice.setValue(num);
            segundo.setValue(num2);
          }
        }
      }
  	}

    public void acomodar_decendente_seleccion(){
      Nodo indice, segundo;
      for (indice = primero; indice != null ; indice = indice.getEnlace()) {
        for (segundo = indice ; segundo != null ; segundo = segundo.getEnlace()) {
          if (indice.getValue() > segundo.getValue()) {
            int num = segundo.getValue();
            int num2 = indice.getValue();
            indice.setValue(num);
            segundo.setValue(num2);
          }
        }
      }
    }

    public void acomodar_acendente_insercion(){
      Nodo indice, segundo;
      for (indice = primero; indice != null ; indice = indice.getEnlace()) {
        segundo = primero;
        int n1 = indice.getValue();
        while(segundo != null && segundo != indice.getEnlace()){
          int n2 = segundo.getValue();
          if (n1 < n2) {
            agregar_en_medio(n2,n1);
          }
          if (segundo != null ) {
            segundo = segundo.getEnlace();
          }
        }
      }
    }

    public Lista agregar_como_ultimo(int valor){
      Nodo indice, ultimo;
      indice = primero;
      if (indice != null) {
        while(indice.getEnlace() != null){
          indice = indice.getEnlace();
        }
        ultimo = new Nodo(valor);
        indice.setEnlace(ultimo);
      }
      return this;
    }

    public Nodo buscar_elemento(int busco){
      Nodo indice;
      for (indice = primero; indice != null ; indice = indice.getEnlace()) {
        if (busco == indice.getValue()) {
          return indice;
        }
      }
      return null;
    }

    public void eliminar(int dato){
      Nodo actual, anterior;
      boolean encontrado;
      actual = primero;
      anterior = null;
      encontrado = false;

      while((actual != null) && (!encontrado) ){
        encontrado = (actual.getValue() == dato);
        if (!encontrado) {
          anterior = actual;
          actual = actual.getEnlace();
        }
      }
      if (actual != null) {
        if (actual == primero) {
          primero = actual.getEnlace();
        }else{
          anterior.setEnlace(actual.getEnlace());
        }
        actual = null;
      }
    }

    public void mostrar_lista(){
      Nodo n;

      n = primero;
      while (n != null) {
        System.out.println("Dato: "+n.getValue()+" Enlace: "+ n.getEnlace());
        n = n.getEnlace();
      }
    }
}
