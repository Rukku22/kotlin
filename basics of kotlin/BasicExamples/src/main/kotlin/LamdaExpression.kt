fun main(args:Array<String>){
    val lamda: (Int) -> Unit= {s: Int -> println(s) }
    addvalue(1,"rukku",lamda)

}
fun addvalue(num:Int,num1:String,lamda:(Int)->Unit){
    println("string variable:$num1 and id:$num")
}