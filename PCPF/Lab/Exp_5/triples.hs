triples:: (Int, Int, Int) -> [(Int, Int, Int)]
triples (x, y, z) = [(m, n, o) | m <- [1..x], n <- [1..y], o <- [1..z], ((m^2)+(n^2)) == (o^2), m <n, n<o]