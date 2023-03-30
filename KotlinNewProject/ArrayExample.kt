fun main(args:Array<String>){
    var v1=arryOf(5,6,7,8)
    var v2= arrayOf<String>("apple","banana","carrot","orange")
   var first= v1.set(0,10)
     v2.get(3)
     for(one in v1){
      println("$one")
    }
    for(two in v2){
        println("$two")
    }
    val name = arrayOf<String>("Ajay","Prakesh","Michel","John","Sumit")
    var myArray2 = arrayOf<Int>(1,10,4,6,15)
    var myArray3 = arrayOf(5,10,20,12,15)
    var myArray4= arrayOf(1,10,4, "Ajay","Prakesh")
    var myArray5: IntArray = intArrayOf(5,10,20,12,15)

    for(element in name){
        println(element)
    }

     for(element in myArray2){
        println(element)
    }
     for(element in myArray3){
        println(element)
    }
     for(element in myArray4){
        println(element)
    }
     for(element in myArray5){
        println(element)
    }

}