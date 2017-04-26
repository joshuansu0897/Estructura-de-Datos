package arbol;

public class Principal {
    public static void main(String[] args){
        ArbolBinario arbol = new ArbolBinario();
        Nodo n1,n2,n3,n4,n5,n6,n7;

        n1 = arbol.nuevoArbol(null, "M", null);
        n2 = arbol.nuevoArbol(null, "R", null);
        n3 = arbol.nuevoArbol(n1, "E", n2);

        n4 = arbol.nuevoArbol(null, "A", null);
        n5 = arbol.nuevoArbol(null, "B", null);
        n6 = arbol.nuevoArbol(n4, "MJ", n5);

        n7 = arbol.nuevoArbol(n3, "L", n6);

        ArbolBinario arbola = new ArbolBinario(n7);

        System.out.println(n7.getValorNodo());
        System.out.println(n7.getSubArbolIzq().getValorNodo()+"\t"+n7.getSubArbolDer().getValorNodo());
        System.out.println();
        Imprimir.printNodo(n7);

    }

}
