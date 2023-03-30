package com.range



fun main(args:Array<String>){
    println("dot range...")
    var range=1..5
    for(r1 in range){
        println("dot range:${r1}")
        println("3 is in range${3 in range}")
    }
    println("")
    println("decreaseing order....")
    var range1=5 downTo 1
    for(down in range1){
        println("downto method:${down}")
    }
    println("")
    println("character range...")
    var char='A'..'Z'
    for(ch in char){
        println("characters:${ch}")
    }
    println("")
    println("util range...")
     for(r in 'a'.until('z')){
        println("util:${r}")
    }
    println()
    println("step range....")
    for (x in 1.rangeTo(10)step 2)
        print("step:${x}")
    println()
    println("Reversed 2")
    var range2: IntRange = IntRange(1,5)
    for (x in range2.reversed()){
        print("$x ")
    }
    println()
    println("iterator..")
    var v='a'..'k'
    var it =v.iterator()
    while (it.hasNext()){
        println(it.next())
    }
}