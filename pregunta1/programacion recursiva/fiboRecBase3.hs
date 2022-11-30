fibo::Int->Int

fibo 1 = 0
fibo 2 = 1 
fibo 3 = 1
fibo n = fibo (n-1) + fibo(n-2) + fibo(n-3)

listFibonnaci::Int->[Int]
listFibonnaci n = [fibo i | i <- [1..n]]
