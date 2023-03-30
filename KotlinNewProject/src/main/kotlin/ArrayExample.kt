fun main(args:Array<String>){
var array1= arrayOf(1,2,3,4,5,6)
    var m: IntArray = intArrayOf(1,2,3,4,5,6,7)

    var arr3= arrayOf<String>("ruksana","charan","cherry","rukku")
   var arr4= arrayOf<Char>('a','b','c','d')
    var myArray = Array<Int>(5){0}
    myArray.set(0,10)
    myArray.set(1,20)
    myArray.set(2,30)
    myArray.set(3,40)
    myArray.set(4,50)
 for(values in myArray){
     println("ctt values:"+values)
 }
    for(values1 in array1){
        println("Integer values:"+values1)
    }
    for(values2 in arr3){
        println("string values:"+values2)
    }
    for(values3 in arr4) {
        println("char values:" + values3)
    }
    for(index in 0..4){
        println("values:"+index)
    }

    for(index in 1..m.size-1){
        println("total values:"+index)
    }
}