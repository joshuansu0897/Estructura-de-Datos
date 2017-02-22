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
    if (!full()) {
      listapila[++cima] = valor;
    }else{
      System.out.println("Pila llena morro, no puedes meter mas valores");
    }
  }

  int pop(){
    if (!empty()) {
      return listapila[cima--];
    }else{
      System.out.println("esta vacia no puedes borrar");
      return 0;
    }
  }

  int getTama(){
    return listapila.length;
  }

  boolean full(){
    return cima == listapila.length-1;
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
    if (!empty()) {
      return listapila[cima];
    }else{
      System.out.println("no tienes datos que mostrar");
      return 0;
    }
  }


}
