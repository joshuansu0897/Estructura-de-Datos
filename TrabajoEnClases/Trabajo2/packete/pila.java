package packete;

public class pila{
  int tama = 30;
  int cima;
  int [] listapila;

  pila(){
    cima = -1;
    listapila = new int [tama];
  }

  pila(int num){
    cima = -1;
    listapila = new int [num];
    System.out.println("Creaste una pila de tama;o: "+num);
  }

  void push(int valor){
    listapila[++cima] = valor;
  }

  int pop(){
    if (!empty()) {
      return listapila[cima--];
    }else{
      System.out.println("esta vacia no puedes borrar");
      return 0;
    }
  }

  boolean full(){
    if (cima == listapila.length-1) {
      return true;
    }else{
      return false;
    }
  }

  boolean empty(){
    return cima == -1;
  }

  void print_pila(){
    for (int i=0; i<cima ; i++ ) {
      System.out.println(listapila[i]);
    }
  }

  int cima_value_pila(){
    return listapila[cima];
  }


}
