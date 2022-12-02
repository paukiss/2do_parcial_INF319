object Fibonacci{
    def list3(n:Int) : Array[Int] = {
        var x = -1
        var y = 1
        var z = 0
        var res = -1
        var cont = 0
        var lis = new Array[Int](n)
        while (cont < n){
           res = x + y + z 
           lis(cont) = res 
           x = y 
           y = z 
           z = res
           cont += 1
        }
        return lis
    }    
}