#module arbol
#require_relative 'Nodo'

require 'java'
java_import 'ruby.Nodo'

  class ArbolBinario
    @raiz

    def initialize(raiz = nil)
      @raiz = raiz
    end

    def raiz
      @name
    end

    def raiz=(val)
      @name = val
    end

    def is_empty
      @raiz == nil
    end

    def nuevo_arbol(hijo_izq, valor, hijo_der)
      Nodo.new(hijo_izq, valor, hijo_der)
    end
  end
#end
