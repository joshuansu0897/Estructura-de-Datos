require 'java'
require_relative "ArbolBinario"
java_import 'ruby.Imprimir'
require_relative "Nodo"
require_relative 'Recorrido'

arbol = ArbolBinario.new

n1 = arbol.nuevo_arbol(nil, "s", nil)
n2 = arbol.nuevo_arbol(nil, "a", nil)
n3 = arbol.nuevo_arbol(n1, "e", n2)

n4 = arbol.nuevo_arbol(nil, "f", nil)
n5 = arbol.nuevo_arbol(nil, "g", nil)
n6 = arbol.nuevo_arbol(n4, "h", n5)

n7 = arbol.nuevo_arbol(n3, "p", n6)

puts "Arbol"
Imprimir.printNodo(n7)

preorden(n7)
puts "Preorden"

inorden(n7)
puts "Inorden"

postorden(n7)
puts "Postorden"
