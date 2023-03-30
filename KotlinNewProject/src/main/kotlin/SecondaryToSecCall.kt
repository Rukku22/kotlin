class SecondaryToSecCall {
    constructor(id:Int,name:String):this("pass"){
        println("id:${id}")
        println("name:${name}")
    }
    constructor(password:String){
        println("password:${password}")
     }

}
fun main(args:Array<String>){
    val v1=SecondaryToSecCall(1,"charan")
}