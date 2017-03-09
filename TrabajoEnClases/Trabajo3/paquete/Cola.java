package paquete;

public class Cola{
    int tama = 20;
    int frente;
    int fin;
    int [] listaCola;

    Cola(){
        frente = 0;
        fin = -1;
        listaCola = new int [tama];
    }

    void agregar(int valor){
      if (!llena()) {
        listaCola[++fin] = valor;
      }else{
        System.out.println("Cola llena");
      }
    }

    int quitar(){
      if (!vacio()) {
        return listaCola[frente++];
      }else{
        System.out.println("esta vacia, no puedes borrar");
        return 0;
      }
    }

    boolean llena(){
      return tama-1 == fin;
    }

    boolean vacio(){
      return fin == -1;
    }
}
