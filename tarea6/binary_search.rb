# Buscar un valor en un arreglo arreglo ordenado en O (lg (n))
def binary_search(array, valor, from=0, to=nil)
    if to == nil
        to = array.count - 1
    end

    mid = (from + to) / 2

    if valor < array[mid]
        return binary_search(array, valor, from, mid - 1)
    elsif valor > array[mid]
        return binary_search(array, valor, mid + 1, to)
    else
        return mid
    end
end

b = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]
a = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]

offset_3 = binary_search(a, 3)
puts "3 se encuentra en la posicion #{offset_3} dentro del arreglo a"

offset_15 = binary_search(b, 15)
puts "15 se encuentra en la posicion #{offset_15} dentro del arreglo b"
