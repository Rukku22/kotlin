fun main(args:Array<String>){
    var list= listOf(1,2,3,"apple","mango",5.6,7.00)
    var intList: List<Int> = listOf<Int>(1,2,3)
    var stringList:List<String> =listOf<String>("ruksana","sravani","ammu","chitti")
    var anyList:List<Any> = listOf<Any>(2,3,4,4,"apple","banana","mango")
    println("list of any:$anyList")
    println("list of integer:$intList")
    println("list of string:$stringList")
    println("list value:"+list.get(6))
    println("index value of apple:"+list.indexOf("apple"))
    println("index of element in mango:"+list.lastIndexOf("mango"))
    println("size of list:"+list.size)
    println("name contain or not:"+list.contains("Prakash"))
    println("contains alllist:"+list.containsAll(list))
    println("sublist:"+list.subList(2,4))
    println("is empty:"+list.isEmpty())
    println("drop:"+list.drop(1))
    println("droplast:"+list.dropLast(2))


}