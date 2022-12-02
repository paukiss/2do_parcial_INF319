sieve :: [Int]
sieve = sieve [2..]
  where
    sieve (p:xs) = p : sieve [x|x <- xs, x `mod` p > 0]

listPrime::Int->[Int]
listPrime n = (take n $ sieve)