package arbol;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Imprimir {

    public static void printNodo(Nodo root) {
        int maxLevel = Imprimir.maxLevel(root);

        printNodoInternal(Collections.singletonList(root), 1, maxLevel);
    }

    private static void printNodoInternal(List<Nodo> nodes, int level, int maxLevel) {
        if (nodes.isEmpty() || Imprimir.isAllElementsNull(nodes)) {
            return;
        }

        int floor = maxLevel - level;
        int endgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0)));
        int firstSpaces = (int) Math.pow(2, (floor)) - 1;
        int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;

        Imprimir.printWhitespaces(firstSpaces);

        List<Nodo> newNodos = new ArrayList<Nodo>();
        for (Nodo node : nodes) {
            if (node != null) {
                System.out.print(node.getValorNodo());
                newNodos.add(node.getSubArbolIzq());
                newNodos.add(node.getSubArbolDer());
            } else {
                newNodos.add(null);
                newNodos.add(null);
                System.out.print("\t");
            }

            Imprimir.printWhitespaces(betweenSpaces);
        }
        System.out.println("");

        for (int i = 1; i <= endgeLines; i++) {
            for (int j = 0; j < nodes.size(); j++) {
                Imprimir.printWhitespaces(firstSpaces - i);
                if (nodes.get(j) == null) {
                    Imprimir.printWhitespaces(endgeLines + endgeLines + i + 1);
                    continue;
                }

                if (nodes.get(j).getSubArbolIzq() != null) {
                    System.out.print("/");
                } else {
                    Imprimir.printWhitespaces(1);
                }

                Imprimir.printWhitespaces(i + i - 1);

                if (nodes.get(j).getSubArbolDer() != null) {
                    System.out.print("\\");
                } else {
                    Imprimir.printWhitespaces(1);
                }

                Imprimir.printWhitespaces(endgeLines + endgeLines - i);
            }

            System.out.println("");
        }

        printNodoInternal(newNodos, level + 1, maxLevel);
    }

    private static void printWhitespaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }

    private static int maxLevel(Nodo node) {
        if (node == null) {
            return 0;
        }

        return Math.max(Imprimir.maxLevel(node.getSubArbolIzq()), Imprimir.maxLevel(node.getSubArbolDer())) + 1;
    }

    private static <T> boolean isAllElementsNull(List<T> list) {
        for (Object object : list) {
            if (object != null) {
                return false;
            }
        }

        return true;
    }
}
