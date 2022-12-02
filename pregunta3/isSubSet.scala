object Sub{ 
    def isSubSet(lis1 : List[Int], lis2 : List[Int]) : Boolean = {
        var set1 = lis1.toSet
        var set2 = lis2.toSet 
        return  set2.subsetOf(set1)
    }
} 