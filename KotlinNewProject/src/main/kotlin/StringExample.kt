fun main(args:Array<String>){
    val ch= charArrayOf('a','b','c','d','e','f')
    var str="hello"
    val a=10
    val b=20

    val c=String(ch)
    println(c)
    println(str[1])
    println("length of chars:${ch.size}")
    println("length of word:${str.length}")
val raw="""
    value $a is less than $b
    |value $b is greater than $a
""".trimMargin()
    println("${raw.trimMargin()}")
fun m1(){
    val v1="hello"
    val  v2="hel"
    if(v1==v2){
        println("both are equals")
    }else{
        println("not equals")
    }
}
}