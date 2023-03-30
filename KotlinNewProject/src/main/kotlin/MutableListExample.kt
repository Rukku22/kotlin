fun main(args:Array<String>){
    var mutableList= mutableListOf<Int>()
    var mutableList1= mutableListOf<String>()
    var mutableList2= mutableListOf<Any>()
    mutableList.add(0,100)
    mutableList.add(1,200)
    mutableList.add(2,300)
    mutableList.remove(0)
    mutableList.add(3,400)
    mutableList1.add("ball")
    mutableList1.add("bat")
    mutableList1.add("box")
    mutableList1.add("tennicat")
    mutableList2.add(0,1)
    mutableList2.add(1,2)
    mutableList2.add(2,3)
    mutableList2.add(3,4)
    mutableList2.add("abc")
    mutableList2.add("def")
    mutableList2.add("ghi")
    mutableList2.set(3,"sports")
    println("print list of integer....")

    for(int1 in mutableList ){
          println(int1)
    }
    println()
    println("print list of string....")
    for(int1 in mutableList1 ){

        println(int1)
    }
    println()

    println("print list of any....")

    for(int1 in mutableList2 ) {
        println(int1)
    }
    println()
    for(int1 in mutableList2){
        println("size any list"+mutableList.size)
    }
    println("Integer list is empty or not:"+mutableList.isEmpty())
}
