fun main(args:Array<String>){
    var a=100
    println("apple one kg price:$a")
  sum()
}
fun sum(){
    var b=10
    val c=20
    val result=b+c
    println("sum of two apples:"+result)
     m2()
    parameterm1(20,5)
}
fun parameterm1(num1:Int,num2:Int){
    var sq=Math.sqrt(num1-num2.toDouble())
    println("square root of num:$sq")
}
fun m2(){
    println("thank you for ur purchase")
}