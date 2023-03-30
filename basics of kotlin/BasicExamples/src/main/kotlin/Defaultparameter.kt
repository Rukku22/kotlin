fun main(args:Array<String>){
   m1()
 m2(3)
   // m3('h')
    m4(latter = 'a')
}
fun m1(n:Int=4,latter:Char='r'){
    println("dafalt parameter:$n and $latter")

}
fun m2(n1:Int=5,latter:Char='c'){
    println("with one parameter:$n1 and $latter")
}
/*fun m3(n2:Int=6,latter:Char='h'){
    println("err throws")
}*/
fun m4(n3:Int=3,latter:Char='k'){
    println("for latter call funtion :$n3 and $latter")
}