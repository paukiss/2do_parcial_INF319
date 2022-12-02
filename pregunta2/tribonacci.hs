fiboTuples::Int -> [(Int, Int, Int)]
fiboTuples n = (take n $ iterate f (0,1,1)) where f (x,y,z) = (y,z, x+y+z)

tribo::Int->[Int]
tribo n = [x | (x,y,z) <- fiboTuples n]