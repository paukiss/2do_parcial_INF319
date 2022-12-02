object Fibonacci {
    def fibo(n : Int) : Int={
        if (n == 1) return 0
        if (n == 2 || n == 3) return 1
        return fibo(n-1)+fibo(n-2)+fibo(n-3)
    }

    def list(n : Int) : String = {
        var cad = ""
        for (x <- 1 to n){
          cad += fibo(x) + " "
        }
        return cad
    }
}