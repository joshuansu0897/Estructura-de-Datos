package arbol;

public class Principal {
    public static void main(String[] args){
        ArbolBinario arbol = new ArbolBinario();
        Nodo n1,n2,n3,n4,n5,n6,n7;

        n1 = arbol.nuevoArbol(null, "Maria", null);
        n2 = arbol.nuevoArbol(null, "Rodrigo", null);
        n3 = arbol.nuevoArbol(n1, "Esperanza", n2);

        n4 = arbol.nuevoArbol(null, "Anyora", null);
        n5 = arbol.nuevoArbol(null, "Abel", null);
        n6 = arbol.nuevoArbol(n4, "M.Jesus", n5);

        n7 = arbol.nuevoArbol(n3, "Laura", n6);

        ArbolBinario arbola = new ArbolBinario(n7);

        System.out.println(n7.getValorNodo());
        System.out.println(n7.getSubArbolIzq().getValorNodo()+"\t"+n7.getSubArbolDer().getValorNodo());

    }

}
