def mergesort(array)
    if array.count <= 1
        # Array of length 1 or less is always sorted
        return array
    end

    # tenemos que "Dividir y Acomodar" 

    # 1. Divide
    mid = array.count / 2
    part_a = mergesort array.slice(0, mid)
    part_b = mergesort array.slice(mid, array.count - mid)

    # 2. Acomoda
    array = []
    offset_a = 0
    offset_b = 0
    while offset_a < part_a.count && offset_b < part_b.count
        a = part_a[offset_a]
        b = part_b[offset_b]

        # toma el mas peque;o de los dos y lo mete en el array
        if a <= b
            array << a
            offset_a += 1
        else
            array << b
            offset_b += 1
        end
    end

    # siempre queda un elemento en part_a o part_b (nunca en los dos)
    while offset_a < part_a.count
        array << part_a[offset_a]
        offset_a += 1
    end

    while offset_b < part_b.count
        array << part_b[offset_b]
        offset_b += 1
    end

    return array
end

b = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15].shuffle
puts "antes de mergesort"
puts b
# Mergesort trabaja en un nuevo array
# por lo tanto necesitamos asignarlo
b = mergesort b
puts "despues mergesort"
puts b