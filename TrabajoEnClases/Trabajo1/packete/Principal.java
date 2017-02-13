package packete;

class Principal {
  public static void main(String[] args) {
    Lista lista = new Lista();
    lista.agregar_cabeza_lista(20).agregar_cabeza_lista(40);
    lista.agregar_cabeza_lista(16);
    lista.agregar_como_ultimo(100);
    lista.agregar_cabeza_lista(30);
    lista.mostrar_lista();
    lista.agregar_en_medio(16,66);
    lista.mostrar_lista();
    lista.agregar_como_ultimo(99);
    lista.mostrar_lista();
    lista.eliminar(40);
    lista.mostrar_lista();
  }
}
