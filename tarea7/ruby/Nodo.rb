#los dos doc nodos sirven solo que tengo el de java, para poder usar la clase imprimir, nada mas por eso
#dio flojera hacerla otra vez en ruby, es mucho

#module Nodo
  class Nodo
    @dato
    @izq
    @der

    def initialize(hijo_izq, valor, hijo_der)
      @dato = valor;
      @izq = hijo_izq;
      @der = hijo_der;
    end

    def valor_nodo()
      @dato;
    end

    def sub_arbol_izq()
      @izq;
    end

    def sub_arbol_der()
      @der;
    end

    def valor_nodo=(valor)
      @dato = valor;
    end

    def sub_arbol_izq=(n)
      @izq = n;
    end

    def sub_arbol_der=(n)
      @der = n;
    end
  end
#end
