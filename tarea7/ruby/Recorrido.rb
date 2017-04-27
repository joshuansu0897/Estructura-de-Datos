require_relative 'Nodo'

def preorden(a)
  if(a != nil)
    print "#{a.getValorNodo()} "
    preorden a.getSubArbolIzq()
    preorden a.getSubArbolDer()
  end
end

def inorden(a)
  if(a != nil)
    inorden(a.getSubArbolIzq())
    print "#{a.getValorNodo()} "
    inorden(a.getSubArbolDer())
  end
end

def postorden(a)
  if(a != nil)
    postorden(a.getSubArbolIzq());
    postorden(a.getSubArbolDer());
    print "#{a.getValorNodo()} "
  end
end
