package com.example.basicscode



fun main(args:Array<String>){
  var obj=FruitImp()
    obj.banana()
    obj.orange()
    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    println(map)
    for (i in 1..100) { println("i values are:$i") }  // closed range: includes 100
    for (i in 1 until 100) {println("values of until:$i")  } // half-open range: does not include 100
        for (x in 2..10 step 2) {
            println("values of step:$x")
        }
        for (x in 10 downTo 1) {
            println("values of downTo:$x")
        }
        (1..10).forEach { i ->
            i
            println(i)
        }

}
        //abstract classes
        abstract class Fruit {
            abstract fun orange()
            abstract fun banana()
        }

        class FruitImp : Fruit() {
            override fun orange() {
                println("color of orange is green")
            }

            override fun banana() {
                println("color of banana is yellow")
            }

        }

