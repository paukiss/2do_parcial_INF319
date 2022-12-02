object Prime{

    def isPrime(n : Int) : Boolean = {
        if (n < 2) return false
        if (n == 2) return true
        if (n % 2 == 0) return false
        var i = 3
        while (i < n){
            if (n % i == 0)
                return false
            i += 1
        }
        return true
    }
    def listPrimes(n : Int) : Array[Int] = {   
        var cont = 0
        var lis = new Array[Int](n)
        var num = 2
        while (cont < n) {
            if (isPrime(num)){
                lis(cont) = num
                cont += 1
            }
            num += 1
        }
        return lis
  }
}
