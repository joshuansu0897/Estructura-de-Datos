def quicksort(array, from=0, to=nil)
    if to == nil
        # ajusta el arreglo
        to = array.count - 1
    end

    if from >= to
        # termino de acomodar
        return
    end

    # toma el pivote, el mas lejano a la izquierda
    pivot = array[from]

    # guarda el max, y el min
    min = from
    max = to

    # posicion actual
    free = min

    while min < max
        if free == min # evaluamos array[max]
            if array[max] <= pivot # si es mas peque;o que el pivote, debe moverse
                array[free] = array[max]
                min += 1
                free = max
            else
                max -= 1
            end
        elsif free == max # evaluamos array[min]
            if array[min] >= pivot # si es mas grande que el pivote, debe moverse
                array[free] = array[min]
                max -= 1
                free = min
            else
                min += 1
            end
        else
            raise "Inconsistent state"
        end
    end

    array[free] = pivot

    quicksort array, from, free - 1
    quicksort array, free + 1, to
end

a = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15].shuffle

puts "antes de quicksort"
puts a
# Quicksort trabaja sobre el mismo arreglo
# o sea, no debe reasignarse a otra variable
quicksort a
puts "despues quicksort"
puts a