subConjunto :: Eq a => [a] -> [a] -> Bool
subConjunto [] [] = True
subConjunto _ []  = False
subConjunto [] _  = True
subConjunto (x:xs) (y:ys) 
    | x == y    = subConjunto xs ys   
    | otherwise = subConjunto (x:xs) ys