fun main(args:Array<String>){
    println  ("checking containMathIn example.....")
    var reg=Regex(pattern ="ruk")
    var reg1=reg.containsMatchIn("ruksana")
    println(reg1)
    println()
    println("containMathIn example......")
    var reg2="""rukku@123""".toRegex()
    var reg3=reg2.containsMatchIn("rukku@123i")
    println(reg3)
}